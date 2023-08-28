package JavaPractise;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetWithIteratorExample {

	public static void main(String[] args) {
		
		//HashSet, TreeSet, LinkedHashSet implement set interface
		//doesn't accept duplicate values
		//There is no guarantee elements stored in sequential order..random order
		
		
	    HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("US");
		hs.add("India");
		hs.add("uk");
		hs.add("I");
		hs.add("love");
		hs.add("my");
	
		System.out.println(hs);
//		System.out.println(hs.size());
//		System.out.println(hs.remove("uk"));
//	    System.out.println(hs.size());
//		System.out.println(hs);
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		 
		
		
		
		
		
		

	}

}
