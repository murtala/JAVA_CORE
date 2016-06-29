package exercises.test;

public class test {

	
	// Classes
	class Foo {
	    private int i;
	    public void f() { /* ... */ }
	    public void g() { /* ... */ }
	}

	class Bar extends Foo {
	    public int j;
	    public void h() { /* ... */ }
	    public void g() {};
	}

	// Declarations:
	// ...
	    Foo a = new Foo();
	    Bar b = new Bar();
	// ...

	    
	    public void main(String[] args) {
			
	    	a.i =1;
	    	a.f();
	    	a.g();
	    	//a.j=2; // nope
	    	
	    	
	    	b.j =1;
	    	b.h();
	    	b.f();
	    	b.g();
	    	
	    	
	    	
		}
}
