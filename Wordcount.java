
package studyopedia;

import java.util.Scanner;

public class counter
{
	public static void main(String[] args) {
		System.out.print("\nTASK - 2:\n");
		System.out.println("\n\t\t  WORD COUNTER \n");
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("\nPlease, Enter the text here: \n");
	    String str = scan.nextLine();
	   
	   int c = 0,i;
	   for(i = 0;i  < str.length();i++)
	   {
	       if(str.charAt(i) == ' ')
	       {
	           c++;
	       }
	   }
	   
	   if(str.length() != 0)
	   {
	       c++;
	   }
	   

		System.out.println("\nNUMBER OF WORDS  = "+c);
	}
}
