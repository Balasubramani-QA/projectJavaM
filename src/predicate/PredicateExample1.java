package predicate;

import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
        System.out.println(pr.test(19));    // Calling Predicate method    
    }  
  
	}


