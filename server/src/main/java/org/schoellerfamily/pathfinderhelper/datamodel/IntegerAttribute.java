package org.schoellerfamily.pathfinderhelper.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jonathanschoeller
 *
 */
@Entity
public final class IntegerAttribute {
    /**
     * IntegerAttribute object ID.
     */
    @Id
    @GeneratedValue
    private Long id;

    /** */
    private String name;

    /** */
    private Integer value;

    /**
     * Constructor.
     */
    public IntegerAttribute() {
        // Empty
    }

    /**
     * @param name the name to identify the attribute
     * @param value the value of the attribute
     */
    public IntegerAttribute(final String name, final Integer value) {
        this.setName(name);
        this.setValue(value);
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name of the attribute
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * @param value the value of the attribute
     */
    public void setValue(final Integer value) {
        this.value = value;
    }
}
