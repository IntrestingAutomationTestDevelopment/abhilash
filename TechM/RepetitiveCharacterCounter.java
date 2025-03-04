package TechM;

	import java.util.HashMap;
	import java.util.Map;

	public class RepetitiveCharacterCounter {

	    public static Map<Character, Integer> countRepetitiveCharacters(String inputString) {
	        // Create a HashMap to store character counts
	        Map<Character, Integer> charCount = new HashMap<>();
	        
	        // Iterate over the string and count each character's frequency
	        for (char c : inputString.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }
	        
	        // Filter out characters that occur more than once and return them
	        Map<Character, Integer> repetitiveCount = new HashMap<>();
	        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	            if (entry.getValue() > 1) {
	                repetitiveCount.put(entry.getKey(), entry.getValue());
	            }
	        }
	        
	        return repetitiveCount;
	    }

	    public static void main(String[] args) {
	    	countRepetitiveCharacters("Philippines");
	    }
}
