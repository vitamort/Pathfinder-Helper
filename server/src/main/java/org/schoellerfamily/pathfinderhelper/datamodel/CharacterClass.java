package org.schoellerfamily.pathfinderhelper.datamodel;

/**
 * Base class for the various character classes.
 *
 * @author jonathanschoeller
 */
public abstract class CharacterClass {
    // TODO create common fields that all character classes need.
    /**
     * Hold's the class name.
     */
    private String name;

    /**
     * @param name the new name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
