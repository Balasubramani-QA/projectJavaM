package javaprograms;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegexPatternCharOccure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{  
			String str = "Happy New Year 2023 & Happy Pongal";  
			Pattern.compile(".").matcher(str).results().map(m -> m.group().toLowerCase()).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting())).forEach((k, v) -> System.out.println(k + " = " + v + " times"));   
			}  
		
	}

}
