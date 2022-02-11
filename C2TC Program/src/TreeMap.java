import java.util.*;

 class TreeMap {

	public static void main(String[] args) {
       java.util.TreeMap<Integer,String> map=new TreeMap<Integer,String>();
       map.put(100, "Amit");
       map.put(102, "Ravi");
       map.put(101,"Vijay" );
       map.put(103, "Rahul");
       //map.put(null,"Xaviour");
       map.put(105,null);
       
       for(Map.entry m:map.entrySet()){
    	   System.out.println(m.getKey()+" "+ m.getValue());
    	   
       }

	}

}
