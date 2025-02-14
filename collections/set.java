package collections;

import java.util.HashSet;
import java.util.Set;

public class set {

	public static void ModelsOfBikesInIndiaWithMakes() {
	//Set<Type> s = new HashSet<>();
	Set<String> bike = new HashSet<>();
	//add
	bike.add("HondaCBR");
	bike.add("HondaSP125");
	bike.add("TriumphTigor");
	bike.add("Suzuki Hayabusa");
	//remove
	bike.remove("TriumphTigor");
	int s= bike.size();
	
	//iteration
	for(String bikeModel: bike) {
		System.out.println(bikeModel);
	}
}
	
}
