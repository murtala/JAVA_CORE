package interfaces;

import java.util.*;

import java.util.Map.Entry;

public class hjgh {

	public static void main(String args[])

	{

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "abcd");

		hm.put(2, "kljm");

		hm.put(3, "fdsj");

		Set<Entry<Integer, String>> es = hm.entrySet();

		Iterator<Entry<Integer, String>> i = es.iterator();

		while (i.hasNext())

		{

			Object o = i.next();

			Entry e = (Entry) i.next();

			System.out.println("Key is " + e.getKey() + " and value is "
					+ e.getValue());

		}

	}

}