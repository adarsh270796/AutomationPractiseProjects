package JavaPractise;

import java.util.ArrayList;

public class UniqueNumberInArray {

	public static void main(String[] args) {
		
		
		int a[]= {14, 14,14, 5, 86, 86,7,7, 95, 95,5,5,9};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i =0; i<a.length;i++)
		{   
			int k=0;
			
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				for(int j=i+1; j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				
				System.out.println("Value "+a[i]+" is repeated "+k+" times");
			//	System.out.println(k);
				if(k==1)
				{
					System.out.println("Unique number is "+ a[i]);
				}
			}
			
			
         }
	}

}
