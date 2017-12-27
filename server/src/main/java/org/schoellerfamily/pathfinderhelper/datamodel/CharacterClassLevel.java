package org.schoellerfamily.pathfinderhelper.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Combines level count with character class.
 *
 * @author jonathanschoeller
 */
@Entity
public final class CharacterClassLevel {
    /**
     * Character class ID.
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
     * Holds the relationship to the character class.
     */
    @OneToOne
    private CharacterClass characterClass;

    /**
     * Holds the current level.
     */
    private Integer level;

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
     * @return the related character class
     */
    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    /**
     * @param characterClass the related character class to set
     */
    public void setCharacterClass(final CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    /**
     * @return the current level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(final Integer level) {
        this.level = level;
    }

    /**
     * Increments the class level.
     */
    public void levelUp() {
        level = Integer.valueOf(level.intValue() + 1);
    }
}
