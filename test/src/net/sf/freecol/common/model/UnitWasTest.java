package net.sf.freecol.common.model;

import net.sf.freecol.util.test.FreeColTestCase;
import static org.mockito.Mockito.*;

public class UnitWasTest extends FreeColTestCase{
	private Unit myUnit;
	private Game testGame;
	private String unitID;
	private UnitWas unitWas;
	private Specification mySpecs;
	private UnitType myType;
	private Role myRole;
	private GoodsType myGoodsType;
	private static final int ROLE_COUNT = 1;
	private static final int MOVES_LEFT = 2;
	
	@Override
	protected void setUp() throws Exception{
		testGame = getGame();
		unitID = "unit";
		mySpecs = new Specification();
		myType = new UnitType(unitID, mySpecs);
		myUnit = new Unit(testGame);
		myRole = new Role(unitID, mySpecs);
		myGoodsType = new GoodsType(unitID, mySpecs);
		myUnit.setId(unitID);
		myUnit.setType(myType);
		myUnit.setRole(myRole);
		myUnit.setRoleCount(ROLE_COUNT);
		myUnit.setWorkType(myGoodsType);
		myUnit.setMovesLeft(MOVES_LEFT);
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
	}
	
	/**
	 * Tests whether the fireChanges method returns true when something changes, and false when nothing changes.
	 */
	public void testFireChanges() {
		unitWas = new UnitWas(myUnit);
		
		assertTrue(unitWas.fireChanges());
	}
}
