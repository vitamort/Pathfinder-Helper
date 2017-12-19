package org.schoellerfamily.pathfinderhelper.datamodel;
//TODO create abstract pathfinder-class and separate classes for each pathfinder-class
public abstract class PathfinderClass
{
	private String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

}
