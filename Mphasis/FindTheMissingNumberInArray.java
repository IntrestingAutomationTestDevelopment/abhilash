package Mphasis;
import java.util.*;
public class FindTheMissingNumberInArray {
	int a[] = {1,3,5,7,9};
	//result 2,6
	//public class MissingNumbers {
	    
	    public static void findMissingNumbers(int[] arr, int n) {
	        // Create a boolean array to mark the presence of numbers
	        boolean[] present = new boolean[n + 1];   
	        // Mark the numbers present in the array
	        for (int num : arr) {
	            present[num] = true;
	        } 
	        // Find and print the missing numbers
	        System.out.println("Missing numbers are:");
	        for (int i = 1; i <= n; i++) {
	            if (!present[i]) {
	                System.out.println(i);
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 6, 7, 8}; // Example array with missing numbers
	        int n = 8; // The largest number in the range
	        
	        findMissingNumbers(arr, n);  // Call the method to find missing numbers
	    }
	}

//}
