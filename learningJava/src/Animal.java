
public class Animal {
	 
		String color="white";  
		}  

class jatindog extends Animal{
	String color = "tatti";
}
		class Dog extends jatindog{  
		String color="black";  
		void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
		} 
		
		}  
		class TestSuper1{  
		public static void main(String args[]){  
		Dog d=new Dog();  
		d.printColor();  
		}}  

 