package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ObjectFactory {
	
	List list = null;
	
	public static List getInstance(String type) {
		if(type.equals("al")) {
			return new ArrayList();
		} else if(type.equals("vect")) {
			return new Vector();
		}  else {
			return null;
		}
	}

}
