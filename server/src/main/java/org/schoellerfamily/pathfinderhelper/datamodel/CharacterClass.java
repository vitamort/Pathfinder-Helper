package org.schoellerfamily.pathfinderhelper.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Base class for the various character classes.
 *
 * @author jonathanschoeller
 */
@Entity
public final class CharacterClass {
    /**
     * Character class ID.
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * Hold's the class name.
     */
    private String name;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final Integer id) {
        this.id = id;
    }

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
