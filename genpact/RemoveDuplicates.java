package genpact;

	import java.util.Arrays;

	public class RemoveDuplicates {
	    public static void main(String[] args) {
	        // Input array
	        int[] array = {1, 2, 3, 2, 4, 1, 5};
	        int n = array.length;

	        // Temporary array for unique elements
	        int[] temp = new int[n];
	        int index = 0;

	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;
	            for (int j = 0; j < index; j++) {
	                if (array[i] == temp[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                temp[index++] = array[i];
	            }
	        }

	        // Create the resulting array
	        int[] result = Arrays.copyOf(temp, index);

	        // Print result
	        System.out.println("Array without duplicates: " + Arrays.toString(result));
	    }
	}

