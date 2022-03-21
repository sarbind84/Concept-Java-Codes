package masterLamda;

import java.util.Iterator;


public abstract class lamdaExpression implements MyInterface {
//	@Override
//	public void run() {
//		
//		try {
//			for(int i =0; i<5;i++) {
//				System.out.println("hello this is run"+i);
//				Thread.sleep(9000);
//			}
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//
//	@Override
//	public  void  sayHello() {
//		System.out.println("this is from other normal interface");
//		
//	}

	 public static void main(String[] args) {
		 
		 Runnable r = ()->{
			 for(int i=0;i<5;i++) {
				 System.out.println("hello"+i);
				 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 
			 
		 };
Thread gun = new Thread(r);
		 
		 gun.start();
		
			 

		 
		 
				 	 
			 

	 
		 
		 
		 
		 
		 
	 
		 
	 
		 //new interface ke class ka object bna rhe hai 
		 //then we can create objects
		 //new MyInterface() - ----- basically this is a new class.
		 
			//using our functional interface
//			@Override
//			public void sayHello() {
//				System.out.println("hello said");
//				
//			}
 
//			obj.sayHello();
		 
		 
		 
		 
			 
			 //using our interface with the help of lamda.	 
//		 MyInterface i = ()->System.out.println("hello");
//				 i.sayHello();
//				 MyInterface i2 = ()->System.out.println("again");
//				 i2.sayHello();
				 
		 
//		 // for sum operation using lamda and class SumInterface
//		 
//		 SumInterface si = (a,b)-> a+b;
//		 System.out.println(si.sum(2, 5));	 
//		 
//		 
//		 
//		 //for string length using lamda and class LengthInter
//		 LengthInter li = (str -> str.length());
//		 
//		  System.out.println("Hello function lamda"+li.getLength("hello12"));
				 
		 
		 
		 
		 
//		 Runnable r = () ->
//			
//			   {
//				   
//			
//				try {
//					for(int i=0;i<6;i++) {
//						System.out.println(i);
//						
//					
//					}
//					
//					Thread.sleep(5000);
//					
//				} catch (Exception e) {
//				e.printStackTrace();
//				}
//				
//			};
			
			//to create a thread on current instance we need a runnable class interface and thread class
		
			//runnable has a run method
			//and we need to run it on a Thread, so we pass the object of runnable in thread and start the run method in thread


	 }


}
