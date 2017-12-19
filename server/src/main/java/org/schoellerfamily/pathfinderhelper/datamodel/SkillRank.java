package org.schoellerfamily.pathfinderhelper.datamodel;

public class SkillRank
{
	private Skill skill;
	private Integer ranks;
	public SkillRank(Skill skill)
	{
		this.skill = skill;
		ranks = Integer.valueOf(1);
	}
	public Skill getSkill()
	{
		return skill;
	}
	public Integer getRanks()
	{
		return ranks;
	}
	public void addRank()
	{
		ranks = Integer.valueOf(ranks.intValue() + 1);
	}
}
