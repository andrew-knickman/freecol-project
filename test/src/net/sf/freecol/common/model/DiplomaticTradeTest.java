package net.sf.freecol.common.model;

import net.sf.freecol.common.model.DiplomaticTrade.TradeContext;
import net.sf.freecol.server.model.ServerUnit;
import net.sf.freecol.util.test.FreeColTestCase;
import net.sf.freecol.common.model.*;

import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;


/**
 * The class <code>DiplomaticTradeTest</code> contains tests for the class <code>{@link DiplomaticTrade}</code>.
 *
 * @author Andrew Knickman
 */
public class DiplomaticTradeTest extends FreeColTestCase{

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

		List<Goods> result = fixture.getGoodsGivenBy(sender);
		
		assertTrue(result.contains(newGoods));
	}
	
	/**
	 * Run the List<Unit> getUnitsGivenBy(Player) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetUnitsGivenBy()
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
		
        Unit wagon = new ServerUnit(getGame(), map.getTile(9, 10), sender, spec().getUnitType("model.unit.wagonTrain"));
        UnitTradeItem newUnitItem = new UnitTradeItem(getGame(), sender, recipient, wagon);
        
		fixture.add(newUnitItem);

		List<Unit> result = fixture.getUnitsGivenBy(sender);

		assertTrue(result.contains(newUnitItem));
	}

	/**
	 * Run the Player getOtherPlayer(Player) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetOtherPlayer()
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

		Player result = fixture.getOtherPlayer(sender);

		assertEquals(result == recipient);
	}

	/**
	 * Run the StringTemplate getReceiveMessage(Player) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetReceiveMessage()
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

		StringTemplate result = fixture.getReceiveMessage(sender);

		assertTrue(result == StringTemplate.template("model.diplomaticTrade.receive."
	            + fixture.getContext().getKey())
	            .addStringTemplate("%nation%", player.getNationLabel()));
	}

	/**
	 * Run the StringTemplate getSendMessage(Player,Settlement) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetSendMessage()
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
		Colony newColony = getStandardColony(1,5,5);
		Player newPlayer = newColony.getOwner();

		StringTemplate result = fixture.getSendMessage(sender, newColony);

		assertNotNull(result == StringTemplate.template("model.diplomaticTrade.send."
	            + fixture.getContext().getKey())
	            .addStringTemplate("%nation%",
	                newColony.getOwner().getNationLabel())
	            .addStringTemplate("%settlement%",
	                newColony.getLocationLabelFor(sender)));
	}



	/**
	 * Run the Stance getStance() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetStance()
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

		Stance result = fixture.getStance();

		assertTrue(result == Stance.UNCONTACTED);
	}

	/**
	 * Run the List<TradeItem> getTradeItems() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetTradeItems()
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
		TradeItem newGoldItem = new GoldTradeItem(getGame(), sender, recipient, 1);
		fixture.add(newGoldItem);
		
		List<TradeItem> result = fixture.getTradeItems();

		assertTrue(result.contains(newGoldItem));
	}



	/**
	 * Run the int getVersion() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetVersion()
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
		
		int result = fixture.getVersion();

		assertEquals(1, result);
	}

	/**
	 * Run the Player getVictim() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetVictim()
		throws FreeColException {
		Colony senderColony = getStandardColony(1,3,3);
		Player sender = senderColony.getOwner();
		Colony recipientColony = getStandardColony(1,4,4);
		Player recipient = recipientColony.getOwner();
		DiplomaticTrade fixture = new DiplomaticTrade(getGame(), 
				DiplomaticTrade.
				TradeContext.TRIBUTE, 
				sender, 
				recipient, 
				new ArrayList<TradeItem>(), 
				1);
		fixture.setStatus(DiplomaticTrade.TradeStatus.ACCEPT_TRADE);
		fixture.add(new GoldTradeItem(getGame(), sender, recipient, 1);
		
		Player result = fixture.getVictim();

		assertTrue(result == recipient);
	}

	/**
	 * Run the void incrementVersion() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testIncrementVersion()
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
		
		fixture.incrementVersion();
		
		assertTrue(fixture.getVersion() == 2)

	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testIsEmpty_1()
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

		boolean result = fixture.isEmpty();

		assertTrue(result);
	}

	/**
	 * Run the Iterator<TradeItem> iterator() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testIterator()
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
		TradeItem colonyTradeItem = new ColonyTradeItem(getGame(), sender, recipient, getStandardColony(1,5,5));
		fixture.add(colonyTradeItem);
		
		Iterator<TradeItem> result = fixture.iterator();

		assertTrue(result.next() == colonyTradeItem);
	}
	
	/**
	 * Run the void remove(int) method by trade item test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testRemove_TradeItem()
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
		TradeItem colonyTradeItem = new ColonyTradeItem(getGame(), sender, recipient, getStandardColony(1,5,5));
		fixture.add(colonyTradeItem);

		List<TradeItem> items = fixture.getTradeItems();
		assertTrue(items.contains(colonyTradeItem));
		
		fixture.remove(colonyTradeItem);
		assertTrue(!items.contains(colonyTradeItem));
	}

	/**
	 * Run the void removeType(Class<? extends TradeItem>) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testRemoveType()
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
		TradeItem colonyTradeItem = new ColonyTradeItem(getGame(), sender, recipient, getStandardColony(1,5,5));
		fixture.add(colonyTradeItem);
		Class<? extends TradeItem> colonyItemClass = ColonyTradeItem.class;

		List<TradeItem> items = fixture.getTradeItems();
		assertTrue(items.contains(colonyTradeItem));
		
		fixture.removeType(colonyItemClass);
		assertTrue(!items.contains(colonyTradeItem));
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testToString()
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
		TradeItem colonyTradeItem = new ColonyTradeItem(getGame(), sender, recipient, getStandardColony(1,5,5));
		fixture.add(colonyTradeItem);
		
		StringBuilder sb = new StringBuilder(128);
        sb.append("[").append(getId())
            .append(" ").append(fixture.getContext())
            .append(" ").append(fixture.getStatus())
            .append(" from=").append(sender.getId())
            .append(" to=").append(recipient.getId())
            .append(" version=").append(fixture.getVersion())
            .append(" [");
        for (TradeItem item : fixture.getTradeItems()) sb.append(" ").append(item);
        sb.append(" ]]");
		
		String result = sb.toString();
		
		assertTrue(result == fixture.toString())
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DiplomaticTradeTest.class);
	}
