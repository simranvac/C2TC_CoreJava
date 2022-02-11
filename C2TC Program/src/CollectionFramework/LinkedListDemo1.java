package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          LinkedList l1=new LinkedList();
          l1.add(new Integer (10));
          l1.add("Hi");
          l1.addFirst("Hello");
          l1.add(0,20);
          l1.add(20);
          l1.add(2,30);
          l1.remove(2);
          System.out.println(l1);
          Iterator i1=l1.iterator();
          while(i1.hasNext())
          {
        	  Object o=i1.next();
        	  System.out.println(0);
          }
	}

}
