package net.sf.freecol.common.model;

import net.sf.freecol.common.model.DiplomaticTrade.TradeContext;
import net.sf.freecol.server.model.ServerUnit;
import net.sf.freecol.util.test.FreeColTestCase;
import net.sf.freecol.common.model.*;
import net.sf.freecol.server.model.ServerUnit;

import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The class <code>DiplomaticTradeTest</code> contains tests for the class <code>{@link DiplomaticTrade}</code>.
 *
 * @generatedBy CodePro at 5/7/19 4:37 PM
 * @author Andrew Knickman
 * @version $Revision: 1.0 $
 */
public class DiplomaticTradeTest extends FreeColTestCase{
	
	
	/**INCLUDES TESTS FOR:
	 * DiplomaticTrade
	 * getContext
	 * getStatus
	 * setStatus
	 * getSender
	 * setSender
	 * getRecipient
	 * setRecipient
	 * getOtherPlayer
	 * getSendMessage
	 * getReceiveMessage
	 * add
	 * remove(TradeItem newItem)
	 * remove(int index)
	 * removeType
	 * clear
	 * getTradeItems
	 * isEmpty
	 * iterator
	 * getItemsGivenBy
	 * getStance
	 * getColoniesGivenBy
	 * getGoldGivenBy
	 * getGoodGivenBy
	 * getVictim
	 * getUnitsGivenBy
	 * getVersion
	 * incrementVersion
	 * toString
	 */

	/**
	 * Run the DiplomaticTrade constructor test with contact context.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testDiplomaticTrade_Contact()
		throws FreeColException {
		Game game = getGame();
		DiplomaticTrade.TradeContext context = DiplomaticTrade.TradeContext.CONTACT;
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4); 
		Player recipient = recipientColony.getOwner();
		List<TradeItem> items = new ArrayList<TradeItem>();
		int version = 1;

		DiplomaticTrade result = new DiplomaticTrade(game, context, sender, recipient, items, version);

		assertNotNull(result);
	}

	/**
	 * Run the DiplomaticTrade constructor test with diplomatic context.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testDiplomaticTrade_Diplomatic()
		throws FreeColException {
		Game game = getGame();
		DiplomaticTrade.TradeContext context = DiplomaticTrade.TradeContext.DIPLOMATIC;
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		List<TradeItem> items = null;
		int version = 1;

		DiplomaticTrade result = new DiplomaticTrade(game, context, sender, recipient, items, version);

		assertNotNull(result);
	}
	
	/**
	 * Run the DiplomaticTrade constructor test with trade context.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testDiplomaticTrade_Trade()
		throws FreeColException {
		Game game = getGame();
		DiplomaticTrade.TradeContext context = DiplomaticTrade.TradeContext.TRADE;
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		List<TradeItem> items = null;
		int version = 1;

		DiplomaticTrade result = new DiplomaticTrade(game, context, sender, recipient, items, version);

		assertNotNull(result);
	}
	
	/**
	 * Run the DiplomaticTrade constructor test with tribute context.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testDiplomaticTrade_Tribute()
		throws FreeColException {
		Game game = getGame();
		DiplomaticTrade.TradeContext context = DiplomaticTrade.TradeContext.TRIBUTE;
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		List<TradeItem> items = null;
		int version = 1;

		DiplomaticTrade result = new DiplomaticTrade(game, 
				context, 
				sender, 
				recipient, 
				items, 
				version);

		assertNotNull(result);
	}
	
	/**
	 * Run the DiplomaticTrade.TradeContext getContext() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetContext()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		Colony newColony = getStandardColony(1,5,5);
		fixture.add(newColony);
		DiplomaticTrade.TradeContext result = fixture.getContext();
		assertTrue(result == TradeContext.CONTACT);
	}
	
	/**
	 * Run the DiplomaticTrade.TradeStatus getStatus() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetStatus()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);		
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		TradeItem newItem = new GoldTradeItem(getGame(), sender, recipient, 1);
		fixture.add(newItem);
		DiplomaticTrade.TradeStatus result = fixture.getStatus();
		assertTrue(result == DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
	}
	
	/**
	 * Run the void setStatus(TradeStatus) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testSetStatus()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		TradeItem newItem = new GoldTradeItem(getGame(), sender, recipient, 1);
		fixture.add(newItem);
		DiplomaticTrade.TradeStatus status = DiplomaticTrade.TradeStatus.REJECT_TRADE;
		fixture.setStatus(status);
		assertTrue(fixture.getStatus() == status)
	}

	/**
	 * Run the Player getSender() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetSender()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		TradeItem newItem = new GoldTradeItem(getGame(), sender, recipient, 1);
		fixture.add(newItem);
		Player result = fixture.getSender();
		assertEquals(sender == result);
	}
	
	/**
	 * Run the void setSender(Player) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testSetSender()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		TradeItem newItem = new GoldTradeItem(getGame(), sender, recipient, 1);
		fixture.add(newItem);
		Colony newColony = getStandardColony(1,5,5);
		Player newSender = newColony.getOwner();
		fixture.setSender(newSender);
		assertEquals(fixture.getSender() == newSender);
	}
	
	/**
	 * Run the Player getRecipient() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetRecipient()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		TradeItem newItem = new GoldTradeItem(getGame(), sender, recipient, 1);
		fixture.add(newItem);
		Player result = fixture.getRecipient();
		assertTrue(recipient == result);
	}
	
	/**
	 * Run the void setRecipient(Player) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testSetRecipient()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Colony newColony = getStandardColony(1,5,5);
		Player newRecipient = newColony.getOwner();
		fixture.setRecipient(newRecipient);
		assertTrue(fixture.getRecipient == newRecipient);
	}

	
	/**
	 * Run the void add(TradeItem) method test with gold trade item.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testAdd_Gold()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		TradeItem newItem = new GoldTradeItem(getGame(), sender, recipient, 1);
		fixture.add(newItem);
		List<TradeItem> items = fixture.getItemsGivenBy(sender);
		assertTrue(items.contains(newItem));
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testClear()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.clear();
		assertTrue(fixture.isEmpty());
	}

	/**
	 * Run the List<Colony> getColoniesGivenBy(Player) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetColoniesGivenBy()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		Colony newColony = getStandardColony(1,5,5);
		fixture.add(new ColonyTradeItem(getGame(), sender, recipient, newColony));

		List<Colony> result = fixture.getColoniesGivenBy(sender);

		assertTrue(result.contains(newColony));
	}
	
	/**
	 * Run the int getGoldGivenBy(Player) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetGoldGivenBy()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new GoldTradeItem(getGame(), sender, recipient, 1);

		int result = fixture.getGoldGivenBy(sender);

		assertEquals(1, result);
	}

	/**
	 * Run the List<Goods> getGoodsGivenBy(Player) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetGoodsGivenBy()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.CONTACT, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);		
				
		Map map = getTestMap(spec().getTileType("model.tile.plains"));
        Unit wagon = new ServerUnit(getGame(), map.getTile(9, 10), sender, spec().getUnitType("model.unit.wagonTrain"));
        Goods newGoods = new Goods(getGame(), wagon, spec().getGoodsType("model.goods.cotton"), 75);
	
		fixture.add(new GoodsTradeItem(getGame(), sender, recipient, newGoods));
		Player player = new Player(getGame(), new IIOMetadataNode());

		List<Goods> result = fixture.getGoodsGivenBy(player);
		
		assertTrue(result.contains(newGoods));
	}
	
	/**
	 * Run the List<Unit> getUnitsGivenBy(Player) method test.
	 *
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetUnitsGivenBy_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(getGame(), new IIOMetadataNode());

		List<Unit> result = fixture.getUnitsGivenBy(player);

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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetOtherPlayer_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(getGame(), new IIOMetadataNode());

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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetReceiveMessage_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(getGame(), new IIOMetadataNode());

		StringTemplate result = fixture.getReceiveMessage(player);

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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetSendMessage_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		Player player = new Player(getGame(), new IIOMetadataNode());
		Colony settlement = new Colony(getGame(), "");
		settlement.owner = new Player(getGame(), new IIOMetadataNode());

		StringTemplate result = fixture.getSendMessage(player, settlement);

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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetStance_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		Stance result = fixture.getStance();

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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetTradeItems_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		List<TradeItem> result = fixture.getTradeItems();

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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetVersion_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testGetVictim_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		Player result = fixture.getVictim();

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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testIncrementVersion_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testIsEmpty_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
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
	 * Run the Iterator<TradeItem> iterator() method test.
	 *
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testIterator_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		Iterator<TradeItem> result = fixture.iterator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}
	
	/**
	 * Run the void remove(int) method test.
	 *
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testRemove_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testRemove_2()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		TradeItem newItem = new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testRemoveType_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
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
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testRemoveType_2()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
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
	 * Run the String toString() method test.
	 *
	 * @throws FreeColException
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	@Test
	public void testToString_1()
		throws FreeColException {
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(getGame(), new IIOMetadataNode()), new Player(getGame(), new IIOMetadataNode()), new ArrayList<TradeItem>(), 1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new ColonyTradeItem(getGame(), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/7/19 4:37 PM
	 */
	/*
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DiplomaticTradeTest.class);
	}*/
}