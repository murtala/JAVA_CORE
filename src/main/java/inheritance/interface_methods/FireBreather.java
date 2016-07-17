package inheritance.interface_methods;

public interface FireBreather extends Animal {
	default public String identifyMyself() {
        return "I breathe fire";
    }
}
