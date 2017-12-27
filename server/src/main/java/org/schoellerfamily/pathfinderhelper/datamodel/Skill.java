package org.schoellerfamily.pathfinderhelper.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Base class for the various character skills.
 *
 * @author jonathanschoeller
 */
@Entity
public abstract class Skill {
    /**
     * Skill ID.
     */
    @Id
    @GeneratedValue
    private Long id;

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
