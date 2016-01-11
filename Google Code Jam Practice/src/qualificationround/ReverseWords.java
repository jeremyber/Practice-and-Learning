package qualificationround;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * * Refers to Google Code Jam Question:
 * https://code.google.com/codejam/contest/351101/dashboard#s=p1
 * @author jbera
 *
 */
public class ReverseWords {

	
	
	private static String [] reverseTheArray(String [] arr)
	{
		String [] toReturn = new String[arr.length];
		
		int j = 0;
		for(int i = arr.length-1; i>=0; i--)
		{
			
			toReturn[j] = arr[i];
			j++;
		}
		
		return toReturn;
		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
			
			BufferedReader br = new BufferedReader(new FileReader("reversewordsfiles/B-large-practice.in"));
			
			int numTestCases = Integer.parseInt(br.readLine());
			
			int i = 1;
			while(i <= numTestCases)
			{
				String lineToReverse = br.readLine();
				String [] tokenizedLine = lineToReverse.split(" ");
				
				String [] reversedArray = reverseTheArray(tokenizedLine); 
				
				
				System.out.print("Case #" + i + ": ");
				for(int j = 0; j<reversedArray.length; j++)
				{
					System.out.print(reversedArray[j] + " ");
				}
				
				System.out.println();
				
				
				i++;
			}
	}
}
