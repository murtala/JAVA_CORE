package accessmodifiers.p1;

public class B {
	public static void main(String[] args) {
		A a = new A();
		a.no= 10;
		a.name = "Srinu";
		a.sal =  2000;
		System.out.println(a.no); // public datamember
		//System.out.println(a.age);// private datamember, cannot be accessed
		System.out.println(a.name);// default datamenber can be acceesed within the same package
		System.out.println(a.sal); // protected datamember can be acessed within the same package
	}

}
