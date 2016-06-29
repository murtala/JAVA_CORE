package inheritance;

//import constructors.Emp;

public class FullTimeEmp extends Emp {
	float aSal;
	float bonus;
	
	
	
	
	
	public FullTimeEmp(int no, String name, String desig, float aSal,float bonus) {
		super(no, name, desig); // constructor will not participate in the inheritance whenevr you create an oject of child class object, first super class constructor will be executed then follwed by child class will be executed 
		this.aSal = aSal;
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "FullTimeEmp [aSal=" + aSal + ", bonus=" + bonus + ", no=" + no
				+ ", name=" + name + ", desig=" + desig + "]";
	}
	public float getaSal() {
		return aSal;
	}
	public void setaSal(float aSal) {
		this.aSal = aSal;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	
	

}
