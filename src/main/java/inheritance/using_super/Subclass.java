package inheritance.using_super;

public class Subclass extends Superclass {
	 // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();  //will print from super class
        System.out.println("Printed in Subclass"); //will print from sub class
    }
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();    
    }
}
