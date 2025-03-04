package Mphasis;

	import java.util.HashSet;
	import java.util.Set;

	public class MissingNumbers {

	    public static void findMissingNumbers(int[] arr, int start, int end) {
	        // Create a set to store the elements of the array
	        Set<Integer> set = new HashSet<>();
	        
	        // Add elements of the array to the set
	        for (int num : arr) {
	            set.add(num);
	        }
	        
	        // Find and print the missing numbers
	        System.out.print("Missing numbers: ");
	        for (int i = start; i <= end; i++) {
	            if (!set.contains(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        // Example array and range
	        int[] arr = {1, 2, 4, 6, 7, 8};
	        int start = 1;
	        int end = 8;
	        
	        // Call the method to find missing numbers
	        findMissingNumbers(arr, start, end);
	    }
	}

