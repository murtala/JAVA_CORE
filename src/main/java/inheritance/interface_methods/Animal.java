package inheritance.interface_methods;

public interface Animal {
	 default public String identifyMyself() {
	        return "I am an animal.";
	    }
}
