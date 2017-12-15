package org.schoellerfamily.pathfinderhelper.datamodel;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
    //private PathfinderClassLevel levels[];
    //private Race race;
    private String gender;
    private Integer age;
    private Integer height;//inches
    private Integer weight;
    private String description;
    private Integer baseattackbonus;
    private Integer size;
    private Integer maximumhealth;
    private Integer initiative;
    private Integer fortitude;
    private Integer reflex;
    private Integer will;
    private Integer combatmaneuverbonus;
    private Integer combatmaneuverdefense;
    private Integer landspeed;
    private Integer swimspeed;
    private Integer flightspeed;
    private String flightmaneuverability;
    private Integer burrowspeed;
    //private Item inventory[];
    //private SkillRank skillranks[];
    //private HashMap<String, HashMap<Integer, ArrayList<Spell>>> spellsknown;
    //private HashMap<String, HashMap<Integer, ArrayList<Spell>>> spellsprepared;
    //private HashMap<String, Integer[10]> spellslots;
    //private ArrayList<Ability> abilities;
    private ArrayList<String> passives;
    
    public Character() {
    		id = null;
    		name = null;
    		setPlayerid(null);
    		strength = new Integer(10);
    		dexterity = new Integer(10);
    		constitution = new Integer(10);
    		setIntelligence(new Integer(10));
    		wisdom = new Integer(10);
    		setCharisma(new Integer(10));
    		//levels = new PathfinderClass[0];
    		//race = null;
    		baseattackbonus = new Integer(0);
    		size = new Integer(0);
    		setMaximumhealth(new Integer(6));
    		setInitiative(0);
    		setFortitude(new Integer(getModifier(constitution)));
    		setReflex(new Integer(getModifier(dexterity)));
    		setWill(new Integer(getModifier(wisdom)));
    		setCombatmaneuverbonus(new Integer(baseattackbonus + getModifier(strength) + size.intValue()));
    		setCombatmaneuverdefense(new Integer(baseattackbonus + getModifier(strength) + getModifier(dexterity) + size.intValue()));
    		setLandspeed(new Integer(6));
    	    setSwimspeed(new Integer(0));
    	    setFlightspeed(new Integer(0));
    	    setFlightmaneuverability(null);
    	    setBurrowspeed(new Integer(0));
    		//inventory = new Item[0];
    		//skillranks = new Skill[0];
    }
    
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
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPlayerid() {
		return playerid;
	}

	public void setPlayerid(Long playerid) {
		this.playerid = playerid;
	}
	
	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getDexterity() {
		return dexterity;
	}

	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}
	
	public Integer getConstitution() {
		return constitution;
	}

	public void setConstitution(Integer constitution) {
		this.constitution = constitution;
	}
	
	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getWisdom() {
		return wisdom;
	}

	public void setWisdom(Integer wisdom) {
		this.wisdom = wisdom;
	}
	
	public Integer getCharisma() {
		return charisma;
	}

	public void setCharisma(Integer charisma) {
		this.charisma = charisma;
	}
	
	//TODO getLevels(), addLevels(Class), getRace, setRace
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getBaseattackbonus() {
		return baseattackbonus;
	}

	public void setBaseattackbonus(Integer baseattackbonus) {
		this.baseattackbonus = baseattackbonus;
	}
	
	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	
	public Integer getMaximumhealth() {
		return maximumhealth;
	}

	public void setMaximumhealth(Integer maximumhealth) {
		this.maximumhealth = maximumhealth;
	}

	public Integer getInitiative() {
		return initiative;
	}

	public void setInitiative(Integer initiative) 
    {
		this.initiative = initiative;
	}
	
	public Integer getFortitude() {
		return fortitude;
	}

	public void setFortitude(Integer fortitude) {
		this.fortitude = fortitude;
	}

	public Integer getReflex() {
		return reflex;
	}

	public void setReflex(Integer reflex) {
		this.reflex = reflex;
	}

	public Integer getWill() {
		return will;
	}

	public void setWill(Integer will) {
		this.will = will;
	}

	public Integer getCombatmaneuverbonus() {
		return combatmaneuverbonus;
	}

	public void setCombatmaneuverbonus(Integer combatmaneuverbonus) {
		this.combatmaneuverbonus = combatmaneuverbonus;
	}

	public Integer getCombatmaneuverdefense() {
		return combatmaneuverdefense;
	}

	public void setCombatmaneuverdefense(Integer combatmaneuverdefense) {
		this.combatmaneuverdefense = combatmaneuverdefense;
	}

	public Integer getLandspeed() {
		return landspeed;
	}

	public void setLandspeed(Integer landspeed) {
		this.landspeed = landspeed;
	}

	public Integer getSwimspeed() {
		return swimspeed;
	}

	public void setSwimspeed(Integer swimspeed) {
		this.swimspeed = swimspeed;
	}

	public Integer getFlightspeed() {
		return flightspeed;
	}

	public void setFlightspeed(Integer flightspeed) {
		this.flightspeed = flightspeed;
	}

	public String getFlightmaneuverability() {
		return flightmaneuverability;
	}

	public void setFlightmaneuverability(String flightmaneuverability) {
		this.flightmaneuverability = flightmaneuverability;
	}

	public Integer getBurrowspeed() {
		return burrowspeed;
	}

	public void setBurrowspeed(Integer burrowspeed) {
		this.burrowspeed = burrowspeed;
	}

	
	public ArrayList<String> getPassives() {
		return passives;
	}

	
	//TODO getSpellsknown(Class), addSpellknown(Class, Spell), removeSpellknown(Class, Spell), getSpellsprepared(Class), setSpellsprepared(Class, ArrayList<Spell>), getSpellsslots(Class), setSpellsslots(Class, Integer[10]), getAbilities(), addAbility(Ability), removeAbility(Ability)
	
	public void addPassive(String passive) {
		passives.add(passive);
	}
	
	public void removePassive(String passive) {
		passives.remove(passive);
	}
	
}