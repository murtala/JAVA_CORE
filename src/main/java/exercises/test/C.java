package test;

public class C extends B {

public void doIt(){
		
	}

public  void main(String[] args) {
	
	doIt();//access here
	super.doIt();// access B
//	A.this.doIt();
	((A) this).doIt(); //acess A
	
	
}



}
