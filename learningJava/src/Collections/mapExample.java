package Collections;
import java.util.*;

public class mapExample {
public static void main(String[] args) {
	
	HashMap<String, Integer> courses = new HashMap<>();
	
	courses.put("core Java", 4000);
	courses.put("basic pyotn", 22222);
	courses.put("basic spring", 393);
	courses.put("basic android", 33393);
	
	System.out.println(courses.get("core Java"));
	
	
	
}
}
