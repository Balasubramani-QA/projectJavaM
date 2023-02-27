package javaprograms;

import java.util.Scanner;

public class StringReverseSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "how r u", nstr="";
        char ch;
       
     /* System.out.print("Original word: ");
      System.out.println(str); //Example word */
       
      for (int i=0; i<str.length(); ++i)
      {
    	  
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      
      System.out.println(nstr);
      
      Scanner Sc = new Scanner(System.in);
      String ns = nstr;
      String[] separated = ns.split("");//separates by spaces
		
	    for (String word : separated) {
          System.out.println(word);
      
          
          
	}

	}
}
