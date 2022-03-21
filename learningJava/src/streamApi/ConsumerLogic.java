package streamApi;

import java.util.function.Consumer;

public class ConsumerLogic {
	
	
	public static void main(String[] args) {
		
		//without lamda
//		Consumer<Integer> c = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		};
//		
//		c.accept(4);
		
		//consumer me COMPOSITE nhi hota
		
		
		//with lamda
		Consumer<Integer> c = (t)-> System.out.println(t);
		
		//consumer only accepts 
		
		c.accept(6);
		
	}

}
