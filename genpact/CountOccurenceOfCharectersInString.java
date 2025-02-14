package genpact;

public class CountOccurenceOfCharectersInString {

	// Java program to count character occurrences 
	// using the Naive Approach
	  
	    public static void main(String[] args) {
	      
	        String userName = "Sai Raghava Abhilash Kakarla";
	        char[] ch = userName.toCharArray();
	        boolean[] b = new boolean[userName.length()];

	        System.out.println("Character Occurrences:");
	        for (int i = 0; i < ch.length; i++) {
	            if (b[i]) continue;     // Skip already counted characters
	            int c = 1;
	            for (int j = i + 1; j < ch.length; j++) {
	                if (ch[i] == ch[j]) {
	                    c++;
	                    b[j] = true;     // Mark character as counted
	                }
	            }
	            System.out.println(ch[i] + " : " + c);
	        }
	    }
	}

