package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
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
public class HighScoreTest {
	/**
	 * Run the HighScore(Player,Date) constructor test.
	 */
	@Test
	public void testHighScore_1
()
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
		
		Colony colony = getStandardColony(3, 2, 2); 
		Player otherPlayer = colony.getOwner();
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
	public void testGetIndependenceTurn_1()
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

		int result = fixture.getIndependenceTurn();
		
		assertEquals(0, result);
	}

	/**
	 * Run the HighScore.ScoreLevel getLevel() method test.
	 */
	@Test
	public void testGetLevel_1()
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

		HighScore.ScoreLevel result = fixture.getLevel();

		assertNotNull(result);
	}

	/**
	 * Run the String getNationId() method test.
	 */
	@Test
	public void testGetNationId_1()
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

		assertNotNull(result);
	}

	/**
	 * Run the String getNationLabel() method test.
	 */
	@Test
	public void testGetNationLabel_1()
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

		String result = fixture.getNationLabel();

		assertNotNull(result);
	}

	/**
	 * Run the String getNationTypeId() method test.
	 */
	@Test
	public void testGetNationTypeId_1()
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

		assertNotNull(result);
	}

	/**
	 * Run the String getNewLandName() method test.
	 */
	@Test
	public void testGetNewLandName_1()
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

		assertNotNull(result);
	}

	/**
	 * Run the String getOldNationNameKey() method test.
	 */
	@Test
	public void testGetOldNationNameKey_1()
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

		String result = fixture.getOldNationNameKey();

		assertNotNull(result);
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

		assertTrue(result.contentEquals("Test Player")));
	}

	/**
	 * Run the int getRetirementTurn() method test.
	 */
	@Test
	public void testGetRetirementTurn_1()
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

		int result = fixture.getRetirementTurn();

		assertEquals(0, result);
	}

	/**
	 * Run the int getScore() method test.
	 */
	@Test
	public void testGetScore_1()
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

		int result = fixture.getScore();
		
		assertEquals(0, result);
	}

	/**
	 * Run the int getUnits() method test.
	 */
	@Test
	public void testGetUnits_1()
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

		int result = fixture.getUnits();

		assertEquals(0, result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 */
	@Test
	public void testLoadHighScores()
		{

		List<HighScore> result = HighScore.loadHighScores();

		assertNotNull(result);
	}

	/**
	 * Run the boolean newHighScore(Player) method test.
	 */
	@Test
	public void testNewHighScore()
		{
		Colony colony = getStandardColony(3, 1, 8); Player player = colony.getOwner();
		player.setScore(1);

		boolean result = HighScore.newHighScore(player);

		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 */
	@Test
	public void testSaveHighScores()
		{
		List<HighScore> scores = null;

		boolean result = HighScore.saveHighScores(scores);

		assertEquals(false, result);
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