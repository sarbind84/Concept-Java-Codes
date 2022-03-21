package streamApi;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrograms {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> names = new ArrayList<>();
		names.add(5);
		names.add(9);
		names.add(1);
		names.add(2);
		
        //names.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
		Stream<Integer> hi = names.stream().filter(num -> num > 5);
		hi.forEach(x->System.out.println(x));
		
		//List<Integer> sint =names.stream().filter(num -> num > 5).collect(Collectors.toList());
        
		//sint.forEach(i->System.out.println(i));

		
		//yha ka for each only takes consumer
		 //streama.forEach(x->System.out.println(x));
		
	 
		

	}

}
