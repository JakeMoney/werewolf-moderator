package com.carter.jacob.werewolfmoderatorapp.Model;

/**
 * Created by jacob on 5/27/2017.
 */

public class EventCard
{
	private int id;
	private String name;
	private String description;
	private boolean active;
	
	EventCard(int id, String name, String description)
	{
		this.id = id;
		this.name = name;
		this.description = description;
		active = true;
	}
	
	
	public void setActive(boolean active)
	{
		this.active = active;
	}
	
	public boolean isActive()
	{
		return active;
	}
	
	public String getName()
	{
		return name;
	}
	
	
}
