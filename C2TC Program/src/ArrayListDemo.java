import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student1 s1=new Student1(101,"Harry,10");
   Student1 s2=new Student1(102,"Potter",10);
   @SuppressWarnings("removal")
Integer i=new Integer(100);
   String s="Collection Example";
   @SuppressWarnings("removal")
Float f=new Float(22.22f);
	@SuppressWarnings("removal")
	Character ch=new Character('Ç');
    Employee1 e1=new
    Employee1(101,"Harry","harry@gmail.com",40000.0f);
    Employee2 e2=new
     Employee(102,"Potter","potter@gmail.com",41000.0f);
    	Employee e3=new
    					
    	Employee(103,"Thor","Thor@gmail.com",45000.0f);
    	Employee e4=new
    	Employee(104,"Hulk","Hulk@gmail.com",40000.0f);
    	
    	ArrayList<E> al1=new ArrayList();
    	al1.add( 0,i);
    	al1.add(1,s);
    	al1.add(s1);
    	al1.add(s2);
    	
    	System.out.println("Size:"+al1.size());
    	ArrayList al2=new ArrayList(al1);
    	al2.add(e1);
    	al2.add(e2);
    	al2.add(e3);
    	al2.add(e4);
    	//al2.addAll(al1);
    	
    	System.out.println("Size:"+al2.size());
    	Iterator<E> i1=al2.iterator();
    	while(i1.hasNext())
    	{ 
    		Object o=i1.next();
    		System.out.println(o);
    	}
}
}