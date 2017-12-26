package org.schoellerfamily.pathfinderhelper.datamodel;

/**
 * Represents the skill / rank relationship.
 *
 * @author jonathanschoeller
 */
public class SkillRank {
    /**
     * Holds the associated skill.
     */
    private Skill skill;

    /**
     * Holds the rank count.
     */
    private Integer rankCount;

    /**
     * Constructor.
     *
     * @param skill the associated skill
     */
    public SkillRank(final Skill skill) {
        this.skill = skill;
        rankCount = Integer.valueOf(1);
    }

    /**
     * @return the skill
     */
    public Skill getSkill() {
        return skill;
    }

    /**
     * @param skill the skill to set
     */
    public void setSkill(final Skill skill) {
        this.skill = skill;
    }

    /**
     * @return the rank count
     */
    public Integer getRankCount() {
        return rankCount;
    }

    /**
     * @param rankCount the rank count to set
     */
    public void setRankCount(final Integer rankCount) {
        this.rankCount = rankCount;
    }

    /**
     * Increment the rank count.
     */
    public void incrementRankCount() {
        rankCount = Integer.valueOf(rankCount.intValue() + 1);
    }
}
