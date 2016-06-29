package accessmodifiers.p2;

import accessmodifiers.p1.A;

public class C {
	
	public static void main(String[] args) {
		A a = new A();
		a.no= 10;
		//a.name = "Srinu";
		//a.sal =  2000;
		System.out.println(a.no); // public datamember
		//System.out.println(a.age);// private datamember, cannot be accessed
		//System.out.println(a.name);// default datamenber cant be acceesed 
		//System.out.println(a.sal); // protected datamember cant be acessed 
	}
	
}
