package org.schoellerfamily.pathfinderhelper.datamodel;

/**
 * Base class for the various character skills.
 *
 * @author jonathanschoeller
 */
public abstract class Skill {
    /**
     * Holds the name of the skill.
     */
    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }
}
