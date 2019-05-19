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
	public void testHighScore_1()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
        player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);

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
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("Test Land");
		player.setIndependentNationName("");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);

		assertNotNull(result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 */
	@Test
	public void testCheckHighScore_1()
		{
		int score = 1;
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.checkHighScore(score, scores);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 */
	@Test
	public void testCheckHighScore_2()
		{
		int score = 1;
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.checkHighScore(score, scores);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 */
	@Test
	public void testCheckHighScore_3()
		{
		int score = -1;
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.checkHighScore(score, scores);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 */
	@Test
	public void testCheckHighScore_4()
		{
		int score = 1;
		List<HighScore> scores = new ArrayList<HighScore>();

		boolean result = HighScore.checkHighScore(score, scores);

		assertEquals(true, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 */
	@Test
	public void testCompareTo_1()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		FreeColObject other = new AbstractGoods();

		int result = fixture.compareTo(other);

		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 * @throws IOException 
	 * @throws XMLStreamException 
	 */
	@Test
	public void testCompareTo_2() throws XMLStreamException, IOException
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());
		FreeColObject other = new HighScore(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		int result = fixture.compareTo(other);

		assertEquals(0, result);
	}

	/**
	 * Run the int getColonies() method test.
	 */
	@Test
	public void testGetColonies_1()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		int result = fixture.getColonies();

		assertEquals(0, result);
	}

	/**
	 * Run the Date getDate() method test.
	 */
	@Test
	public void testGetDate_1()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		Date result = fixture.getDate();

		assertNotNull(result);
	}

	/**
	 * Run the String getDifficulty() method test.
	 */
	@Test
	public void testGetDifficulty_1()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getDifficulty();

		assertNotNull(result);
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
		player.setNationType(new EuropeanNationType("", new Specification()));
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
		player.setNationType(new EuropeanNationType("", new Specification()));
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
		player.setNationType(new EuropeanNationType("", new Specification()));
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
		player.setNationType(new EuropeanNationType("", new Specification()));
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
		player.setNationType(new EuropeanNationType("", new Specification()));
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
		player.setNationType(new EuropeanNationType("", new Specification()));
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
		player.setNationType(new EuropeanNationType("", new Specification()));
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
	public void testGetPlayerName_1()
		{
		Colony colony = getStandardColony(3, 1, 8); 
		Player player = colony.getOwner();
		player.setName("Test Player");
		player.setScore(1);
		player.setNationType(new EuropeanNationType("", new Specification()));
		player.setNewLandName("Test Land");
		player.nationId = "model.nation.french";
		player.playerType = Player.PlayerType.COLONIAL;
		HighScore fixture = new HighScore(player, new Date());

		String result = fixture.getPlayerName();

		assertNotNull(result);
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
		player.setNationType(new EuropeanNationType("", new Specification()));
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
		player.setNationType(new EuropeanNationType("", new Specification()));
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
		player.setNationType(new EuropeanNationType("", new Specification()));
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