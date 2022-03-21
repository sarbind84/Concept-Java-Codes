package streamApi;

import java.util.Optional;

public class Optionalclass {
	
	// Driver code
    public static void main(String[] args)
    {
  
//        // creating a string array
//        String[] str = new String[5];
//  
//        // Setting value for 2nd index
//        str[2] = "Geeks Classes are coming soon";
//  
//        // It returns an empty instance of Optional class
//        Optional<String> empty = Optional.empty();
//        System.out.println(empty);
//  
//        // It returns a non-empty Optional
//        //It returns value of an Optional.
//        // If value is not present, it throws
//        // an NoSuchElementException
//        
//        
//        
//        Optional<String> value = Optional.of(str[2]);
//        System.out.println(value.get());
    	
    	
    	String[] arr = new String[10];
    	
    	arr[2]="hello world of strings";
    	
    	//objopt me ya to dabba milega ya value
    	Optional<String> objopt = Optional.of(arr[2]);    
    	
    	String i =objopt.get();
    	
    	System.out.println(i);
    	
    	
    	
    }

}
