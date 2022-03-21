package Collections;

import java.util.*;

public class play {
	
	//collections are 2 types 
	//type safe and untype safe
	
	public static void main(String[] args) {
		
		ArrayList<Integer> names = new ArrayList<>();
		names.add(5);
		names.add(9);
		names.add(1);
		names.add(2);

//		LinkedList list = new LinkedList<>();
//		list.addAll(names);
	
//		TreeSet<Integer> list = new TreeSet<>();
//		list.addAll(names);
//		System.out.println(list);
		
	
		Iterator<Integer> itr = names.iterator();
		 
		//has next will return a boolean 
		//next will return a value
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}

}
