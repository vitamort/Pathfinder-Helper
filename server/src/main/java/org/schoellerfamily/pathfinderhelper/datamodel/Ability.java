package org.schoellerfamily.pathfinderhelper.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Represents activated character abilities.
 *
 * @author jonathanschoeller
 */
@Entity
public final class Ability {
    /**
     * Ability object ID.
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * ID of containing character.
     */
    @ManyToOne
    private Character character;

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
}
