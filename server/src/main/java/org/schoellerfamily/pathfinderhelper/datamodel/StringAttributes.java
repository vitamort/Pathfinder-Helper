package org.schoellerfamily.pathfinderhelper.datamodel;

import java.util.List;

/**
 * Mixin to provide some of the behavior layered on Character's string attribute capability.
 *
 * @author Dick Schoeller
 */
public interface StringAttributes {
    /**
     * Default value of string attribute.
     */
    String DEFAULT_STRING_VALUE = "";

    /**
     * @return the list of string attributes
     */
    List<StringAttribute> getStringAttributes();

    /**
     * @param attrname the name of the attribute to be found
     * @return the value of the attribute
     */
    default String getStringAttribute(final String attrname) {
        for (final StringAttribute attribute : getStringAttributes()) {
            if (attribute.getName().equals(attrname)) {
                return attribute.getValue();
            }
        }
        return DEFAULT_STRING_VALUE;
    }

    /**
     * @param attrname the name of the attribute
     * @param value the value of the attribute
     */
    default void addStringAttribute(final String attrname, final String value) {
        for (final StringAttribute attribute : getStringAttributes()) {
            if (attribute.getName().equals(attrname)) {
                attribute.setValue(value);
                return;
            }
        }
        getStringAttributes().add(new StringAttribute(attrname, value));
    }

    /**
     * Initialize the standard set of string attributes.
     */
    default void initStringAttributes() {
        addStringAttribute("gender", "male");
        addStringAttribute("description", "");
        addStringAttribute("flight maneuverability", "");
    }
}
