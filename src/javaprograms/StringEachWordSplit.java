package javaprograms;

public class StringEachWordSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "hello I am fine, how are  you?";
	    String[] separated = text.split(" ");//separates by spaces

	    for (String word : separated) {
	        if (!word.trim().isEmpty()) {
	            System.out.println(word);
	        }
	    }
	}

}
