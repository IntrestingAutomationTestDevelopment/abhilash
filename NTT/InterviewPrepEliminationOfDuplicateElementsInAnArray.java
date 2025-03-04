package NTT;

public class InterviewPrepEliminationOfDuplicateElementsInAnArray {

	public static void checkForDuplicateElementsInAnArray() {

		int a[] = { 1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 9 };
		int count = 0;
		int i,j=0;
		System.out.println("length of array:" + a.length);
		for (i = 0; i <= a.length; i++) {

			for (j = i + 1; j <= a.length - 1; j++) {

				if (a[i] == a[j]) {
					count++;

				}
			}
		}
		System.out.println("Length of i loop ");
		System.out.print(+i);
		System.out.println("Length of j loop");
		System.out.print(+j);
		System.out.println("Check For Duplicates" + a[i]);
		System.out.println(i + "" + count);
	}

	public static void main(String[] args) {
		//System.out.println("Hello World");
		checkForDuplicateElementsInAnArray();
	}

}
