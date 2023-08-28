package JavaPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		
		//First we are storing the values in Hashmap, then into set so
		//that we can print Values and keys seperately
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1,"Good morming");
		hm.put(2, "Sunooo");
	//	hm.remove(2);
		hm.put(1,"Evening");
		System.out.println(hm.get(1));
		Set sm = hm.entrySet();
		Iterator it = sm.iterator();
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getValue());
			System.out.println(mp.getKey());
		}
		}
}
