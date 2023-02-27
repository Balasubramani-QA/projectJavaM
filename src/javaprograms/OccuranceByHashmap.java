package javaprograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceByHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{  
			String str= "Happy New Year 2023 & Happy Pongal";  
			Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));  
			System.out.println(result);  
			}  
		
	}

}
