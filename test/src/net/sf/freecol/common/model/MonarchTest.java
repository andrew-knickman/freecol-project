/**
 *  Copyright (C) 2002-2015  The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.common.model;

import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.StringWriter;
import java.util.List;
import java.util.Random;

import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.Monarch.Force;
import net.sf.freecol.common.model.Monarch.MonarchAction;
import net.sf.freecol.common.option.UnitListOption;
import net.sf.freecol.common.util.RandomChoice;
import net.sf.freecol.util.test.FreeColTestCase;


public class MonarchTest extends FreeColTestCase {

    public void testSerialize() {
        Game game = getStandardGame();
        Player dutch = game.getPlayerByNationId("model.nation.dutch");

        try {
            StringWriter sw = new StringWriter();
            FreeColXMLWriter xw = new FreeColXMLWriter(sw,
                FreeColXMLWriter.WriteScope.toSave());

            dutch.getMonarch().toXML(xw);

            xw.close();

        } catch (Exception e) {
            fail(e.toString());
        }
    }

    public void testTaxActionChoices() {
        Game game = getStandardGame();
        game.setMap(getTestMap());
        Player dutch = game.getPlayerByNationId("model.nation.dutch");

        // grace period has not yet expired
        List<RandomChoice<MonarchAction>> choices
            = dutch.getMonarch().getActionChoices();
        assertTrue(choices.isEmpty());

        Colony colony = getStandardColony();
        game.setTurn(new Turn(100));
        dutch.setTax(Monarch.MINIMUM_TAX_RATE / 2);
        choices = dutch.getMonarch().getActionChoices();
        assertTrue(choicesContain(choices, MonarchAction.RAISE_TAX_WAR));
        assertTrue(choicesContain(choices, MonarchAction.RAISE_TAX_ACT));
        assertFalse(choicesContain(choices, MonarchAction.LOWER_TAX_WAR));
        assertFalse(choicesContain(choices, MonarchAction.LOWER_TAX_OTHER));

        int maximumTax = spec().getInteger(GameOptions.MAXIMUM_TAX);
        dutch.setTax(maximumTax / 2);
        choices = dutch.getMonarch().getActionChoices();
        assertTrue(choicesContain(choices, MonarchAction.RAISE_TAX_WAR));
        assertTrue(choicesContain(choices, MonarchAction.RAISE_TAX_ACT));
        assertTrue(choicesContain(choices, MonarchAction.LOWER_TAX_WAR));
        assertTrue(choicesContain(choices, MonarchAction.LOWER_TAX_OTHER));

        dutch.setTax(maximumTax + 2);
        choices = dutch.getMonarch().getActionChoices();
        assertFalse(choicesContain(choices, MonarchAction.RAISE_TAX_WAR));
        assertFalse(choicesContain(choices, MonarchAction.RAISE_TAX_ACT));
        assertTrue(choicesContain(choices, MonarchAction.LOWER_TAX_WAR));
        assertTrue(choicesContain(choices, MonarchAction.LOWER_TAX_OTHER));

        dutch.changePlayerType(Player.PlayerType.REBEL);
        choices = dutch.getMonarch().getActionChoices();
        assertTrue(choices.isEmpty());

    }


    private boolean choicesContain(List<RandomChoice<MonarchAction>> choices, MonarchAction action) {
        for (RandomChoice<MonarchAction> choice : choices) {
            if (choice.getObject() == action) {
                return true;
            }
        }
        return false;
    }

    public void testRaiseTax() {
    	Player player = mock(Player.class);
    	when(player.getTax()).thenReturn(1);
    	//Specification spec = mock(Specification.class);
    	//when(spec.get)
    	Monarch monarch = new Monarch(getStandardGame(), player);
    	Random rand = new Random();
    	
    	assertTrue(monarch.raiseTax(rand) > 1);
    }
    
    public void testLowerTax() {
    	Player player = mock(Player.class);
    	when(player.getTax()).thenReturn(30);
    	//Specification spec = mock(Specification.class);
    	//when(spec.get)
    	Monarch monarch = new Monarch(getStandardGame(), player);
    	Random rand = new Random();
    	
    	assertTrue(monarch.lowerTax(rand) <= 30);
    }
    
    public void testGetExpeditionaryForce() {
    	Player player = mock(Player.class);

        Monarch monarch = new Monarch(getStandardGame(), player);
        
        assertNotNull(monarch.getExpeditionaryForce());
        assertNotNull(monarch.getExpeditionaryForce());
    }
    
    public void testGetInterventionForce() {
    	Player player = mock(Player.class);
    	Monarch monarch = new Monarch(getStandardGame(), player);
    	
    	assertNotNull(monarch.getInterventionForce());
    	assertNotNull(monarch.getInterventionForce());
    }
    
    public void testActionIsValid() {
    	Player player = mock(Player.class);
    	when(player.getTax()).thenReturn(1);
    	when(player.getAttackedByPrivateers()).thenReturn(true);
    	when(player.isAtWar()).thenReturn(true);
    	when(player.checkGold(anyInt())).thenReturn(true);
    	
       	Player falsePlayer = mock(Player.class);
    	when(falsePlayer.getTax()).thenReturn((int) (spec().getInteger(GameOptions.MAXIMUM_TAX) + 2));
    	when(falsePlayer.getAttackedByPrivateers()).thenReturn(false);
    	when(falsePlayer.isAtWar()).thenReturn(false);
    	when(falsePlayer.checkGold(anyInt())).thenReturn(false);
    	
    	Monarch trueMonarch = new Monarch(getStandardGame(), player);
    	trueMonarch.setSupportSea(false);
    	trueMonarch.setDispleasure(false);
    	Monarch falseMonarch = new Monarch(getStandardGame(), falsePlayer);
    	falseMonarch.setSupportSea(false);
    	falseMonarch.setDispleasure(false);
    	
    	assertTrue(trueMonarch.actionIsValid(MonarchAction.NO_ACTION));
    	assertTrue(trueMonarch.actionIsValid(MonarchAction.RAISE_TAX_ACT));
    	assertTrue(trueMonarch.actionIsValid(MonarchAction.RAISE_TAX_WAR));
    	assertFalse(falseMonarch.actionIsValid(MonarchAction.RAISE_TAX_ACT));
    	assertFalse(falseMonarch.actionIsValid(MonarchAction.RAISE_TAX_WAR));
    	assertTrue(falseMonarch.actionIsValid(MonarchAction.LOWER_TAX_OTHER));
    	assertTrue(falseMonarch.actionIsValid(MonarchAction.LOWER_TAX_WAR));
    	assertFalse(trueMonarch.actionIsValid(MonarchAction.LOWER_TAX_OTHER));
    	assertFalse(trueMonarch.actionIsValid(MonarchAction.LOWER_TAX_WAR));
    	assertFalse(falseMonarch.actionIsValid(MonarchAction.FORCE_TAX));
    	assertTrue(trueMonarch.actionIsValid(MonarchAction.WAIVE_TAX));
    	assertTrue(trueMonarch.actionIsValid(MonarchAction.SUPPORT_LAND));
    	assertFalse(falseMonarch.actionIsValid(MonarchAction.SUPPORT_LAND));
    	assertFalse(falseMonarch.actionIsValid(MonarchAction.MONARCH_MERCENARIES));
    	assertTrue(trueMonarch.actionIsValid(MonarchAction.MONARCH_MERCENARIES));
    	assertTrue(trueMonarch.actionIsValid(MonarchAction.SUPPORT_SEA));
    	assertFalse(falseMonarch.actionIsValid(MonarchAction.SUPPORT_SEA));
    	trueMonarch.setSupportSea(true);
    	assertFalse(trueMonarch.actionIsValid(MonarchAction.SUPPORT_SEA));
    	trueMonarch.setDispleasure(true);
    	assertFalse(trueMonarch.actionIsValid(MonarchAction.SUPPORT_SEA));
    	assertFalse(trueMonarch.actionIsValid(MonarchAction.SUPPORT_LAND));
    	assertFalse(trueMonarch.actionIsValid(MonarchAction.MONARCH_MERCENARIES));
    	trueMonarch.setSupportSea(false);
    	assertFalse(trueMonarch.actionIsValid(MonarchAction.SUPPORT_SEA));
    	assertTrue(trueMonarch.actionIsValid(MonarchAction.HESSIAN_MERCENARIES));
    	assertFalse(falseMonarch.actionIsValid(MonarchAction.HESSIAN_MERCENARIES));
    }
}
