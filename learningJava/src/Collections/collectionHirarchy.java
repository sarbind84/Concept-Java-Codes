package Collections;
//import util package[all classes]

import java.util.*;

public class collectionHirarchy {

public static void main(String[] args) {
	
	
	  /*
	   * 
	   * creating collection
	   * 1)Type Safe - same type of elements are added to collection.
	   * 2)Un type safe - Different types of elements can be added.
	   * 
	   */
	
	//TYPE SAFE COLLECTION
	
//	
	ArrayList<String> names = new ArrayList<>();
	names.add("Arbind");
	names.add("Vandana");
	names.add("code");
	names.add("that");
//	
//	//replace the first element
//	names.set(1, "replace");
//	
//	//shift other element and add to that place
//	names.add(1, "Ram");
//	
//	
//	names.remove("Vandana");
//	
////  System.out.println(names);
//  System.out.println(names);
//  System.out.println("SIZE = "+ names.size());
//  
//  //returns true or not
//  //type ka equals method call krta hai
//  System.out.println(names.contains("that"));
// 
  
//================================================================================
	//UNTYPE SAFE COLLECTION
  

//  LinkedList list = new LinkedList();
//	
//	list.add("scahi");
//	list.add(2);
//	list.add(true);
//	
//	System.out.println(list);
//	
//	
  
//================================================================================

  //VECTOR COLLECTION EXAMPLES
  
  Vector<String> vector = new Vector<>();
  vector.addAll(names);
   
  System.out.println("=================\n");
  System.out.println(vector);
  
  
  //Transversing through enum
  Enumeration<String> e = vector.elements();
  
  //hasnextelement returns boolean value
  while(e.hasMoreElements()) {
	  
	  //next element returns value
	  System.out.println(e.nextElement());
  }
  
  
  
  
  
  
  
//================================================================================
  
	
////	Orderis not preserved in hashset
// HashSet<Double> nms  = new HashSet<>();
// nms.add(12.12);
// nms.add(34.12);
// nms.add(2323.12);
////  
// nms.add(5.0);
//  
//  System.out.println(nms);
//	
//  
////================================================================================
//	TreeSet<Double> treeset = new TreeSet<>();
//	treeset.addAll(nms);
//	 
//	System.out.println("\n");
//	
//	System.out.println(nms);
	 

	
}
}
