package collections;

import java.util.*;

public class list {

	public static void listManipulations() {

		// List<type> li
		List<String> tata = new ArrayList<>();
		tata.add("Nexon");
		tata.add("Safari");
		tata.add("Punch");
		tata.add("Harrier");
//Access
		String car = tata.get(1);
//Remove
		tata.remove(2);
		tata.remove("punch");
//checkSize
		int ModelsCount= tata.size();

	}
}
