package service;
import java.util.*;
import model.TouristPlace;
public class SetOperations 
{
	HashSet<TouristPlace> set=new HashSet<TouristPlace>();
	public HashSet<TouristPlace> add(TouristPlace places)
	{
		 set.add(places);
		return set;
	}
	public HashSet<TouristPlace> remove(TouristPlace places)
	{
		set.remove(places);
		return set;
	}
	public Object sortByDestination(HashSet<TouristPlace> places)
	{
		TreeSet<TouristPlace> set = new TreeSet<TouristPlace>((o1, o2) -> o1.getDestination().compareTo(o2.getDestination()));
		for(TouristPlace p:places)
		{
			set.add(p);
		}
		return set;	
	}
	public Object sortByRank(HashSet<TouristPlace> places)
	{
		TreeSet<TouristPlace> set = new TreeSet<TouristPlace>((o1, o2) -> o1.getRank().compareTo(o2.getRank()));
		for(TouristPlace p:places)
		{
			set.add(p);
		}
		return set;
	}
	public Object reset(HashSet<TouristPlace> set)
	{
		set.clear();
		return  set;		
	}
}
