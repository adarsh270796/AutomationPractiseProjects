package JavaPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateStringsUsingList {

	public static void main(String[] args) {
		
		String abc = "Java is great.Python is also great.";
		String[] words = abc.split("\\W");
		
		List<String> al = new ArrayList<>(Arrays.asList(words));
		
		for(String x : al) 
		{
			if(Collections.frequency(al, x)==1) 
			{
				System.out.println(x);
			}
		}
		

	}

}
