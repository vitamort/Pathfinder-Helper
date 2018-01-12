package org.schoellerfamily.pathfinderhelper.datamodel.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.schoellerfamily.pathfinderhelper.datamodel.Character;
import org.schoellerfamily.pathfinderhelper.datamodel.IntegerAttribute;
import org.schoellerfamily.pathfinderhelper.datamodel.StringAttribute;

/**
 * @author jonathanschoeller
 */
public class CharacterTest {
    /** */
    @Test
    public void testName() {
        final Character character = new Character();
        character.setName("Dick");
        assertEquals("name mismatch", "Dick", character.getName());
    }
    /** */
    @Test
    public void testModifier() {
        final int[][] table = {{-10, 0},
                {-9, 1},
                {-1, 9},
                {0, 10},
                {0, 11},
                {1, 12}};
        for (int[] values : table) {
            assertEquals("unexpected result for input " + values[1],
                    values[0], Character.getModifier(values[1]));
        }
    }
    /** */
    @Test
    public void testStringAttributes() {
        final Character character = new Character();
        for (StringAttribute attribute : character.getStringAttributes()) {
            assertEquals("failed getter for string attribute", attribute.getValue(),
                    character.getStringAttribute(attribute.getName()));
        }
    }
    /** */
    @Test
    public void testIntegerAttributes() {
        final Character character = new Character();
        for (IntegerAttribute attribute : character.getIntegerAttributes()) {
            assertEquals("failed getter for integer attribute", attribute.getValue(),
                    character.getIntegerAttribute(attribute.getName()));
        }
    }
}
