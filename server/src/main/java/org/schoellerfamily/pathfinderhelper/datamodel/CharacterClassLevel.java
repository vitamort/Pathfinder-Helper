package org.schoellerfamily.pathfinderhelper.datamodel;

/**
 * Combines level count with character class.
 *
 * @author jonathanschoeller
 */
public class CharacterClassLevel {
    /**
     * Holds the relationship to the character class.
     */
    private CharacterClass characterClass;

    /**
     * Holds the current level.
     */
    private Integer level;

    /**
     * @param characterClass the related class
     */
    public CharacterClassLevel(final CharacterClass characterClass) {
        this.characterClass = characterClass;
        level = Integer.valueOf(1);
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
