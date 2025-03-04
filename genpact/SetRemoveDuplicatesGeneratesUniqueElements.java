package genpact;

	import java.util.Arrays;
	import java.util.LinkedHashSet;
	import java.util.Set;

	public class SetRemoveDuplicatesGeneratesUniqueElements {
	    public static void main(String[] args) {
	        // Input array
	        int[] array = {1, 2, 3, 2, 4, 1, 5};

	        // Use LinkedHashSet to maintain insertion order
	        Set<Integer> set = new LinkedHashSet<>();
	        for (int num : array) {
	            set.add(num);
	        }

	        // Convert back to an array
	        int[] result = set.stream().mapToInt(Integer::intValue).toArray();

	        // Print result
	        System.out.println("Array without duplicates: " + Arrays.toString(result));
	    }
	}

