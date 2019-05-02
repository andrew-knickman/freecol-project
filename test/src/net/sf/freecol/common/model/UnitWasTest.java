package net.sf.freecol.common.model;

import net.sf.freecol.util.test.FreeColTestCase;

public class UnitWasTest extends FreeColTestCase{
	private Unit myUnit;
	private Game testGame;
	private String unitID;
	private UnitWas unitWas;
	private Specification mySpecs;
	private UnitType myType;
	private Role myRole;
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
		myUnit.setId(unitID);
		myUnit.setType(myType);
		myUnit.setRole(myRole);
		myUnit.setRoleCount(ROLE_COUNT);
		myUnit.setWorkType(new GoodsType(unitID, mySpecs));
		myUnit.setMovesLeft(MOVES_LEFT);
	}

	public void testConstructor() {
		unitWas = new UnitWas(myUnit);
		
		assertEquals(myUnit.getId(), unitID);
		assertEquals(myUnit.getType(), myType);
		assertEquals(myUnit.getRole(), myRole);
	}
}
