package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.HighScore.ScoreLevel;
import net.sf.freecol.server.model.ServerUnit;
import net.sf.freecol.util.test.FreeColTestCase;


import java.util.ArrayList;

import net.sf.freecol.common.i18n.Messages;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.util.Date;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;

import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>HighScoreTest</code> contains tests for the class <code>{@link HighScore}</code>.
 *
 * @author Andrew Knickman
 */
public class HighScoreTest extends FreeColTestCase{
	/**
	 * Run the HighScore(Player,Date) constructor test.
	 */
	@Test
	public void testHighScore_1()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
        player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);

		assertEquals(1,player.getScore());
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(Player,Date) constructor test.
	 */
	@Test
	public void testHighScore_2()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.setIndependentNationName("Test Rebels");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);
		
		assertEquals(1,player.getScore());
		assertNotNull(result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 */
	@Test
	public void testCheckHighScore()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.setIndependentNationName("Test Rebels");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		Date theDate = new Date();
		
		HighScore score = new HighScore(player, theDate);
		
		List<HighScore> scores = new ArrayList<HighScore>();
		
		scores.add(score);

		boolean result = HighScore.checkHighScore(score.getScore(), scores);

		assertTrue(result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 */
	@Test
	public void testCompareTo()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player 1");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land 1");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		
		Colony otherColony = getStandardColony(3, 2, 2); 
		Player otherPlayer = otherColony.getOwner();
		otherPlayer.setName("Test Player 2");
		otherPlayer.setScore(2);
		otherPlayer.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		otherPlayer.setNewLandName("Test Land 2");
		otherPlayer.nationId = "model.nation.dutch";
		otherPlayer.playerType = Player.PlayerType.COLONIAL;
		HighScore other = new HighScore(player, new Date());
		
		int result = fixture.compareTo(other);

		assertEquals(1, result);
	}

	/**
	 * Run the int getColonies() method test.
	 */
	@Test
	public void testGetColonies()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		int result = fixture.getColonies();

		assertEquals(1, result);
	}

	/**
	 * Run the Date getDate() method test.
	 */
	@Test
	public void testGetDate()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		Date now = new Date();
		HighScore fixture = new HighScore(player, now);

		Date result = fixture.getDate();

		assertTrue(result == now);
	}

	/**
	 * Run the String getDifficulty() method test.
	 */
	@Test
	public void testGetDifficulty()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String difficulty = player.getGame().getSpecification().getDifficultyLevel();
		
		String result = fixture.getDifficulty();
		
		assertTrue(result.equals(difficulty));
	}

	/**
	 * Run the int getIndependenceTurn() method test.
	 */
	@Test
	public void testGetIndependenceTurn()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

        Game game = player.getGame();
        player.changePlayerType(Player.PlayerType.INDEPENDENT);
        int independenceTurn = game.getTurn().getNumber();
        
		int result = fixture.getIndependenceTurn();
		
		assertEquals(independenceTurn, result);
	}

	/**
	 * Run the HighScore.ScoreLevel getLevel() method test.
	 */
	@Test
	public void testGetLevel()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(30001);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		HighScore.ScoreLevel result = fixture.getLevel();

		assertTrue(result == ScoreLevel.STATE);
	}

	/**
	 * Run the String getNationId() method test.
	 */
	@Test
	public void testGetNationId()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getNationId();
		
		assertTrue(result.equals("model.nation.french"));
	}

	/**
	 * Run the String getNationLabel() method test.
	 */
	@Test
	public void testGetNationLabel()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.setIndependentNationName("Test Rebels");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.INDEPENDENT;

		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getNationLabel();

		assertTrue(result.equals("Test Rebels"));
	}

	/**
	 * Run the String getNationTypeId() method test.
	 */
	@Test
	public void testGetNationTypeId()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getNationTypeId();

		assertTrue(result.equals("model.nationType.cooperation"));
	}

	/**
	 * Run the String getNewLandName() method test.
	 */
	@Test
	public void testGetNewLandName()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getNewLandName();

		assertTrue(result.contentEquals("Test Land"));
	}

	/**
	 * Run the String getOldNationNameKey() method test.
	 */
	@Test
	public void testGetOldNationNameKey()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		
		player.setNation("model.nation.dutch", new Specification());
		
		String result = fixture.getOldNationNameKey();

		assertTrue(result.equals(Messages.nameKey("model.nation.french")));
	}

	/**
	 * Run the String getPlayerName() method test.
	 */
	@Test
	public void testGetPlayerName()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getPlayerName();

		assertTrue(result.contentEquals("Test Player"));
	}

	/**
	 * Run the int getRetirementTurn() method test.
	 */
	@Test
	public void testGetRetirementTurn()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		
		Game game = player.getGame();
		int retirementTurn = game.getTurn().getNumber();
		
		int result = fixture.getRetirementTurn();

		assertEquals(retirementTurn, result);
	}

	/**
	 * Run the int getScore() method test.
	 */
	@Test
	public void testGetScore()
		{
		Colony colony = getStandardColony(3, 1, 8);
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(30000);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		int result = fixture.getScore();
		
		assertEquals(30000, result);
	}

	/**
	 * Run the int getUnits() method test.
	 */
	@Test
	public void testGetUnits()
		{
		Colony colony = getStandardColony(3, 1, 8);
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		
		Map map = getTestMap(spec().getTileType("model.tile.plains"));
        Unit wagon = new ServerUnit(getGame(), map.getTile(9, 10), player, spec().getUnitType("model.unit.wagonTrain"));
		player.addUnit(wagon);

		int result = fixture.getUnits();

		assertEquals(1, result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 */
	@Test
	public void testLoadHighScores()
		{
		Colony colony = getStandardColony(3, 1, 8);
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(200);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		fixture.newHighScore(player);
		
		List<HighScore> result = fixture.loadHighScores();
		
		assertTrue(result.contains(fixture));
		assertFalse(result.isEmpty());
	}

	/**
	 * Run the boolean newHighScore(Player) method test.
	 */
	@Test
	public void testNewHighScore()
		{
		Colony colony = getStandardColony(3, 1, 8);
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(200);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		boolean result = fixture.newHighScore(player);

		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 */
	@Test
	public void testSaveHighScores()
		{
		Colony colony = getStandardColony(3, 1, 8);
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(200);
		player.setNationType(new EuropeanNationType("model.nationType.cooperation", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		fixture.newHighScore(player);
		
		List<HighScore> scores = fixture.loadHighScores();

		boolean result = HighScore.saveHighScores(scores);

		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 */
	@Before
	public void setUp()
		{
	}

	/**
	 * Perform post-test clean-up.
	 */
	@After
	public void tearDown()
		{
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HighScoreTest.class);
	}
}