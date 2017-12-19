package org.schoellerfamily.pathfinderhelper.datamodel;

import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jonathanschoeller
 *
 */
@Entity
public class Character {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long playerid;
    private Integer strength;
    private Integer dexterity;
    private Integer constitution;
    private Integer intelligence;
    private Integer wisdom;
    private Integer charisma;
    private ArrayList<PathfinderClassLevel> levels;
    private Race race;
    private String gender;
    private Integer age;
    private Integer height;//inches
    private Integer weight;
    private String description;
    private Integer baseattackbonus;
    private Integer size;
    private Integer maximumhealth;
    private Integer fortitude;
    private Integer reflex;
    private Integer will;
    /**
     * DEFENSE - the base defense before any calculation for both armor class and combat maneuver defense is 10
     */
    public static final Integer DEFENSE = Integer.valueOf(10);
    private Integer landspeed;
    private Integer swimspeed;
    private Integer flightspeed;
    private String flightmaneuverability;
    private Integer burrowspeed;
    private ArrayList<Item> inventory;
    private ArrayList<SkillRank> skillranks;
    private HashMap<String, SpellsByLevel> spellsknown;
    private HashMap<String, SpellsByLevel> spellsprepared;
    private ArrayList<Ability> abilities;
    private ArrayList<String> passives;
    
    /**
     * @param abilityScore Takes an Integer input, typically an ability score from a character
     * @return returns the ability score modifier of the score.
     * This is important in Pathfinder because the modifier is based entirely on the score, but the score itself is still an important stand-alone value
     */
    public static int getModifier(Integer abilityScore)
    {
    		int score = abilityScore.intValue();
    		if(score >= 10)
    		{
    			return (score-10)/2;
    		} else
    		{
    			return score-10;
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
    public void setId(Long id) {
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
    public void setName(String name) {
        this.name = name;
    }
    

    /**
     * @return gets the player ID of the player associated with the character in the form of a Long
     */
    public Long getPlayerid() {
		return playerid;
	}
    

	/**
	 * @param playerid takes a Long input and sets the player ID to the value
	 */
	public void setPlayerid(Long playerid) {
		this.playerid = playerid;
	}
	
	
	/**
	 * @return gets the strength ability score of the character in the form of an Integer
	 */
	public Integer getStrength() {
		return strength;
	}
	

	/**
	 * @param strength takes an Integer input and sets the strength ability score to the value.
	 */
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	

	/**
	 * @return gets the dexterity ability score of the character in the form of an Integer
	 */
	public Integer getDexterity() {
		return dexterity;
	}
	

	/**
	 * @param dexterity takes an Integer input and sets the dexterity ability score to the value.
	 */
	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}
	
	
	/**
	 * @return gets the constitution ability score of the character in the form of an Integer
	 */
	public Integer getConstitution() {
		return constitution;
	}
	

	/**
	 * @param constitution takes an Integer input and sets the constitution ability score to the value.
	 */
	public void setConstitution(Integer constitution) {
		this.constitution = constitution;
	}
	
	
	/**
	 * @return gets the intelligence ability score of the character in the form of an Integer
	 */
	public Integer getIntelligence() {
		return intelligence;
	}
	

	/**
	 * @param intelligence takes an Integer input and sets the intelligence ability score to the value.
	 */
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	

	/**
	 * @return gets the wisdom ability score of the character in the form of an Integer
	 */
	public Integer getWisdom() {
		return wisdom;
	}
	

	/**
	 * @param wisdom takes an Integer input and sets the wisdom ability score to the value.
	 */
	public void setWisdom(Integer wisdom) {
		this.wisdom = wisdom;
	}
	
	
	/**
	 * @return gets the charisma ability score of the character in the form of an Integer
	 */
	public Integer getCharisma() {
		return charisma;
	}
	

	/**
	 * @param charisma takes an Integer input and sets the charisma ability score to the value.
	 */
	public void setCharisma(Integer charisma) {
		this.charisma = charisma;
	}
	
	/**
	 * @return gets the gender of the character in the form of a String.
	 */
	public String getGender() {
		return gender;
	}
	

	/**
	 * @param gender takes a String input and sets the character gender to the value
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	

	/**
	 * @return gets the age in years of the character in Integer form
	 */
	public Integer getAge() {
		return age;
	}
	

	/**
	 * @param age takes an Integer and sets the character age to the value
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	

	/**
	 * @return gets the height in inches of the character in Integer form
	 */
	public Integer getHeight() {
		return height;
	}
	

	/**
	 * @param height takes an Integer and sets the character height to the value
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}
	

	/**
	 * @return gets the weight in pounds of the character in Integer form
	 */
	public Integer getWeight() {
		return weight;
	}
	

	/**
	 * @param weight takes an Integer and sets the character weight to the value
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	

	/**
	 * @return gets a further description of the appearance of the character in String form
	 */
	public String getDescription() {
		return description;
	}
	

	/**
	 * @param description takes a String and sets the character description to the value
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	

	/**
	 * @return gets the base attack bonus of the character in Integer form
	 */
	public Integer getBaseattackbonus() {
		return baseattackbonus;
	}
	

	/**
	 * @param baseattackbonus takes an Integer and sets the character base attack bonus to the value
	 */
	public void setBaseattackbonus(Integer baseattackbonus) {
		this.baseattackbonus = baseattackbonus;
	}
	
	
	/**
	 * @return gets the size modifier of the character in Integer form
	 */
	public Integer getSize() {
		return size;
	}
	

	/**
	 * @param size takes an Integer and sets the character size modifier to the value
	 */
	public void setSize(Integer size) {
		this.size = size;
	}
	
	
	
	/**
	 * @return gets the maximum health of the character in Integer form
	 */
	public Integer getMaximumhealth() {
		return maximumhealth;
	}
	

	/**
	 * @param maximumhealth takes an Integer and sets the character maximum health to the value
	 */
	public void setMaximumhealth(Integer maximumhealth) {
		this.maximumhealth = maximumhealth;
	}
	
	//TODO make a get initiative function that uses a calculating class

	/*public Integer getInitiative() {
		return initiative;
	}*/
	

	
	/**
	 * @return gets the base fortitude of the character in Integer form
	 */
	public Integer getFortitude() {
		return fortitude;
	}
	

	/**
	 * @param fortitude takes an Integer and sets the character base fortitude to the value
	 */
	public void setFortitude(Integer fortitude) {
		this.fortitude = fortitude;
	}
	

	/**
	 * @return gets the base reflex of the character in Integer form
	 */
	public Integer getReflex() {
		return reflex;
	}
	

	/**
	 * @param reflex takes an Integer and sets the character base reflex to the value
	 */
	public void setReflex(Integer reflex) {
		this.reflex = reflex;
	}
	

	/**
	 * @return gets the base will of the character in Integer form
	 */
	public Integer getWill() {
		return will;
	}
	

	/**
	 * @param will takes an Integer and sets the character base will to the value
	 */
	public void setWill(Integer will) {
		this.will = will;
	}
	
	//TODO make a get combat maneuver bonus function that uses a calculating class

	/*public Integer getCombatmaneuverbonus() {
		return combatmaneuverbonus;
	}*/

	
	//TODO make a get combat maneuver defense function that uses a calculating class

	/*public Integer getCombatmaneuverdefense() {
		return combatmaneuverdefense;
	}*/

	

	/**
	 * @return gets the land speed in squares of the character in Integer form
	 */
	public Integer getLandspeed() {
		return landspeed;
	}
	

	/**
	 * @param landspeed takes an Integer and sets the character land speed to the value
	 */
	public void setLandspeed(Integer landspeed) {
		this.landspeed = landspeed;
	}
	

	/**
	 * @return gets the swim speed in squares of the character in Integer form
	 */
	public Integer getSwimspeed() {
		return swimspeed;
	}
	

	/**
	 * @param swimspeed takes an Integer and sets the character swim speed to the value
	 */
	public void setSwimspeed(Integer swimspeed) {
		this.swimspeed = swimspeed;
	}
	

	/**
	 * @return gets the flight speed in squares of the character in Integer form
	 */
	public Integer getFlightspeed() {
		return flightspeed;
	}
	

	/**
	 * @param flightspeed takes an Integer and sets the character flight speed to the value
	 */
	public void setFlightspeed(Integer flightspeed) {
		this.flightspeed = flightspeed;
	}
	

	/**
	 * @return gets the flight maneuverability of the character in String form
	 */
	public String getFlightmaneuverability() {
		return flightmaneuverability;
	}
	

	/**
	 * @param flightmaneuverability takes a String and sets the character flight maneuverability to the value
	 */
	public void setFlightmaneuverability(String flightmaneuverability) {
		this.flightmaneuverability = flightmaneuverability;
	}
	

	/**
	 * @return gets the burrow speed in squares of the character in Integer form
	 */
	public Integer getBurrowspeed() {
		return burrowspeed;
	}
	

	/**
	 * @param burrowspeed takes an Integer and sets the character burrow speed to the value
	 */
	public void setBurrowspeed(Integer burrowspeed) {
		this.burrowspeed = burrowspeed;
	}

	
	/**
	 * @return gets the list of passive affects on the character.  The list is in ArrayList form, and the affects are in String form
	 */
	public ArrayList<String> getPassives() {
		return passives;
	}

	
	//TODO getSpellsknown(Class), addSpellknown(Class, Spell), removeSpellknown(Class, Spell), getSpellsprepared(Class), setSpellsprepared(Class, ArrayList<Spell>), getSpellsslots(Class), setSpellsslots(Class, Integer[10]), getAbilities(), addAbility(Ability), removeAbility(Ability)
	
	/**
	 * @param passive takes a String and adds it to the ArrayList of passive affects on the character
	 */
	public void addPassive(String passive) {
		if(passives == null)
		{
			passives = new ArrayList<String>();
		}
		passives.add(passive);
	}
	
	
	/**
	 * @param passive takes a String and searches the ArrayList of passive affects on the character for a copy of the String.  If the String is found, it is removed from the ArrayList
	 */
	public void removePassive(String passive) {
		passives.remove(passive);
	}
	

	/**
	 * @return gets the list of class levels on the character.  The list is in ArrayList form, and is populated with PathfinderClassLevel
	 */
	public ArrayList<PathfinderClassLevel> getLevels()
	{
		return levels;
	}
	

	/**
	 * @param pathfinderclass takes a class and levels it up, then updates the character based on new total level and class levels
	 */
	public void levelUp(PathfinderClass pathfinderclass)
	{
		//TODO update the character based on total level and class leveled
		for(PathfinderClassLevel classlevel : levels)
		{
			if(classlevel.getPathfinderclass().getName().equals(pathfinderclass.getName()))
			{
				classlevel.levelUp();
				return;
			}
		}
	}
	

	/**
	 * @return gets the race of the character
	 */
	public Race getRace()
	{
		return race;
	}
	

	/**
	 * @param race takes a Race and sets it to the character race
	 */
	public void setRace(Race race)
	{
		this.race = race;
	}
	

	/**
	 * @return gets the list of items in the character inventory.  The list is in ArrayList form, and is populated with Item
	 */
	public ArrayList<Item> getInventory()
	{
		return inventory;
	}
	

	/**
	 * @param item takes an Item, creates a new inventory if one does not yet exist, then puts the item into the character inventory
	 */
	public void addToInventory(Item item)
	{
		if(inventory == null)
		{
			inventory = new ArrayList<Item>();
		}
		inventory.add(item);
	}
	
	/**
	 * @param item takes an Item and removes it from the character inventory
	 */
	public void takeFromInventory(Item item)
	{
		inventory.remove(item);
	}
	

	/**
	 * @return gets the list of character skills with ranks applied.  The list is in ArrayList form, and is populated with SkillRank
	 */
	public ArrayList<SkillRank> getSkillranks()
	{
		return skillranks;
	}
	

	/**
	 * @param skill takes a skill.  If there is not yet a list of skill ranks it makes one. Then it checks if list of character skill ranks already has ranks in the given skill.  if it does, it iterates the rank count for that skill.  if it doesn't, it creates a new SkillRank
	 */
	public void addSkillrank(Skill skill)
	{
		if(skillranks == null)
		{
			skillranks = new ArrayList<SkillRank>();
		}
		for(SkillRank skillrank : skillranks)
		{
			if(skillrank.getSkill().getName().equals(skill.getName()))
			{
				skillrank.addRank();
				return;
			}
		}
		skillranks.add(new SkillRank(skill));
	}
	

	/**
	 * @return gets the list of available abilities.  The list is in ArrayList form, and is populated with Ability
	 */
	public ArrayList<Ability> getAbilities()
	{
		return abilities;
	}
	

	/**
	 * @param ability takes an Ability and adds it to the ArrayList of available abilities for the character
	 */
	public void addAbility(Ability ability)
	{
		abilities.add(ability);
	}
	
	/**
	 * @param ability takes an Ability and searches the ArrayList of abilities for the character for a copy of the ability.  If the ability is found, it is removed from the ArrayList
	 */
	public void removeAbility(Ability ability)
	{
		abilities.remove(ability);
	}

	public HashMap<String, SpellsByLevel> getSpellsknown()
	{
		return spellsknown;
	}

	public void setSpellsknown(HashMap<String, SpellsByLevel> spellsknown)
	{
		this.spellsknown = spellsknown;
	}

	public HashMap<String, SpellsByLevel> getSpellsprepared()
	{
		return spellsprepared;
	}

	public void setSpellsprepared(HashMap<String, SpellsByLevel> spellsprepared)
	{
		this.spellsprepared = spellsprepared;
	}
	
	
}
