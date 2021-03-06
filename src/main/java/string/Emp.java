package string;

public class Emp {
	
	int no;
	String name;
	String desig;
	
	
	
	
	
	public Emp(int no, String name, String desig) {
		super();
		this.no = no;
		this.name = name;
		this.desig = desig;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Emp [no=" + no + ", name=" + name + ", desig=" + desig + "]";
	}



	
	
	











	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		return true;
	}






	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	

}
