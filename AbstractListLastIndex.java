// Java program to demonstrate 
// lastIndexOf() method 
// for String value 
  
import java.util.*; 
  
public class AbstractListLastIndex { 
    public static void main(String[] argv) 
        throws Exception 
    { 
        try { 
  
            // Creating object of AbstractList<String> 
            AbstractList<String> 
                arrlist1 = new ArrayList<String>(); 
  
            // Populating arrlist1 
            arrlist1.add("A"); 
            arrlist1.add("B"); 
            arrlist1.add("A"); 
            arrlist1.add("B"); 
            arrlist1.add("E"); 
  
            // print arrlist1 
            System.out.println("ArrayList : "
                               + arrlist1); 
  
            // getting the index of last occurrence 
            // using lastIndexOf() method 
            int lastindex = arrlist1.lastIndexOf("A"); 
  
            // printing the Index 
            System.out.println("Last index of A : "
                               + lastindex); 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 



