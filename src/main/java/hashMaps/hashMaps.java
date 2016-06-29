package hashMaps;
import java.util.*;

class hasmapaps {
	public static void main(String args[]) {
		// Create a hash map
		Map<String, Double> map = new HashMap<String, Double>();
		// Put elements to the map
		map.put("John Doe", new Double(3434.34));
		map.put("Tom Smith", new Double(123.22));
		map.put("Jane Baker", new Double(1378.00));
		map.put("Todd Hall", new Double(99.22));
		map.put("Ralph Smith", new Double(-19.08));
		// Get a set of the entries
		Set set = map.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		// Deposit 1000 into John Doe's account
		double balance = ((Double) map.get("John Doe")).doubleValue();
		map.put("John Doe", new Double(balance + 1000));
		System.out.println("John Doe's new balance: " + map.get("John Doe"));
	}
}