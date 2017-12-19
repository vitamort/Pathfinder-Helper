package org.schoellerfamily.pathfinderhelper.datamodel;

public class PathfinderClassLevel
{
	private PathfinderClass pathfinderclass;
	private Integer level;
	public PathfinderClassLevel(PathfinderClass pathfinderclass)
	{
		this.pathfinderclass = pathfinderclass;
		level = Integer.valueOf(1);
	}
	public PathfinderClass getPathfinderclass()
	{
		return pathfinderclass;
	}
	public Integer getLevel()
	{
		return level;
	}
	public void levelUp()
	{
		level = Integer.valueOf(level.intValue() + 1);
	}
}
