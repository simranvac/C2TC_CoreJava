package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList da=new LinkedList();
       da.add("Hermione Granger");
       da.add("Neville Longbottom");
       da.add("Luna Lovegood");
       da.add("Harry Potter");
       da.add("Ronaldo Weisley");
       da.add("Bellatrix Lastranger");
       da.add("1455");
     
       System.out.println("Removing last element:"+da.removeLast());
       System.out.println("Accessing First Elemeny:"+da.getFirst());
       
       LinkedList<String>marauder=new LinkedList<String>();
       marauders.add(0,"Seroius Black");
       marauders.add(1,"James Potter");
       marauders.add(2,"Petter pettigrew");
       marauders.add(3,"Professor Lupsin");
       
        String[] otherCharacter=new String[] {"Lord Voldemort","Severus Snape","Lilly Potter","Albus Wulfric brain dumbledore"};
        
        LinkedList impCharacter=new LinkedList(marauders);
	      impCharacter.add(otherCharacter);
	      impCharacter.add(0."Dumbledore's Army");
	      
	      System.out.println("Draco Malfoy");
	      Iterator i=da.iterator();
	      while(i.hasNext())
	      {
	    	  Object o=i.next();
	    	  System.out.println(o);
	      }
	}

}
