package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


//comparable and comparator both are interface

public class comparablelogic implements Comparable<comparablelogic>{
	
	 public comparablelogic(double rating, String name,int year) {
		 this.rating= rating;
		 this.name=name;
		 this.year=year;	
		}
	
	 private double rating;
	 private String name;
	 private int year;
 
	 // Getter methods for accessing private data
	 public double getRating() { return rating; }
	 public String getName()   {  return name; }
	 public int getYear()      {  return year;  }

//	@Override
//	public int compareTo(comparablelogic o) {
//		
//		return 0;
//	}
		@Override
		public int compareTo(comparablelogic o) {
			
			//kiske base pe krna h sorting haina
//			return this.year-year;
		
//		??how to compare string
			
//			
			
			return this.getName().compareTo(o.getName());
			
		//if(this.getName().compareTo(o.getName())) {
//			return 0;
//			
//		}else {
//			return -1;
//		}
//			
			
			 
		}
		
		
	public static void main(String[] args) {
		
		
		ArrayList<comparablelogic> al = new ArrayList<>();
		al.add(new comparablelogic(19.00,"ehello1",2015));
		al.add(new comparablelogic(19.00,"ahello22",1977));
		al.add(new comparablelogic(19.00,"ghello33",1980));
		 
		Collections.sort(al);
		
		for(comparablelogic obj:al) {
			
 
			
			System.out.println(obj.getName()+" "+obj.getRating()+" "+obj.getYear()
			
			
					);
			
		}

	}


	 
	 

}
