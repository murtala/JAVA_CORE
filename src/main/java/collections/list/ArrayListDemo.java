package collections.list;

import java.util.Vector;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		
		/*List list = new ArrayList();		
		int no = 10;		
		Integer i1 = new Integer(no); // Wrapper object		
		list.add(i1);		
		boolean flag = true;
		Boolean flagObj = new Boolean(flag);
		list.add(flagObj);
		float fl = 100.5f;		
		Float floatObj = new Float(fl);
		list.add(floatObj);
		
		Object obj1 = list.get(0);		
		Integer i11 = (Integer)obj1;		
		int no1 = i11.intValue();		
		System.out.println(no1);
		Object obj2 = list.get(1);		
		Boolean flagObj1 = (Boolean)obj2;		
		boolean flag1 = flagObj1.booleanValue();		
		System.out.println(flag1);		
		Object obj3 = list.get(2);
		Float floatObj1 = (Float)obj3;		
		float fl1 = floatObj1.floatValue();		
		System.out.println(fl1);*/
		
		
		/*
		List list = new ArrayList();		
		list.add(10);		
		list.add(true);
		list.add( 100.5f);
		
		Object obj1 = list.get(0);
		int no = (Integer)obj1;
		System.out.println(no);
		
		Object obj2 = list.get(1);
		boolean flag = (Boolean)obj2;
		System.out.println(flag);
		
		Object obj3 = list.get(2);
		float f1 = (Float)obj3;
		System.out.println(f1);*/
		
		
		// Generics 1.5
		
		/*
		List<Integer> nos = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i ++) {
			nos.add(i*10);
		}
		
		for (int i = 0; i < nos.size();  i++) {
			int no1 = nos.get(i);
			System.out.println(no1);
		}*/
		
		
	/*	
		
		Emp emp1 = new Emp(10, "Srinu", "Developer", 2000f);
		Emp emp2 = new Emp(20, "ramu", "Developer", 3000f);
		Emp emp3 = new Emp(30, "Anu", "Developer", 4000f);
		Emp emp4 = new Emp(10, "Devender", "Developer", 2000f);
		
		
		List<Emp> empList = new ArrayList<Emp>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp1);
		
		empList.remove(2);
		
		
		
		for (int i  = 0; i < empList.size(); i++) {
			Emp emp  = empList.get(i);
			System.out.println(emp.toString());
		}
		*/
		
		
		
		Vector<Integer> nos = new Vector<Integer>();
		

		for (int i = 0; i < 10; i++) {
			nos.add(i * 10);
		}
		
		
		for (int i = 0; i < nos.size(); i++) {
			System.out.println(nos.get(i));
		}

		
		
		
		
		
		
		
		
		
		
		
		/*
		Integer no1 = new Integer(10);
		Float f1 = new Float(100.5);
		Character ch = new Character('a');
		
		List studList = new ArrayList();
		studList.add(no1);
		studList.add(f1);
		studList.add(ch);
		
		
		for ( int i = 0; i < studList.size(); i ++) {
			Object obj = studList.get(i);
			
			if( i == 0) {
				Integer i1 = (Integer)obj;
				int x = i1.intValue();
				System.out.println(x);
			} else if( i == 1) {
				Float f11 = (Float) obj;
				float flValue = f11.floatValue();
				System.out.println(flValue);
			} else {
				Character ch1 = (Character) obj;
				char ch2 = ch1.charValue();
				System.out.println(ch2);
			}
			
		}
		*/
		
		
		
		
		
		
		
		
		
		
	/*	Integer i1 = new Integer(10); // Wrapper object
		Float f1 = new Float (20.4);
		Character ch = new Character('c');
		
		List list = new ArrayList();
		list.add(i1);
		list.add(f1);
		list.add(ch);
		
		
		
		Integer i2 = (Integer)list.get(0);
		int no = i2.intValue();
		System.out.println(no);
		Float f2 = (Float)list.get(1);
		float f2value = f2.floatValue();
		System.out.println(f2value);
		Character ch1 = (Character)list.get(2);
		char ch2 = ch1.charValue();
		System.out.println(ch2);
		
		
		
		
		// Collections can hold hetrogenious data elements
		List list = new ArrayList();
		
		Integer it = new Integer(10);  Wrapper Object
		
		Object obj = (Object)it;
		
		
		list.add(obj); // 0 th position // Wrapper concept, Boxing and auto unboxing
		
		
		
		Object obj1 = list.get(0);
		
		Integer it1 = (Integer)obj1;
		
		int no2 = it1.intValue();
		
		
		
		list.add(10); // Wrapper object with auto boxing
		list.add("Srinivas"); // 1 st postion
		list.add(30.4f); // 2 nd positon
		list.add('c'); // 3 rd position
		
		//A super class reference can hold the child class object
		Object obj = list.get(0); 
		Integer no = (Integer)list.get(0);
		System.out.println("no = " + no);
		
		Integer no1 = (Integer)list.get(0); // Wrapper Object with auto unboxing
		System.out.println("no1 = " + no1);
		String name = (String)list.get(1);
		System.out.println(name);
		
		Float fl = (Float) list.get(2);
		
		Character ch = (Character) list.get(3);*/
		
		
		
		
		
	}

}
