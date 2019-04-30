package net.sf.freecol.common.model;


public class UnitWasTest extends FreeColTestCase{
	private Unit myUnit;
	private Game testGame;
	private String unitID;
	
	@Override
	public void setUp() {
		testGame = new Game();
		unitID = "";
		myUnit = new Unit(testGame, unitID);
	}

}
