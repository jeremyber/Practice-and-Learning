import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class T9Spelling {

	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("t9spellingfiles/C-large-practice.in"));
		
		int numTestCases = Integer.parseInt(br.readLine());
		
		int increment = 1;
		while(increment <= numTestCases)
		{
			String wordToTranslateToT9 = br.readLine();
			//System.out.println(wordToTranslateToT9);
			char[] charArray = wordToTranslateToT9.toCharArray();
			
			String convertedString = convertCharArrayToT9(charArray);
			System.out.println("Case #"+ increment + ": " + convertedString);
			
			
			
			increment++;
		}
	}

	private static String convertCharArrayToT9(char[] charArray) {
		StringBuffer strToReturn = new StringBuffer("");
		ArrayList<String> val, temp = new ArrayList<String>();
		int previousCharNumber = -1;	//character that will never appear
		
		for(int i = 0; i<charArray.length; i++)
		{
			switch(charArray[i])
			{
				case 'a': 
					if(previousCharNumber== 2) strToReturn.append(" ");
					strToReturn.append("2");
					previousCharNumber = 2;
					break;
				case 'b':
					if(previousCharNumber== 2) strToReturn.append(" ");
					strToReturn.append("22");
					previousCharNumber = 2;
					break;
				case 'c':
					if(previousCharNumber== 2) strToReturn.append(" ");
					strToReturn.append("222");
					previousCharNumber = 2;
					break;
				case 'd':
					if(previousCharNumber== 3) strToReturn.append(" ");
					strToReturn.append("3");
					previousCharNumber = 3;
					break;
				case 'e':
					if(previousCharNumber== 3) strToReturn.append(" ");
					strToReturn.append("33");
					previousCharNumber = 3;
					break;
				case 'f':
					if(previousCharNumber== 3) strToReturn.append(" ");
					strToReturn.append("333");
					previousCharNumber = 3;
					break;
				case 'g':
					if(previousCharNumber== 4) strToReturn.append(" ");
					strToReturn.append("4");
					previousCharNumber = 4;
					break;
				case 'h':
					if(previousCharNumber== 4) strToReturn.append(" ");
					strToReturn.append("44");
					previousCharNumber = 4;
					break;
				case 'i':
					if(previousCharNumber== 4) strToReturn.append(" ");
					strToReturn.append("444");
					previousCharNumber = 4;
					break;
				case 'j':
					if(previousCharNumber== 5) strToReturn.append(" ");
					strToReturn.append("5");
					previousCharNumber = 5;
					break;
				case 'k':
					if(previousCharNumber== 5) strToReturn.append(" ");
					strToReturn.append("55");
					previousCharNumber = 5;
					break;
				case 'l':
					if(previousCharNumber== 5) strToReturn.append(" ");
					strToReturn.append("555");
					previousCharNumber = 5;
					break;
				case 'm':
					if(previousCharNumber== 6) strToReturn.append(" ");
					strToReturn.append("6");
					previousCharNumber = 6;
					break;
				case 'n':
					if(previousCharNumber== 6) strToReturn.append(" ");
					strToReturn.append("66");
					previousCharNumber = 6;
					break;
				case 'o':
					if(previousCharNumber== 6) strToReturn.append(" ");
					strToReturn.append("666");
					previousCharNumber = 6;
					break;
				case 'p':
					if(previousCharNumber== 7) strToReturn.append(" ");
					strToReturn.append("7");
					previousCharNumber = 7;
					break;
				case 'q':
					if(previousCharNumber== 7) strToReturn.append(" ");
					strToReturn.append("77");
					previousCharNumber = 7;
					break;
				case 'r':
					if(previousCharNumber== 7) strToReturn.append(" ");
					strToReturn.append("777");
					previousCharNumber = 7;
					break;
				case 's':
					if(previousCharNumber== 7) strToReturn.append(" ");
					strToReturn.append("7777");
					previousCharNumber = 7;
					break;
				case 't':
					if(previousCharNumber== 8) strToReturn.append(" ");
					strToReturn.append("8");
					previousCharNumber = 8;
					break;
				case 'u':
					if(previousCharNumber== 8) strToReturn.append(" ");
					strToReturn.append("88");
					previousCharNumber = 8;
					break;
				case 'v':
					if(previousCharNumber== 8) strToReturn.append(" ");
					strToReturn.append("888");
					previousCharNumber = 8;
					break;
				case 'w':
					if(previousCharNumber== 9) strToReturn.append(" ");
					strToReturn.append("9");
					previousCharNumber = 9;
					break;
				case 'x':
					if(previousCharNumber== 9) strToReturn.append(" ");
					strToReturn.append("99");
					previousCharNumber = 9;
					break;
				case 'y':
					if(previousCharNumber== 9) strToReturn.append(" ");
					strToReturn.append("999");
					previousCharNumber = 9;
					break;
				case 'z':
					if(previousCharNumber== 9) strToReturn.append(" ");
					strToReturn.append("9999");
					previousCharNumber = 9;
					break;
				case ' ':
;					if(previousCharNumber == 0) strToReturn.append(" ");
					strToReturn.append("0");
					previousCharNumber = 0;
					break;
					
				
			}
		}
		return strToReturn.toString();

	}
	
}
