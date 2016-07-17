package classes_and_objects;

public class ThisKeyword {

	 public int x = 0;
	    public int y = 0;
	    private int width, height;
	    
	    //constructor	    //Within an instance method or a constructor, this is a reference to the current object

	    public ThisKeyword(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    
	    public void ThisKeyword() {
	     // this(0,0,1,1);
	    }
	   public void ThisKeyword(int width, int height) {
	     //   this(0, 0, width, height);
	    }
	    
	  
	
	        
	 //  From within a constructor, you can also use the this keyword to call another constructor in the same class
	 
	    public void ThisKeyword(int x, int y, int width, int height) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	    }
	    
	  
	    
}
