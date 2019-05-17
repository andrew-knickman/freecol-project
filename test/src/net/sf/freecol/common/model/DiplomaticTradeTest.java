package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.util.Iterator;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>DiplomaticTradeTest</code> contains tests for the class <code>{@link DiplomaticTrade}</code>.
 *
 * @generatedBy CodePro at 5/7/19 4:37 PM
 * @author Andrew Knickman
 * @version $Revision: 1.0 $
 */
public class DiplomaticTradeTest extends FreeColTestCase{
	/**
	 * Run the DiplomaticTrade(Game,Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testDiplomaticTrade_1()
		throws Exception {
		Game game = getGame();
		Element element = new IIOMetadataNode();

		DiplomaticTrade result = new DiplomaticTrade(game, element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the DiplomaticTrade(Game,TradeContext,Player,Player,List<TradeItem>,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testDiplomaticTrade_2()
		throws Exception {
		Game game = getGame();
		DiplomaticTrade.TradeContext context = DiplomaticTrade.TradeContext.CONTACT;
		Player sender = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Player recipient = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		List<TradeItem> items = new ArrayList<TradeItem>();
		int version = 1;

		DiplomaticTrade result = new DiplomaticTrade(game, context, sender, recipient, items, version);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the DiplomaticTrade(Game,TradeContext,Player,Player,List<TradeItem>,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testDiplomaticTrade_3()
		throws Exception {
		Game game = getGame();
		DiplomaticTrade.TradeContext context = DiplomaticTrade.TradeContext.CONTACT;
		Player sender = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Player recipient = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		List<TradeItem> items = null;
		int version = 1;

		DiplomaticTrade result = new DiplomaticTrade(game, context, sender, recipient, items, version);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void add(TradeItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		TradeItem newItem = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		fixture.add(newItem);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void add(TradeItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		TradeItem newItem = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		fixture.add(newItem);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);

		fixture.clear();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the List<Colony> getColoniesGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetColoniesGivenBy_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Colony> result = fixture.getColoniesGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Colony> getColoniesGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetColoniesGivenBy_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Colony> result = fixture.getColoniesGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Colony> getColoniesGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetColoniesGivenBy_3()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Colony> result = fixture.getColoniesGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Colony> getColoniesGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetColoniesGivenBy_4()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Colony> result = fixture.getColoniesGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the DiplomaticTrade.TradeContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetContext_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		DiplomaticTrade.TradeContext result = fixture.getContext();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getGoldGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetGoldGivenBy_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		int result = fixture.getGoldGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getGoldGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetGoldGivenBy_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		int result = fixture.getGoldGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the List<Goods> getGoodsGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetGoodsGivenBy_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Goods> result = fixture.getGoodsGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Goods> getGoodsGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetGoodsGivenBy_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Goods> result = fixture.getGoodsGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Goods> getGoodsGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetGoodsGivenBy_3()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Goods> result = fixture.getGoodsGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Goods> getGoodsGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetGoodsGivenBy_4()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Goods> result = fixture.getGoodsGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<TradeItem> getItemsGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetItemsGivenBy_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<TradeItem> result = fixture.getItemsGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getOtherPlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetOtherPlayer_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Player result = fixture.getOtherPlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getOtherPlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetOtherPlayer_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Player result = fixture.getOtherPlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getReceiveMessage(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetReceiveMessage_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		StringTemplate result = fixture.getReceiveMessage(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getRecipient() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetRecipient_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		Player result = fixture.getRecipient();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getSendMessage(Player,Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetSendMessage_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Colony settlement = new Colony(new Game(new IIOMetadataNode(), ""), "");
		settlement.owner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		StringTemplate result = fixture.getSendMessage(player, settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getSender() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetSender_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		Player result = fixture.getSender();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Stance getStance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetStance_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		Stance result = fixture.getStance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Stance getStance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetStance_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		Stance result = fixture.getStance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the DiplomaticTrade.TradeStatus getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		DiplomaticTrade.TradeStatus result = fixture.getStatus();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<TradeItem> getTradeItems() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetTradeItems_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		List<TradeItem> result = fixture.getTradeItems();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Unit> getUnitsGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetUnitsGivenBy_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Unit> result = fixture.getUnitsGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Unit> getUnitsGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetUnitsGivenBy_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Unit> result = fixture.getUnitsGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Unit> getUnitsGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetUnitsGivenBy_3()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Unit> result = fixture.getUnitsGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Unit> getUnitsGivenBy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetUnitsGivenBy_4()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Unit> result = fixture.getUnitsGivenBy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		int result = fixture.getVersion();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Player getVictim() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetVictim_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		Player result = fixture.getVictim();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getVictim() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetVictim_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		Player result = fixture.getVictim();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = DiplomaticTrade.getXMLElementTagName();

		// add additional test code here
		assertEquals("diplomaticTrade", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void incrementVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testIncrementVersion_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		fixture.incrementVersion();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testIsEmpty_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);

		boolean result = fixture.isEmpty();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testIsEmpty_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		boolean result = fixture.isEmpty();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the Iterator<TradeItem> iterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testIterator_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		Iterator<TradeItem> result = fixture.iterator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_13()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChild_14()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void remove(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		int index = 1;

		fixture.remove(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void remove(TradeItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		TradeItem newItem = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		fixture.remove(newItem);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeType(Class<? extends TradeItem>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testRemoveType_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Class<? extends TradeItem> itemClass = TradeItem.class;

		fixture.removeType(itemClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeType(Class<? extends TradeItem>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testRemoveType_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		Class<? extends TradeItem> itemClass = TradeItem.class;

		fixture.removeType(itemClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeType(Class<? extends TradeItem>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testRemoveType_3()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		Class<? extends TradeItem> itemClass = TradeItem.class;

		fixture.removeType(itemClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setRecipient(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testSetRecipient_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player newRecipient = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setRecipient(newRecipient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setSender(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testSetSender_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player newSender = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setSender(newSender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setStatus(TradeStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testSetStatus_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		DiplomaticTrade.TradeStatus status = DiplomaticTrade.TradeStatus.ACCEPT_TRADE;

		fixture.setStatus(status);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		DiplomaticTrade fixture = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DiplomaticTradeTest.class);
	}
}