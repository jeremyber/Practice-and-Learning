package round1a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class MinimumScalarProduct {

	private static Long getMinScalarProduct(ArrayList<Long> v1, ArrayList<Long> v2, int size)
	{
		
		Long numToReturn = new Long(0);
		
		Collections.sort(v1);
		Collections.sort(v2);
		
		for(int i = 0; i<size; i++)
		{
			Long v1_min = v1.get(0);
			Long v2_min = v2.get(0);
			
			
			if(v1_min < v2_min)
			{
				numToReturn += v1_min * v2.get(v2.size()-1) ; 	//min * max of other
				v1.remove(0);
				v2.remove(v2.size()-1);
			}
			else
			{
				numToReturn += v2_min * v1.get(v1.size()-1);
				v2.remove(0);
				v1.remove(v1.size()-1);
			}
		}
		
		return numToReturn;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader(new FileReader("minimumscalarproductfiles/A-large-practice.in"));
		
		int numTestCases = Integer.parseInt(br.readLine());
		
		int i = 1;
		while(i <= numTestCases)
		{
			int size = Integer.parseInt(br.readLine());
			String []  arrayString1 = br.readLine().split(" ");
			String [] arrayString2 = br.readLine().split(" ");
			
			ArrayList<Long> v1 = new ArrayList<Long>();
			ArrayList<Long> v2 = new ArrayList<Long>();
			for(int j=0; j<arrayString1.length; j++)
			{
				v1.add(Long.parseLong(arrayString1[j]));
				v2.add(Long.parseLong(arrayString2[j]));

			}

			long minScalarProduct = getMinScalarProduct(v1, v2, size);
			System.out.println("Case #" + i + ": "+minScalarProduct);
			
			i++;
		}
		
		
	}
}
