import java.util.*;  
public class HashMapExample2{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();    
   map.put(1,"[Stock Name - Apple Inc , Stock Id - AAPL , Price - 98.94] ");   
   map.put(2,"[Stock Name - HPQ        , Stock Id - HPQ   , Price - 76.87]");    
   map.put(3,"[Stock Name - Axis Bank , Stock Id - AXLB , Price - 73.94]");   
   
       
   System.out.println("Demat Account ");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
} 