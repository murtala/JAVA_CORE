package abstracts;

public abstract class GraphicObject {

	  int x, y;
	  final int p = 99;
	  //  ...
	    void moveTo(int newX, int newY) {
	       // ...
	    }
	  
	    abstract void draw( int p);
	    abstract void resize();
}
