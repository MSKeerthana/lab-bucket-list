package service;


import java.util.*;

import model.TouristPlace;

public class ListOperations
{
	List<TouristPlace> list = new ArrayList<TouristPlace>();
	public List add(TouristPlace places)
	{
		list.add(places);
		return list;
	}
	public List remove(TouristPlace places)
	{
		list.remove(places);
		return list;
	}
	public Object sortByDestination(List<TouristPlace> places)
	{
		list.sort((TouristPlace s1, TouristPlace s2)->s1.getDestination().compareTo(s2.getDestination()));
		return list;
	}
	public Object sortByRank(List places)
	{
		list.sort((TouristPlace tp1,TouristPlace tp2)->tp1.getRank().compareTo(tp2.getRank()));
		return list;
	}
	public Object reset(List places)
	{
		list.clear();
		return list;
	}
}