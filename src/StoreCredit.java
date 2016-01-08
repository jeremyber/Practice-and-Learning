import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
	 * Refers to Google Code Jam Question:
	 * https://code.google.com/codejam/contest/351101/dashboard#s=p0
	 * 
*/
public class StoreCredit {

	
	
	/**
	 *  Find the two items that add up to c
	 */
	private static int[] sumOfTwoIndicies(int [] itemsArray, int credit)
	{
		
		int [] arrayToReturn = new int[2];
		for(int j = 0; j<itemsArray.length; j++)
		{
			for(int k = j+1; k<itemsArray.length; k++)
			{
				
				if(itemsArray[j] + itemsArray[k] == credit)
				{
					//System.out.println(itemsArray[j] + " + " + itemsArray[k]  + " =" + sum + ", credit: " + credit);

					arrayToReturn[0] = j+1;
					arrayToReturn[1] = k+1;
					return arrayToReturn;
				}
			}
		}
		return null;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("A-large-practice.in"));
		
		int numTestCases = Integer.parseInt(br.readLine());
		//System.out.println(numTestCases);
		
		int i = 0;
		while(i < numTestCases)
		{
			int credit = Integer.parseInt(br.readLine());
			//System.out.println("credit: " +credit);
			int numItems = Integer.parseInt(br.readLine());
			//System.out.println("numItems " + numItems);
			
			int [] itemsArray = new int [numItems];
			String items = br.readLine();
			String[] itemsList = items.trim().split("\\s+");
			for(int j = 0; j< numItems; j++)
			{
				itemsArray[j] = Integer.parseInt(itemsList[j]);
				//System.out.print(itemsArray[j] + " ");

			}
			//System.out.println();
			
			int [] theTwoIndicies = sumOfTwoIndicies(itemsArray, credit);
			int caseNum = i+1;
			System.out.println("Case #"+ caseNum + ": " + theTwoIndicies[0] + " " + theTwoIndicies[1]);
			i++;

			
			
			
			
		}
	}
}
