package exercises.example4_4;
// difference this , and how to use it
class Light {
    // Fields
    int     noOfWatts;      // wattage
    boolean indicator;      // on or off
    String  location;       // placement

    // Constructor
    public Light(int noOfWatts, boolean indicator, String site) {
        String location;

       noOfWatts = 5;   // (1) Assignment to field.
        indicator = true;        // (2) Assignment to parameter.
        location = "x";              // (3) Assignment to local variable.
        this.superfluous();           // (4)
        superfluous();                // equivalent to call at (4)
    }

     
    public void Light1(int noOfWatts, boolean indicator, String location) {
		//super();
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		this.superfluous();           // (4)
        superfluous();     
	}


	public void superfluous() { System.out.println(this); }  // (5)

    public static void main(String[] args) {
        Light light = new Light(100, true, "loft");
        System.out.println("default values printed, maybe locL ");
        System.out.println("No. of watts: " + light.noOfWatts);
        System.out.println("Indicator: "    + light.indicator);
        System.out.println("Location: "     + light.location);
        
        Light light1 = new Light(100, true, "loft");
        System.out.println("PARAMETRIZED  values printed,  from fileds and parameters calls ");
        System.out.println("default values printed, maybe locL ");
        System.out.println("No. of watts: " + light.noOfWatts);
        System.out.println("Indicator: "    + light.indicator);
        System.out.println("Location: "     + light.location);

    }
}
