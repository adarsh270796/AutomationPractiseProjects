package JavaPractise;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayListExample {

	public static void main(String[] args) {
		//can accept duplicate values
		//ArrayList,LinkedList, vector can have duplicate values
		//Array have fixed size whereas arraylist can grow dynamically, we can acccess, remov
		//and add any value in any index
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Adarsh");
		a.add("sourav");
		a.add("sanjeev");
		a.add("sanjeev");
		System.out.println(a);
		a.add(2, "New name");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		
		System.out.println(a.contains("Adarsh"));
		System.out.println(a.indexOf("sourav"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		
		

	}

}
