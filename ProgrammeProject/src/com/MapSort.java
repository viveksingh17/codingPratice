package com;
import java.util.*;
import java.util.Map.Entry;

public class MapSort {

		public static void main(String args[])
		{
			Map<Integer,Integer> map=new HashMap<>();
			map.put(3,1);
			map.put(6,2);
			map.put(2,7);
			System.out.println("Unsorted collections");
			Set<Entry<Integer,Integer>> entries=map.entrySet(); 
			for(Entry<Integer,Integer> m:entries)
			{
				System.out.println(m.getValue()+" "+m.getKey());
			}
			
			
			System.out.println("After Sorting");
			
			
			/**
			 * Implement comprator sort to compare on basis of value 
			 * Make object of Comparator with Set as arguments.
			 */
			Comparator<Entry<Integer, Integer>> valueComparator = new Comparator<Entry<Integer,Integer>>() {
	            
	            @Override
	            public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
	                Integer v1 = e1.getValue();
	                Integer v2 = e2.getValue();
	                return v1.compareTo(v2);
	            }
	        };
	        
	        /**
	         * As we can't directly sort map values we have to convert that into list
	         */
	        List<Entry<Integer,Integer>> l1=new ArrayList<>(entries);
			Collections.sort(l1,valueComparator);
			
			
			/**
			 * Now convert
			 */
			
			LinkedHashMap<Integer, Integer> sortedByValue = new LinkedHashMap<>(l1.size());
			// copying entries from List to Map
	        for(Entry<Integer, Integer> entry : l1){
	            sortedByValue.put(entry.getKey(), entry.getValue());
	        }
	        
	        System.out.println("HashMap after sorting entries by values ");
	        Set<Entry<Integer, Integer>> entrySetSortedByValue = sortedByValue.entrySet();
	        
	        for(Entry<Integer, Integer> mapping : entrySetSortedByValue){
	            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
	        }
			}
		
}
