package net.sf.freecol.common.model;

import net.sf.freecol.util.test.FreeColTestCase;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.security.acl.Owner;
import java.util.HashSet;

public class UnitWasTest extends FreeColTestCase{
	private Game myGame;
	private Unit myUnit;
	private Game testGame;
	private String unitID;
	private UnitWas unitWas;
	private Specification mySpecs;
	private UnitType myType;
	private Role myRole;
	private GoodsType myGoodsType;
	private Colony location;
	private HashSet<Ability> abilities;
	private static final Ability ABILITY = new Ability("model.ability.independenceDeclared");
	private static final int ROLE_COUNT = 1;
	private static final int MOVES_LEFT = 2;
	private static final int WORK_LEFT = 3;
	
	@Mock
	private Player myOwner;
	private UnitWas sameUnitWas;
	private UnitWas differentUnitWas;
	
	@Override
	protected void setUp() throws Exception{
		abilities = new HashSet<>();
		testGame = getGame();
		unitID = "unit";
		mySpecs = new Specification();
		myType = new UnitType(unitID, mySpecs);
		myUnit = new Unit(testGame);
		myRole = new Role(unitID, mySpecs);
		myGoodsType = new GoodsType(unitID, mySpecs);
		//location = mock(Colony.class);
//		when(location.)
		myUnit.setId(unitID);
		myUnit.setType(myType);
		myUnit.setRole(myRole);
		myUnit.setRoleCount(ROLE_COUNT);
		myUnit.setWorkType(myGoodsType);
		myUnit.setMovesLeft(MOVES_LEFT);
		myUnit.setWorkLeft(WORK_LEFT);
		abilities.add(ABILITY);
		myOwner = mock(Player.class);
		when(myOwner.getAbilities(anyString(), anyObject(), anyObject())).thenReturn(abilities);
		myUnit.setOwner(myOwner);
	}
	
	@Override
	protected void tearDown() throws Exception {
		myUnit = null;
		unitWas = null;
		super.tearDown();
	}

	/**
	 * Tests the constructor to see if the units values are the same once they are stored in the unitWas object.
	 */
	public void testConstructor() {
		unitWas = new UnitWas(myUnit);
		
		assertEquals(unitWas.getUnit(), myUnit);
		assertEquals(unitWas.getWorkType(), myGoodsType);
		//assertEquals(unitWas.getLocation(), location);
	}
	
	/**
	 * Tests whether the fireChanges method returns true when something changes, and false when nothing changes.
	 * 
	 * TODO: Finish test case. Figure out how the location actually works and try to mock it in the setup method.
	 */
	public void testFireChanges() {
		unitWas = new UnitWas(myUnit);
		
		assertTrue(unitWas.fireChanges());
	}
	
	/**
	 * Tests the compareTo method of the UnitWas class. Essentially, what is going on is that
	 * a location of type Europe (which is a child of UnitLocation) is being used as the location
	 * for the actual UnitWas class object that we are trying to test. Since we do not care about
	 * an actual location object being used in the other UnitWas object (sameUnitWas), we create a 
	 * spy that has access to all of the methods of the Europe class without needing actual data
	 * in it to work. This allows for us to bypass setting up many different data fields in the location
	 * object. By mocking the sameUnitWas class, we do not need to instantiate it with the constructor,
	 * ensuring that we have the smallest amount of dependencies in this test on outside classes. The 
	 * when() method allows us to stub the method call for getLocation() with our spy that way we 
	 * do not use the same instance of Europe as location, but a different object instance, in this 
	 * case mySpy.
	 * 
	 * Yay Mockito!
	 */
	public void testCompareTo() {
		Europe location = new Europe(testGame, myOwner);
		Europe mySpy = spy(location);
		myUnit.setLocation(location);
		unitWas = new UnitWas(myUnit);
		
		sameUnitWas = mock(UnitWas.class);
		when(sameUnitWas.getLocation()).thenReturn(mySpy);
		
		assertTrue(unitWas.compareTo(sameUnitWas) == 0);
	}
}
