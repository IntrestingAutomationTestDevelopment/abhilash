package synechron;

import java.util.ArrayList;
import java.util.List;

public class PojosList {
	public static void main(String[] args) {
		// Creating a list of persons
		List<Employees> softwareTestAutomationEngineer = new ArrayList<>();

		// Adding Person objects to the list
		softwareTestAutomationEngineer.add(new Employees("John Doe", 30, "123 Main St"));
		softwareTestAutomationEngineer.add(new Employees("Jane Smith", 25, "456 Elm St"));

		// Printing out each person's information
		for (Employees tech : softwareTestAutomationEngineer) {
			System.out.println(tech);
		}
	}
}
