package virtusa;

/*
 * public class DuplicateCharectersInString {
 * 
 * public static void main(String[] args) { twoIterativeForLoops(); }
 * 
 * public static void twoIterativeForLoops() {
 * 
 * String str = "InputString"; int count =0; String res = "";
 * 
 * for(int i=0;i<str.length()-1;i++) {
 * 
 * 
 * for(int j=i+1;j<i;j++) {
 * 
 * if(str.charAt(i)==str.charAt(j)) {
 * 
 * 
 * count++; }
 * 
 * } }System.out.println("Iterative Result::: "+count);
 * 
 * 
 * }
 * 
 * 
 * }
 */
/**
 * RepetitiveOccurrences
 */
public class  DuplicateCharectersInString{
    public static void countRepetitiveOccurrences(String inputString) {
        // Loop through the string to compare each character
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            int count = 1; // Start with count 1 for the current character

            // Check for repetitions using the second loop
            for (int j = i + 1; j < inputString.length(); j++) {
                if (currentChar == inputString.charAt(j)) {
                    count++; // Increment count if a match is found
                }
            }

            // If the character has been counted, print its count
            if (count > 1) {
                System.out.println("Character '" + currentChar + "' repeats " + count + " times");

                // To prevent recounting the same character, mark it as processed
                inputString = inputString.replace(currentChar, '#');
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "programming";
        countRepetitiveOccurrences(inputString);
    }
}
