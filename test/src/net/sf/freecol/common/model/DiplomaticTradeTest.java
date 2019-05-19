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

	 *
	 */
	@Test
	public void testDiplomaticTrade_Contact()
		{
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
		{
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
		{
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
		{
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
		{
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
		{
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
		{
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
		assertTrue(fixture.getStatus() == status);
	}

	/**
	 * Run the Player getSender() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetSender()
		{
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
		assertTrue(sender == result);
	}
	
	/**
	 * Run the void setSender(Player) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testSetSender()
		{
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
		assertTrue(fixture.getSender() == newSender);
	}
	
	/**
	 * Run the Player getRecipient() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetRecipient()
		{
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
		{
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
		Player newRecipient = newColony.getOwner();
		fixture.setRecipient(newRecipient);
		assertTrue(fixture.getRecipient() == newRecipient);
	}

	
	/**
	 * Run the void add(TradeItem) method test with gold trade item.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testAdd_Gold()
		{
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
		{
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
		{
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
		{
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
		fixture.add(new GoldTradeItem(getGame(), sender, recipient, 1));

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
		{
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
		{
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
		{
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

		assertTrue(result == recipient);
	}

	/**
	 * Run the StringTemplate getReceiveMessage(Player) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetReceiveMessage()
		{
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
		fixture.add(new GoldTradeItem(getGame(), sender, recipient, 1));

		StringTemplate result = fixture.getReceiveMessage(sender);

		assertTrue(result == StringTemplate.template("model.diplomaticTrade.receive."
	            + fixture.getContext().getKey())
	            .addStringTemplate("%nation%", sender.getNationLabel()));
	}

	/**
	 * Run the StringTemplate getSendMessage(Player,Settlement) method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testGetSendMessage()
		{
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
		fixture.add(new GoldTradeItem(getGame(), sender, recipient, 1));
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
		{
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
		fixture.add(new GoldTradeItem(getGame(), sender, recipient, 1));

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
		{
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
		{
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
		fixture.add(new GoldTradeItem(getGame(), sender, recipient, 1));
		
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
		{
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
		fixture.add(new GoldTradeItem(getGame(), sender, recipient, 1));
		
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
		{
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
		fixture.add(new GoldTradeItem(getGame(), sender, recipient, 1));
		
		fixture.incrementVersion();
		
		assertTrue(fixture.getVersion() == 2);

	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws FreeColException
	 *
	 */
	@Test
	public void testIsEmpty()
		{
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
		{
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
		{
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
		{
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
		{
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
        sb.append("[").append(fixture.getId())
            .append(" ").append(fixture.getContext())
            .append(" ").append(fixture.getStatus())
            .append(" from=").append(sender.getId())
            .append(" to=").append(recipient.getId())
            .append(" version=").append(fixture.getVersion())
            .append(" [");
        for (TradeItem item : fixture.getTradeItems()) sb.append(" ").append(item);
        sb.append(" ]]");
		
		String result = sb.toString();
		
		assertTrue(result == fixture.toString());
	}
	
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws FreeColException
	 *         if the initialization fails for some reason
	 *
	 */
	@Before
	public void setUp()
		{
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws FreeColException
	 *         if the clean-up fails for some reason
	 *
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
		new org.junit.runner.JUnitCore().run(DiplomaticTradeTest.class);
	}
}