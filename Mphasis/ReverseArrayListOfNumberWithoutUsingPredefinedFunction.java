package Mphasis;

	import java.util.ArrayList;
	import java.util.Collections;

	public class ReverseArrayListOfNumberWithoutUsingPredefinedFunction {
	    public static void main(String[] args) {
	        // Create and initialize an ArrayList with numbers
	        ArrayList<Integer> numbers = new ArrayList<>();
	        //numbeclassrs.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        
	        // Print the original ArrayList
	        System.out.println("Original ArrayList: " + numbers);
	        
	        // Reverse the ArrayList
	        Collections.reverse(numbers);
	        
	        // Print the reversed ArrayList
	        System.out.println("Reversed ArrayList: " + numbers);
	    }
	}


