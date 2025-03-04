package practiceprograms;

public class VowelsCount {
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        int vowelCount = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                vowelCount++;
	            }
	        }
	        
	        System.out.println("Number of vowels: " + vowelCount);
	    }
	}

