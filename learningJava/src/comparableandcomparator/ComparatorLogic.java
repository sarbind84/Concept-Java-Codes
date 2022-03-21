package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//comparable and comparator both are interface


public class ComparatorLogic{
	
	 public ComparatorLogic(double rating, String name,int year) {
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
		
	public static void main(String[] args) {
				Comparator<ComparatorLogic> comp = new Comparator<ComparatorLogic>() {

					@Override
					public int compare(ComparatorLogic o1, ComparatorLogic o2) {
						
						if (o1.getYear()<o2.getYear())  {
							
								return o1.getName().compareTo(o2.getName());
						}
						else {
							return o1.getName().compareTo(o2.getName());
						}
						
						//for only sorting by year
//						return o1.getYear()-o2.getYear();
						
					}	
				};
				
				
				ArrayList<ComparatorLogic> al = new ArrayList<>();
				al.add(new ComparatorLogic(0.3, "ehe", 122));
				al.add(new ComparatorLogic(0.4, "ahe", 112));
				al.add(new ComparatorLogic(0.5, "the", 1222));
				al.add(new ComparatorLogic(0.1, "ihe", 123));
				al.add(new ComparatorLogic(0.1, "iae", 122222));
				
				Collections.sort(al, comp);
				
				for(ComparatorLogic i : al) {
					
					System.out.println(i.getName()+" "+i.getRating()+" "+i.getYear());
					
				}
				
				
				
				
}
	
}















