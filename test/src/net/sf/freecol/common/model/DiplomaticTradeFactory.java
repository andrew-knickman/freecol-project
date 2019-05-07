package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import net.sf.freecol.common.io.FreeColXMLReader;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;


/**
 * The class <code>DiplomaticTradeFactory</code> implements static methods that return instances of the class <code>{@link DiplomaticTrade}</code>.
 *
 * @generatedBy CodePro at 5/7/19 10:00 AM
 * @author Andrew Knickman
 * @version $Revision: 1.0 $
 */
public class DiplomaticTradeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/7/19 10:00 AM
	 */
	private DiplomaticTradeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/7/19 10:00 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(new Game(new IIOMetadataNode(""), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		list.add(new ColonyTradeItem(new Game(new IIOMetadataNode(""), ""), new Player(new Game(new IIOMetadataNode(""), "")), new Player(new Game(new IIOMetadataNode(""), "")), new Colony(new Game(new IIOMetadataNode(""), ""), "")));
		list.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new FreeColXMLReader(new StringReader(""))));
		list.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new Player(new Game(new IIOMetadataNode(""), ""), ""), new Player(new Game(new IIOMetadataNode(""), ""), ""), new Colony(new Game(new IIOMetadataNode(""), ""), new Player(new Game(new IIOMetadataNode(""), "")), "", new Tile(new Game(new IIOMetadataNode(""), ""), ""))));
		list.add(new ColonyTradeItem(new Game(new Specification()), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), new Colony(new Game(new IIOMetadataNode(), "0123456789"), "0123456789")));
		list.add(new ColonyTradeItem((Game) null, new Player(new Game(new IIOMetadataNode(), "0123456789"), "0123456789"), new Player(new Game(new IIOMetadataNode(), "0123456789"), "0123456789"), new Colony(new Game(new IIOMetadataNode(), "0123456789"), new Player(new Game(new IIOMetadataNode(""), ""), ""), "0123456789", new Tile(new Game(new IIOMetadataNode(), "0123456789"), "0123456789"))));
		list.add(new GoldTradeItem(new Game(new IIOMetadataNode(""), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		list.add(new GoldTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new FreeColXMLReader(new StringReader(""))));
		list.add(new GoodsTradeItem(new Game(new IIOMetadataNode(""), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		list.add(new GoodsTradeItem(new Game(new IIOMetadataNode(""), ""), new Player(new Game(new IIOMetadataNode(""), "")), new Player(new Game(new IIOMetadataNode(""), "")), new Goods(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode(""))));
		list.add(new GoodsTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new FreeColXMLReader(new StringReader(""))));
		list.add(new GoodsTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new Player(new Game(new IIOMetadataNode(""), ""), ""), new Player(new Game(new IIOMetadataNode(""), ""), ""), new Goods(new Game(new IIOMetadataNode(""), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())))));
		list.add(new GoodsTradeItem(new Game(new Specification()), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), new Goods(new Game(new IIOMetadataNode(), "0123456789"), new IIOMetadataNode())));
		list.add(new GoodsTradeItem((Game) null, new Player(new Game(new IIOMetadataNode(), "0123456789"), "0123456789"), new Player(new Game(new IIOMetadataNode(), "0123456789"), "0123456789"), new Goods(new Game(new IIOMetadataNode(), "0123456789"), new FreeColXMLReader(new StringReader("")))));
		list.add(new InciteTradeItem(new Game(new IIOMetadataNode(""), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		list.add(new InciteTradeItem(new Game(new IIOMetadataNode(""), ""), new Player(new Game(new IIOMetadataNode(""), "")), new Player(new Game(new IIOMetadataNode(""), "")), new Player(new Game(new IIOMetadataNode(""), ""))));
		list.add(new InciteTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new FreeColXMLReader(new StringReader(""))));
		list.add(new InciteTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new Player(new Game(new IIOMetadataNode(""), ""), ""), new Player(new Game(new IIOMetadataNode(""), ""), ""), new Player(new Game(new IIOMetadataNode(""), ""), "")));
		list.add(new InciteTradeItem(new Game(new Specification()), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode(""))));
		list.add(new InciteTradeItem((Game) null, new Player(new Game(new IIOMetadataNode(), "0123456789"), "0123456789"), new Player(new Game(new IIOMetadataNode(), "0123456789"), "0123456789"), new Player(new Game(new IIOMetadataNode(), "0123456789"), "0123456789")));
		list.add(new StanceTradeItem(new Game(new IIOMetadataNode(""), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		list.add(new StanceTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new FreeColXMLReader(new StringReader(""))));
		list.add(new UnitTradeItem(new Game(new IIOMetadataNode(""), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		list.add(new UnitTradeItem(new Game(new IIOMetadataNode(""), ""), new Player(new Game(new IIOMetadataNode(""), "")), new Player(new Game(new IIOMetadataNode(""), "")), new Unit(new Game(new IIOMetadataNode(""), ""))));
		list.add(new UnitTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new FreeColXMLReader(new StringReader(""))));
		list.add(new UnitTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new Player(new Game(new IIOMetadataNode(""), ""), ""), new Player(new Game(new IIOMetadataNode(""), ""), ""), new Unit(new Game(new IIOMetadataNode(""), ""), "")));
		list.add(new UnitTradeItem(new Game(new Specification()), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), new Unit(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode(""))));
		list.add(new UnitTradeItem((Game) null, new Player(new Game(new IIOMetadataNode(), "0123456789"), "0123456789"), new Player(new Game(new IIOMetadataNode(), "0123456789"), "0123456789"), new Unit(new Game(new IIOMetadataNode(), "0123456789"), "0123456789")));
		return new DiplomaticTrade(new Game(new IIOMetadataNode(), "0123456789"), DiplomaticTrade.TradeContext.DIPLOMATIC, new Player(new Game(new IIOMetadataNode(""), ""), ""), new Player(new Game(new IIOMetadataNode(""), ""), ""), list, 1);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/7/19 10:00 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade2()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(new Game(new IIOMetadataNode(""), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes()))));
		return new DiplomaticTrade(new Game(new IIOMetadataNode(""), ""), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(""), "")), new Player(new Game(new IIOMetadataNode(""), "")), list, 0);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/7/19 10:00 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade3() {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(new Game(new IIOMetadataNode(""), ""), new Player(new Game(new IIOMetadataNode(""), "")), new Player(new Game(new IIOMetadataNode(""), "")), new Colony(new Game(new IIOMetadataNode(""), ""), "")));
		return new DiplomaticTrade(new Game(new Specification()), DiplomaticTrade.TradeContext.TRADE, new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), list, 7);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/7/19 10:00 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new FreeColXMLReader(new StringReader(""))));
		return new DiplomaticTrade((Game) null, DiplomaticTrade.TradeContext.TRIBUTE, new Player(new Game(new IIOMetadataNode(), "0123456789"), "0123456789"), new Player(new Game(new IIOMetadataNode(), "0123456789"), "0123456789"), list, -1);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/7/19 10:00 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade5() {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(new Game(new IIOMetadataNode(), "0123456789"), new Player(new Game(new IIOMetadataNode(""), ""), ""), new Player(new Game(new IIOMetadataNode(""), ""), ""), new Colony(new Game(new IIOMetadataNode(""), ""), new Player(new Game(new IIOMetadataNode(""), "")), "", new Tile(new Game(new IIOMetadataNode(""), ""), ""))));
		return new DiplomaticTrade(new Game(new IIOMetadataNode(), "0123456789"), DiplomaticTrade.TradeContext.CONTACT, new Player(new Game(new IIOMetadataNode(), "0123456789"), new IIOMetadataNode()), new Player(new Game(new IIOMetadataNode(), "0123456789"), new IIOMetadataNode()), list, Integer.MAX_VALUE);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/7/19 10:00 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade6() {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(new Game(new Specification()), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), new Player(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode("")), new Colony(new Game(new IIOMetadataNode(), "0123456789"), "0123456789")));
		return new DiplomaticTrade(new Game(new Specification()), DiplomaticTrade.TradeContext.DIPLOMATIC, (Player) null, (Player) null, list, Integer.MIN_VALUE);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/7/19 10:00 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade7() {
		return new DiplomaticTrade(new Game(new IIOMetadataNode(""), ""), new IIOMetadataNode(""));
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/7/19 10:00 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade8() {
		return new DiplomaticTrade(new Game(new IIOMetadataNode(), "0123456789"), new IIOMetadataNode());
	}
}