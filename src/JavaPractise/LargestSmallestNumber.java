package JavaPractise;

import java.util.Arrays;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		int numbs[] = {-34, -67, 467, 987, 789};
		int largest= numbs[0];
		int smallest= numbs[0];
		
		for(int i=1; i<numbs.length;i++)
			
		{
			if(numbs[i]>largest)
			{
				largest=numbs[i];
			}
			else if(numbs[i]<smallest)
			{
				smallest=numbs[i];
			}
		}
		System.out.println(Arrays.toString(numbs));
		System.out.println("Smallest number is "+smallest);
		System.out.println("Largest number is "+largest);
		
	}

}
