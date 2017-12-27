package org.schoellerfamily.pathfinderhelper.datamodel.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.schoellerfamily.pathfinderhelper.datamodel.Character;

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
}
