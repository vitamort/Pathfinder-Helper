package org.schoellerfamily.pathfinderhelper.datamodel;

import java.util.List;

/**
 * @author Dick Schoeller
 */
public interface IntegerAttributes {
    /**
     * Default value of integer attribute.
     */
    Integer DEFAULT_INTEGER_VALUE = -1;

    /**
     * Threshold point in score algorithms.
     */
    int SCORE_THRESHOLD = 10;

    /**
     * @return the attributes
     */
    List<IntegerAttribute> getIntegerAttributes();

    /**
     * @param attrname the name of the attribute to be found
     * @return the value of the attribute
     */
    default Integer getIntegerAttribute(final String attrname) {
        for (final IntegerAttribute attribute : getIntegerAttributes()) {
            if (attribute.getName().equals(attrname)) {
                return attribute.getValue();
            }
        }
        return DEFAULT_INTEGER_VALUE;
    }

    /**
     * @param attrname the name of the attribute
     * @param value the value of the attribute
     */
    default void addIntegerAttribute(final String attrname, final Integer value) {
        for (final IntegerAttribute attribute : getIntegerAttributes()) {
            if (attribute.getName().equals(attrname)) {
                attribute.setValue(value);
                return;
            }
        }
        getIntegerAttributes().add(new IntegerAttribute(attrname, value));
    }

    /**
     * Initialize the standard integer attribute set.
     */
    default void initIntegerAttributes() {
        addIntegerAttribute("strength", Integer.valueOf(SCORE_THRESHOLD));
        addIntegerAttribute("dexterity", Integer.valueOf(SCORE_THRESHOLD));
        addIntegerAttribute("constitution", Integer.valueOf(SCORE_THRESHOLD));
        addIntegerAttribute("intelligence", Integer.valueOf(SCORE_THRESHOLD));
        addIntegerAttribute("wisdom", Integer.valueOf(SCORE_THRESHOLD));
        addIntegerAttribute("charisma", Integer.valueOf(SCORE_THRESHOLD));
        addIntegerAttribute("age", Integer.valueOf(0));
        addIntegerAttribute("height", Integer.valueOf(0));
        addIntegerAttribute("weight", Integer.valueOf(0));
        addIntegerAttribute("base attack bonus", Integer.valueOf(0));
        addIntegerAttribute("size", Integer.valueOf(0));
        addIntegerAttribute("maximum health", Integer.valueOf(SCORE_THRESHOLD));
        addIntegerAttribute("fortitude", Integer.valueOf(0));
        addIntegerAttribute("reflex", Integer.valueOf(0));
        addIntegerAttribute("will", Integer.valueOf(0));
        addIntegerAttribute("land speed", Integer.valueOf(0));
        addIntegerAttribute("swim speed", Integer.valueOf(0));
        addIntegerAttribute("flight speed", Integer.valueOf(0));
        addIntegerAttribute("burrow speed", Integer.valueOf(0));
    }
}
