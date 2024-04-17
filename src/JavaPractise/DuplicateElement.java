package JavaPractise;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		String names[]= {"Adarsh", "Sumit", "Lighter", "Sheetal", "Lighter"};
		
		Set <String> store = new HashSet<String>();
		for (String name : names)
		{
			if(store.add(name)==false)
			{
				System.out.println("Duplicate element is "+ name);
			}
		}
		
	}

}
