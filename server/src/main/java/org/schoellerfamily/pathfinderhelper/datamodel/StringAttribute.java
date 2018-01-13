package org.schoellerfamily.pathfinderhelper.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jonathanschoeller
 *
 */
@Entity
public final class StringAttribute {
    /**
     * StringAttribute object ID.
     */
    @Id
    @GeneratedValue
    private Long id;

    /** */
    private String name;

    /** */
    private String value;

    /**
     * Constructor.
     */
    public StringAttribute() {
        // Empty constructor.
    }

    /**
     * @param name the name to identify the attribute
     * @param value the value of the attribute
     */
    public StringAttribute(final String name, final String value) {
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
    public String getValue() {
        return value;
    }

    /**
     * @param value the value of the attribute
     */
    public void setValue(final String value) {
        this.value = value;
    }
}
