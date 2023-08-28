package JavaPractise;

import java.util.ArrayList;

public class practise {

	public static void main(String[] args) {


		
		int a[]= {4,5,96,96,96,66,66,5,5,5,4,4,4,4,36};
		
		ArrayList <Integer>al = new ArrayList <Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{ 
						k++;
					}
						
				}
				System.out.println("Value "+a[i]+" is repeated "+k+" times");
				if(k==1)
				{
					System.out.println("Unique number - "+a[i]);
				}
			}
					
		}
	}
}
