package inheritance.interface_methods;

public class Dragon implements EggLayer, FireBreather {
	 public static void main (String... args) {
	        Dragon myApp = new Dragon();
	        System.out.println(myApp.identifyMyself());
	    }

	 
	 //because same names, one method of the super classes must be overrriden
	@Override
	public String identifyMyself() {
		
		return EggLayer.super.identifyMyself();//to use the egglayer methods only
	}

	
}
