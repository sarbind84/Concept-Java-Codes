package streamApi;

import java.util.function.Predicate;

public class PredicateLogic {
	
	 public static void main(String[] args)
	    {
	        // Creating predicate
//	        Predicate<Integer> lesserthan = i -> (i < 18); 
		 //Not Using predicate 
	        
//	        Predicate<Integer> lesserthan = new Predicate<Integer>() {
//
//				@Override
//				public boolean test(Integer t) {
//					
//					if (t<5) {
//						return true;
//					}
//					else {
//						return false;
//					}
//					
//				}	
//	        };   
//	        
//	        boolean n =lesserthan.test(3);
//	        
//	        System.out.println(n);
	        

	        // Using Lamda
		 
		 Predicate<Integer> li = (t)->t<5;
	
		 System.out.println(li.test(6));
	        
	        
	        
	        
	        
	        
	}
}

