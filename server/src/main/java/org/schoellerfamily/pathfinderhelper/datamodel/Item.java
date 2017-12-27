package org.schoellerfamily.pathfinderhelper.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Represents items found or carried by characters.
 *
 * @author jonathanschoeller
 */
@Entity
public class Item {
    /**
     * Item object ID.
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * ID of containing character.
     */
    @ManyToOne
    private Character character;

}
