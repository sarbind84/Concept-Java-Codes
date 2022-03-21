package streamApi;

import java.util.function.Function;

public class FunctionLogic {
	  public static void main(String[] args) {

//	        Function<String, Integer> func = x -> x.length();
//
//	        Integer apply = func.apply("mkyong");   // 6
//
//	        System.out.println(apply);
		  
		  //Function is a functional interface and T is input and R is output
		  
//		  Function<String, Integer> func = new Function<String, Integer>() {
//
//			@Override
//			public Integer apply(String t) {				
//				return t.length();
//			}
//		};
//		
//		System.out.println(func.apply("hello"));
		  
		  Function<String, Integer> func = (t)-> t.length();
		  //functions only apply
		  System.out.println(func.apply("hello"));

	    }

}
