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
        final int[][] table = {
                {-10, 0},
                {-9, 1},
                {-1, 9},
                {0, 10},
                {0, 11},
                {1, 12}
                };
        for (int[] values : table) {
            assertEquals("unexpected result for input " + values[1],
                    values[0], Character.getModifier(values[1]));
        }
    }

    /**
     * Matches default score threshold in Character class.
     */
    private static final Integer DEFAULT_SCORE_THRESHOLD = Integer.valueOf(10);

    /**
     * Many things default to 0.
     */
    private static final Integer ZERO = Integer.valueOf(0);

    /**
     * Many things default to 0.
     */
    private static final Integer BOGUS = Integer.valueOf(-1);

    /**
     * Default number of integer attributes.
     */
    private static final int EXPECTED_INTEGER_ATTR_COUNT = 19;

    /**
     * Default number of string attributes.
     */
    private static final int EXPECTED_STRING_ATTR_COUNT = 3;

    /** */
    @Test
    public void testDefaultId() {
        final Character c = new Character();
        assertEquals("Unexpected ID value",
                Long.valueOf(0L), c.getId());
    }

    /** */
    @Test
    public void testDefaultName() {
        final Character c = new Character();
        assertEquals("Unexpected name value",
                "", c.getName());
    }

    /** */
    @Test
    public void testDefaultPlayerId() {
        final Character c = new Character();
        assertEquals("Unexpected Player ID value",
                Long.valueOf(0L), c.getPlayerid());
    }

    /** */
    @Test
    public void testDefaultStrength() {
        final Character c = new Character();
        assertEquals("Unexpected strengh value",
                DEFAULT_SCORE_THRESHOLD, c.getIntegerAttribute("strength"));
    }

    /** */
    @Test
    public void testDefaultDexterity() {
        final Character c = new Character();
        assertEquals("Unexpected dexterity value",
                DEFAULT_SCORE_THRESHOLD, c.getIntegerAttribute("dexterity"));
    }

    /** */
    @Test
    public void testDefaultConstitution() {
        final Character c = new Character();
        assertEquals("Unexpected constitution value",
                DEFAULT_SCORE_THRESHOLD, c.getIntegerAttribute("constitution"));
    }

    /** */
    @Test
    public void testDefaultIntelligence() {
        final Character c = new Character();
        assertEquals("Unexpected intelligence value",
                DEFAULT_SCORE_THRESHOLD, c.getIntegerAttribute("intelligence"));
    }

    /** */
    @Test
    public void testDefaultWisdom() {
        final Character c = new Character();
        assertEquals("Unexpected wisdom value",
                DEFAULT_SCORE_THRESHOLD, c.getIntegerAttribute("wisdom"));
    }

    /** */
    @Test
    public void testDefaultCharisma() {
        final Character c = new Character();
        assertEquals("Unexpected charisma value",
                DEFAULT_SCORE_THRESHOLD, c.getIntegerAttribute("charisma"));
    }

    /** */
    @Test
    public void testDefaultMaximumHealth() {
        final Character c = new Character();
        assertEquals("Unexpected maximum health value",
                DEFAULT_SCORE_THRESHOLD, c.getIntegerAttribute("maximum health"));
    }

    /** */
    @Test
    public void testDefaultAge() {
        final Character c = new Character();
        assertEquals("Unexpected age value",
                ZERO, c.getIntegerAttribute("age"));
    }

    /** */
    @Test
    public void testDefaultHeight() {
        final Character c = new Character();
        assertEquals("Unexpected height value",
                ZERO, c.getIntegerAttribute("height"));
    }

    /** */
    @Test
    public void testDefaultWeight() {
        final Character c = new Character();
        assertEquals("Unexpected weight value",
                ZERO, c.getIntegerAttribute("weight"));
    }

    /** */
    @Test
    public void testDefaultBaseAttackBonus() {
        final Character c = new Character();
        assertEquals("Unexpected base attack bonus value",
                ZERO, c.getIntegerAttribute("base attack bonus"));
    }

    /** */
    @Test
    public void testDefaultSize() {
        final Character c = new Character();
        assertEquals("Unexpected size value",
                ZERO, c.getIntegerAttribute("size"));
    }

    /** */
    @Test
    public void testDefaultFortitude() {
        final Character c = new Character();
        assertEquals("Unexpected fortitude value",
                ZERO, c.getIntegerAttribute("fortitude"));
    }

    /** */
    @Test
    public void testDefaultReflex() {
        final Character c = new Character();
        assertEquals("Unexpected reflex value",
                ZERO, c.getIntegerAttribute("reflex"));
    }

    /** */
    @Test
    public void testDefaultWill() {
        final Character c = new Character();
        assertEquals("Unexpected will value",
                ZERO, c.getIntegerAttribute("will"));
    }

    /** */
    @Test
    public void testDefaultLandSpeed() {
        final Character c = new Character();
        assertEquals("Unexpected land speed value",
                ZERO, c.getIntegerAttribute("land speed"));
    }

    /** */
    @Test
    public void testDefaultSwimSpeed() {
        final Character c = new Character();
        assertEquals("Unexpected swim speed value",
                ZERO, c.getIntegerAttribute("swim speed"));
    }

    /** */
    @Test
    public void testDefaultFlightSpeed() {
        final Character c = new Character();
        assertEquals("Unexpected flight value",
                ZERO, c.getIntegerAttribute("flight speed"));
    }

    /** */
    @Test
    public void testDefaultBurrowSpeed() {
        final Character c = new Character();
        assertEquals("Unexpected burrow value",
                ZERO, c.getIntegerAttribute("burrow speed"));
    }

    /** */
    @Test
    public void testBogusIntegerAttribute() {
        final Character c = new Character();
        assertEquals("Unexpected value for unrecognized attribute",
                BOGUS, c.getIntegerAttribute("PLUGH"));
    }

    /** */
    @Test
    public void testIntegerAttributeCount() {
        final Character c = new Character();
        assertEquals("Unexpected integer attribute count",
                EXPECTED_INTEGER_ATTR_COUNT, c.getIntegerAttributes().size());
    }

    /** */
    @Test
    public void testIntegerAttributeReplace() {
        final Character c = new Character();
        final Integer newAge = Integer.valueOf(20);
        c.addIntegerAttribute("age", newAge);
        assertEquals("Unexpacted integer attribute count",
                EXPECTED_INTEGER_ATTR_COUNT, c.getIntegerAttributes().size());
    }

    /** */
    @Test
    public void testIntegerAttributeAdd() {
        final Character c = new Character();
        final Integer newPlugh = Integer.valueOf(20);
        c.addIntegerAttribute("PLUGH", newPlugh);
        assertEquals("Unexpected integer attribute count",
                EXPECTED_INTEGER_ATTR_COUNT + 1, c.getIntegerAttributes().size());
    }

    /** */
    @Test
    public void testIntegerAttributeSet() {
        final Character c = new Character();
        final Integer newAge = Integer.valueOf(20);
        c.addIntegerAttribute("age", newAge);
        assertEquals("Unexpected age value",
                newAge, c.getIntegerAttribute("age"));
    }

    /** */
    @Test
    public void testDefaultGender() {
        final Character c = new Character();
        assertEquals("Unexpected gender value",
                "male", c.getStringAttribute("gender"));
    }

    /** */
    @Test
    public void testDefaultDescription() {
        final Character c = new Character();
        assertEquals("Unexpected description value",
                "", c.getStringAttribute("description"));
    }

    /** */
    @Test
    public void testDefaultFlightManeuverability() {
        final Character c = new Character();
        assertEquals("Unexpected flight maneuverability value",
                "", c.getStringAttribute("flight maneuverability"));
    }

    /** */
    @Test
    public void testBogusStringAttribute() {
        final Character c = new Character();
        // TODO this tests the current behavior, but I'm not convinced that it is a good behavior.
        assertEquals("Unexpected value for unknown attribute",
                "", c.getStringAttribute("XYZZY"));
    }

    /** */
    @Test
    public void testStringAttributeCount() {
        final Character c = new Character();
        assertEquals("Unexpected string attribute count",
                EXPECTED_STRING_ATTR_COUNT, c.getStringAttributes().size());
    }

    /** */
    @Test
    public void testStringAttributeReplace() {
        final Character c = new Character();
        c.addStringAttribute("description", "Tall, dark and handsome");
        assertEquals("Unexpected string attribute count",
                EXPECTED_STRING_ATTR_COUNT, c.getStringAttributes().size());
    }

    /** */
    @Test
    public void testStringAttributeAdd() {
        final Character c = new Character();
        c.addStringAttribute("XYZZY", "foo");
        assertEquals("Unexpected string attribute count",
                EXPECTED_STRING_ATTR_COUNT + 1, c.getStringAttributes().size());
    }

    /** */
    @Test
    public void testStringAttributeSet() {
        final Character c = new Character();
        c.addStringAttribute("description", "Tall, dark and handsome");
        assertEquals("Unexpected description value",
                "Tall, dark and handsome", c.getStringAttribute("description"));
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
