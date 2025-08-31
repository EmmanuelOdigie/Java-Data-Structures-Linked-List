package JavaLinkedList; // Project created with eclipse

import java.util.LinkedList; // imported linkedlist class
import java.util.Collections; // imported collections class


public class MyLinkedList {//public class created

	public static void main(String[] args) { // reads,runs & executes code
		
// created an object of the linkedlist imported class named 'myLinkedList' 
// linkedlist class takes a String (txt) value and its set up like this LinkedList<String>
		LinkedList<String> myLinkedList = new LinkedList<String>(); 

	// used the object created and the '.add' function to put in names of cars into the object
		myLinkedList.add("Volvo");
		myLinkedList.add("Mercedeze");
		myLinkedList.add("Audi");
		myLinkedList.add("Mazda");
		myLinkedList.add("Cetreon");
		myLinkedList.add("Fiat");
	
	// used the imported collections class and the '.sort' function 
	// to sort name of cars alphabetically 
		Collections.sort(myLinkedList);
	
	// used for loop to create a String(txt) attribute named 'car'	which then calls onto the
	// object created 'myLinkedList' which has all the String(txt) values in from the '.add' function
	// then it displays the car names from attribute 'car' where all information is stored in
		for(String car: myLinkedList) {
			System.out.println(car);
		}
		

	}

}