package practiceprograms;

public class Factorial {
	    public static void main(String[] args) {
	        int num = 5;
	        int factorial = 1;

	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }

	        System.out.println("Factorial of " + num + " is: " + factorial);
	    }
	    
	    public static int factorial(int n) {
	    	if(n==0) {
	    		return 1;
	    	}else {
	    		return n*factorial(n-1);
	    	}
	    }
	}


