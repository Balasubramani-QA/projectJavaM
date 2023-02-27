package javaprograms;

import java.util.HashMap;

public class HaspMapCharOccure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{  
			String str = "Happy New Year 2023 & Happy Pongal";  
			//HashMap char as a key and occurrence as a value  
			HashMap <Character, Integer> charCount = new HashMap<>();  
			for (int i = str.length() - 1; i >= 0; i--)   
			{  
			if(charCount.containsKey(str.charAt(i)))   
			{  
			int count = charCount.get(str.charAt(i));  
			charCount.put(str.charAt(i), ++count);  
			}   
			else   
			{  
			charCount.put(str.charAt(i),1);  
			}  
			}  
			System.out.println(charCount);  
		
	}

}
}