package org.schoellerfamily.pathfinderhelper.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Represents the skill / rank relationship.
 *
 * @author jonathanschoeller
 */
@Entity
public class SkillRank {
    /**
     * SkillRank object ID.
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
     * Holds the associated skill.
     */
    @OneToOne
    private Skill skill;

    /**
     * Holds the rank count.
     */
    private Integer rankCount;

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
