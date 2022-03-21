package masterLamda;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicatesTopic {
public static void main(String[] args) {
	
	//WITHOUT USING LAMDA predicate interface
	
//	Predicate<String> checklength = new Predicate<String>() {
//
//		@Override
//		public boolean test(String t) {
//			if(t.length()>5) {
//				return true;
//			}
//			return false;
//		}
//	};
//	System.out.println(checklength.test("hello"));
	
	//USING LAMDA
	
//	Predicate<String> checklength = (s)-> s.length() >= 5;
//	
//	System.out.println(checklength.test("hello"));
	
	
	//Function interface 
	
	Function<Integer, Integer> square = (i)->i*i;
	System.out.println(square.apply(5));
	
	
	
	
	
}
}
