package streamApi;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Bilogics {
	
	public static void main(String[] args) {
		
		//BICONSUMER
//		BiConsumer<Integer, Integer>  bic = (t,u) -> {
//			System.out.println(t);
//			System.out.println(u);
//		};
//		bic.accept(3, 4);
		
		//BIFUNCTION
//		BiFunction<Integer, Integer, Integer> bif = (i,j)->i+j;
//		System.out.println(bif.apply(3, 4));
		
		BiPredicate<Integer, Integer> bip = (i,j) -> i+j<4;
		
		System.out.println(bip.test(2, 4));
		
		
	}
	
	
	

}
