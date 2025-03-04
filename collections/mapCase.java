package collections;

import java.util.HashMap;
import java.util.Map;

public class mapCase {
/**
 * Syntax
 */
	public static void mapCollection() {
	//Map<KeyType,ValueType> map = new HashMap<>();
	Map<String,Integer> map = new HashMap<>();	
	map.put("Subaru", 1);
	map.put("AirCanada",2);
	map.put("JaguarLandRover",3);
	map.put("ge",4);
	map.put("Sunfra",6);
	map.put("Reyan", 5);
	int value = map.get("Subaru");
	map.remove("Sunfra");
	}
	
}
