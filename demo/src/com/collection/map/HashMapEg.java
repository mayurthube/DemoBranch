package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEg {

	 public static void main(String args[]) {
		 /* This is how to declare HashMap */
	      Map<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      System.out.println("---"+hmap.put(49, "A55jeet")+"---");
	      System.out.println("---"+hmap.put(50, "A55jeet")+"---");
	      
	      /*Using entrySet()*/
	      System.out.println("\n** Using entrySet() **");
	      for (Entry<Integer, String> entry : hmap.entrySet()){
	    	  	System.out.println(entry.getKey() +" : " + entry.getValue());
		 	 }
	      
	      /*using keySet();*/
	      System.out.println("\n** Using keySet() **");
	      Iterator it = hmap.keySet().iterator();
	      while(it.hasNext()){
	    	  int key =  (int) it.next();
	    	  System.out.println(key +" : " + hmap.get(key));
	      }
	      
	      /*using keySet();*/
	      System.out.println("\n** Using keySet() **");
	      it = hmap.entrySet().iterator();
	      while(it.hasNext()){
	    	  Entry entry =  (Entry) it.next();
	    	  System.out.println(entry.getKey() +" : " + entry.getValue());
	      }
	 }
	 
	 
}


