package classes_and_objects.classes.accessmodifiers.p2;

import classes_and_objects.classes.accessmodifiers.p1.A;

public class D extends A {
	
	public static void main(String[] args) {
		D d = new D();
		//d.no= 10;
		//d.name = "Srinu";
		//d.sal =  2000;
		System.out.println(d.no); // public datamember
		//System.out.println(d.age);// private datamember, cannot be accessed
		//System.out.println(d.name);// default datamenber cannot be acesses
		System.out.println(d.sal); // protected datamember can be acessed outside the package if there is child parent relationship

	}

}
