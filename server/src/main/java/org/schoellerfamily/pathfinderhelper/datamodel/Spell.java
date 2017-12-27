package org.schoellerfamily.pathfinderhelper.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Represents a character's spell.
 *
 * @author jonathanschoeller
 */
@Entity
public final class Spell {
    /**
     * Spell object ID.
     */
    @Id
    @GeneratedValue
    private Integer id;

}
