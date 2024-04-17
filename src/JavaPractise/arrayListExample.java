package JavaPractise;

import java.util.ArrayList;
import java.util.Iterator;
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
		
		//printing element using iterator
//		Iterator <String> it = a.iterator();
//		while(it.hasNext())
//		{
//			System.out.print(it.next());
//		}
		
		
		//Iterating elements using advance for loop
//		for(String ele : a)
//			
//		{
//			System.out.print(" "+ele);
//		}
//	
		
		
		//Iterating elements using for loop
//		for(int i=0;i<a.size();i++)
//		{
//			System.out.print(a.get(i));
//		}
	
	}

}
