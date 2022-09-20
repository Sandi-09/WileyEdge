package com.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class NestedMapWithList {


		HashMap<String, ArrayList<Car>> cars = new HashMap<String, ArrayList<Car>>(); 
		
		public static void main(String[] args) {
			NestedMapWithList list=new NestedMapWithList();
			list.addToList("Tata", new Car("abc123",2));
			list.addToList("Tata", new Car("abc123",2));
			list.addToList("vokeswagon", new Car("abc123",6)); 		
			
		}
		public void addToList(String mapKey, Car myCar) { 
			
			ArrayList<Car> carsList = cars.get(mapKey); 
		 
		    // if list does not exist create it 
		    if(carsList == null) { 
		         carsList = new ArrayList<Car>(); 
		         carsList.add(myCar); 
		         cars.put(mapKey, carsList); //making the entry of new key in the map, if not available
		      
		    } else { 
		        // add if Car is not already in list 
		    	
		    	System.out.println(myCar);
		    	 //if(carsList.contains(myCar) || cars.containsKey(mapKey))
		        if(carsList.contains(myCar)) {
		        	System.out.println("Duplicate entry found");
		        }
		        else
		        	carsList.add(myCar); 
		    } 
		    System.out.println(cars);
		}   

	}


