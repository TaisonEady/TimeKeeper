package com.devcode.timekeeper.data;

import java.util.ArrayList;




public class LogItem
{

	private String							description;
	private ArrayList<TagItem>			tags;
	private ArrayList<IntervalItem>	intervals;



	// constructor
	public LogItem()
	{
		description = "New Log";
		tags = new ArrayList<TagItem>();
		intervals = new ArrayList<IntervalItem>();
	}



	public String getDescription()
	{
		return description;
	}



	public void setDescription(String description)
	{
		this.description = description;
	}



	public ArrayList<TagItem> getTags()
	{
		return tags;
	}



	public ArrayList<IntervalItem> getIntervals()
	{
		return intervals;
	}

}
