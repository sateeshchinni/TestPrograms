package com.chinni.hashmap.unique;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SortHashMap().processString("one two one three four five one three");

	}
	
	public void processString(String str){
	    String words[]=str.split(" ");
	    HashMap<String,Integer> hm=new HashMap<String,Integer>();
	   
	    for(int i=0;i<words.length;i++){
	        if(hm.containsKey(words[i])){
	            hm.put(words[i],hm.get(words[i])+1);
	        }else{
	            hm.put(words[i],1);
	        }
	    }
	   
	    System.out.println(hm);
	    
	    List<Map.Entry<String,Integer>> obj= new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
	    
	    //Set<Map.Entry<String,Integer>> obj= hm.entrySet();
	    
	    Collections.sort(obj, new Comparator<Map.Entry<String, Integer>>() {
	    	public int compare(Map.Entry<String, Integer> v1,Map.Entry<String,Integer> v2){
	    		return v2.getValue().compareTo(v1.getValue());
	    	}
		} );
	    
	    System.out.println(obj);
	   
/*	    List<Entry<String,Integer>> set = new LinkedList<Entry<String,Integer>>(hm.entrySet());
	   
	     Collections.sort(set, new Comparator<Entry<String,Integer>>(){
	         public int compare (Entry<String,Integer> e1,Entry<String,Integer> e2){
	            return e2.getValue().compareTo(e1.getValue());
	         }
	       
	     });
	    
	     System.out.println(set);
*/	   
	}
	}
