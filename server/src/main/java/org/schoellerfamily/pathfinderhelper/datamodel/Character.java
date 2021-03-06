package org.schoellerfamily.pathfinderhelper.datamodel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author jonathanschoeller
 */
@Entity
public final class Character implements IntegerAttributes, StringAttributes {

    /**
     * DEFENSE - the base defense before any calculation for both armor class and
     * combat maneuver defense is 10.
     */
    public static final Integer DEFENSE = Integer.valueOf(10);

    /**
     * Character object ID.
     */
    @Id
    @GeneratedValue
    private Long id;

    /** */
    private String name;
    /** */
    private Long playerid;
    /** */
    @OneToMany
    private List<IntegerAttribute> integerAttributes;
    /** */
    @OneToMany
    private List<StringAttribute> stringAttributes;
    /** */
    @OneToOne
    private Race race;
    /** */
    @OneToMany
    private List<CharacterClassLevel> levels;
    /** */
    @OneToMany
    private List<Item> inventory;
    /** */
    @OneToMany
    private List<SkillRank> skillranks;
    /** */
    @OneToMany
    private List<Ability> abilities;
//    /** */
//    @OneToMany
//    private List<String> passives;
//    /** */
//    private HashMap<String, SpellsByLevel> spellsknown;
//    /** */
//    private HashMap<String, SpellsByLevel> spellsprepared;
    /** */
    public Character() {
        id = Long.valueOf(0);
        name = "";
        playerid = Long.valueOf(0);
        integerAttributes = new ArrayList<IntegerAttribute>();
        initIntegerAttributes();

        stringAttributes = new ArrayList<StringAttribute>();
        initStringAttributes();
    }

    /**
     * This is important in Pathfinder because the modifier is based entirely on the
     * score, but the score itself is still an important stand-alone value.
     *
     * @param abilityScore
     *            Takes an Integer input, typically an ability score from a
     *            character
     * @return returns the ability score modifier of the score.
     */
    public static int getModifier(final Integer abilityScore) {
        final int score = abilityScore.intValue();
        if (score >= SCORE_THRESHOLD) {
            return (score - SCORE_THRESHOLD) / 2;
        } else {
            return score - SCORE_THRESHOLD;
        }
    }

    /**
     * @return gets the ID of the character in the form of a Long
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id takes a Long input and sets the ID to the value
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return gets the name of the character in the form of a String
     */
    public String getName() {
        return name;
    }

    /**
     * @param name takes a String input and sets the name to the value
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return gets the player ID of the player associated with the character in the
     *         form of a Long
     */
    public Long getPlayerid() {
        return playerid;
    }

    /**
     * @param playerid takes a Long input and sets the player ID to the value
     */
    public void setPlayerid(final Long playerid) {
        this.playerid = playerid;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<IntegerAttribute> getIntegerAttributes() {
        return integerAttributes;
    }

    /**
     * @param attributes the list of integer attributes to set
     */
    public void setIntegerAttributes(final List<IntegerAttribute> attributes) {
        this.integerAttributes = attributes;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<StringAttribute> getStringAttributes() {
        return stringAttributes;
    }

    /**
     * @param attributes the list string attributes to set
     */
    public void setStringAttributes(final List<StringAttribute> attributes) {
        this.stringAttributes = attributes;
    }

    // TODO make a get initiative function that uses a calculating class

    /*
     * public Integer getInitiative() { return initiative; }
     */
    // TODO make a get combat maneuver bonus function that uses a calculating class

    /*
     * public Integer getCombatmaneuverbonus() { return combatmaneuverbonus; }
     */

    // TODO make a get combat maneuver defense function that uses a calculating
    // class

    /*
     * public Integer getCombatmaneuverdefense() { return combatmaneuverdefense; }
     */

//    /**
//     * @return gets the list of passive affects on the character
//     */
//    public List<String> getPassives() {
//        return passives;
//    }
//
//    // TODO getSpellsknown(Class), addSpellknown(Class, Spell),
//    // removeSpellknown(Class, Spell), getSpellsprepared(Class),
//    // setSpellsprepared(Class, ArrayList<Spell>), getSpellsslots(Class),
//    // setSpellsslots(Class, Integer[10]), getAbilities(), addAbility(Ability),
//    // removeAbility(Ability)
//
//    /**
//     * @param passive
//     *            takes a String and adds it to the list of passive affects on
//     *            the character
//     */
//    public void addPassive(final String passive) {
//        if (passives == null) {
//            passives = new ArrayList<String>();
//        }
//        passives.add(passive);
//    }
//
//    /**
//     * @param passive
//     *            takes a String and searches the List of passive affects on
//     *            the character for a copy of the String. If the String is found, it
//     *            is removed from the List
//     */
//    public void removePassive(final String passive) {
//        passives.remove(passive);
//    }

    /**
     * @return gets the list of class levels on the character. The list is in
     *         List form, and is populated with PathfinderClassLevel
     */
    public List<CharacterClassLevel> getLevels() {
        return levels;
    }

    /**
     * @param characterClass takes a class and levels it up, then updates the
     *        character based on new total level and class levels
     */
    public void levelUp(final CharacterClass characterClass) {
        // TODO update the character based on total level and class leveled
        for (final CharacterClassLevel classlevel : levels) {
            if (classlevel.getCharacterClass().getName().equals(characterClass.getName())) {
                classlevel.levelUp();
                return;
            }
        }
    }

    /**
     * @return gets the race of the character
     */
    public Race getRace() {
        return race;
    }

    /**
     * @param race takes a Race and sets it to the character race
     */
    public void setRace(final Race race) {
        this.race = race;
    }

    /**
     * @return gets the list of items in the character inventory
     */
    public List<Item> getInventory() {
        return inventory;
    }

    /**
     * @param item takes an Item, creates a new inventory if one does not yet
     *        exist, then puts the item into the character inventory
     */
    public void addToInventory(final Item item) {
        if (inventory == null) {
            inventory = new ArrayList<Item>();
        }
        inventory.add(item);
    }

    /**
     * @param item takes an Item and removes it from the character inventory
     */
    public void takeFromInventory(final Item item) {
        inventory.remove(item);
    }

    /**
     * @return gets the list of character skills with ranks applied. The list
     *         is in List form, and is populated with SkillRank
     */
    public List<SkillRank> getSkillranks() {
        return skillranks;
    }

    /**
     * @param skill takes a skill. If there is not yet a list of skill ranks it
     *        makes one. Then it checks if list of character skill ranks
     *        already has ranks in the given skill. if it does, it iterates the
     *        rank count for that skill. if it doesn't, it creates a new
     *        SkillRank
     */
    public void addSkillrank(final Skill skill) {
        if (skillranks == null) {
            skillranks = new ArrayList<SkillRank>();
        }
        for (final SkillRank skillrank : skillranks) {
            if (skillrank.getSkill().getName().equals(skill.getName())) {
                skillrank.incrementRankCount();
                return;
            }
        }
        final SkillRank skillRank = new SkillRank();
        skillRank.setSkill(skill);
        skillranks.add(skillRank);
    }

    /**
     * @param abilities the abilities to set
     */
    public void setAbilities(final List<Ability> abilities) {
        this.abilities = abilities;
    }

    /**
     * @return gets the list of available abilities
     */
    public List<Ability> getAbilities() {
        return abilities;
    }

    /**
     * @param ability takes an Ability and adds it to the list of available
     *        abilities for the character
     */
    public void addAbility(final Ability ability) {
        abilities.add(ability);
    }

    /**
     * @param ability takes an Ability and searches the list of abilities for
     *        the character for a copy of the ability. If the ability is found,
     *        it is removed from the list
     */
    public void removeAbility(final Ability ability) {
        abilities.remove(ability);
    }

//    /**
//     * @return the known spells
//     */
//    public HashMap<String, SpellsByLevel> getSpellsknown() {
//        return spellsknown;
//    }
//
//    /**
//     * @param spellsknown the new collection of known spells
//     */
//    public void setSpellsknown(final HashMap<String, SpellsByLevel> spellsknown) {
//        this.spellsknown = spellsknown;
//    }
//
//    /**
//     * @return the prepared spells
//     */
//    public HashMap<String, SpellsByLevel> getSpellsprepared() {
//        return spellsprepared;
//    }
//
//    /**
//     * @param spellsprepared the new collection of prepared spells
//     */
//    public void setSpellsprepared(final HashMap<String, SpellsByLevel> spellsprepared) {
//        this.spellsprepared = spellsprepared;
//    }

}
