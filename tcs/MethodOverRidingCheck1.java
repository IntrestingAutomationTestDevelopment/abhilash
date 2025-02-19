package tcs;

public class MethodOverRidingCheck1 extends MethodOverRidingCheck2{
	
	public static void qa(String str,int i) {
		
		System.out.println("Tata Motors Launched Harrier EV");
		
	}
	
	public static void sdet() {
		System.out.println("HCL Technologies 2021-2022");
	}
	
	public static void main(String[] args) {
		sdet();
		qa("KSRA",5);
	}

}