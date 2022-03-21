package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class traverseExample {
 
	
	public static void main(String[] args) {
	 
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Arbind");
		names.add("Vandana");
		names.add("code");
		names.add("that");
		
		//for each loop:
//	    for(String str : names) {
//	    	
//	    	System.out.println(str +"\t"+ str.length());
//	    	
//	    	StringBuffer br= new StringBuffer(str);
//	    	System.out.println(br.reverse());
//	    }
	    
	    System.out.println("------------------------------------------");
		
		//traversal using ITERATOR
	    //FORWARD TRAVERSING
	    
//	    Iterator<String> itr = names.iterator();
//	    
//	    while(itr.hasNext()) {
//	    	String h =itr.next();
//	    	System.out.println(h);
//	    }
	    
	    
	    //using list operator
	    //for forward and backward traverse
	    
//	    ListIterator<String> list =names.listIterator(names.size());
//	    
//	    while(list.hasPrevious()) {
//	    	String previous =list.previous();
//	    	
//	    	System.out.println(previous);
//	    }
	    
	    
	    //for each method
 	   System.out.println("-------------------------------");
      
 	   names.forEach(e->System.out.println(e));
//        names.forEach(System.out::println);
 	   
 	  
        
 	    
	    
	    
	   
	    
	    
	}

}
