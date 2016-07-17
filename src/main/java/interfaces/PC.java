package interfaces;

import org.apache.log4j.Logger;

public class PC {
	
	public static void main(String[] args) {
		Computer c = new Computer() {
			
			@Override
			public String type(String computerType) {
				Logger.getLogger(this.getClass()).info("ok");
				System.out.println("fddf");
				return computerType;
			}
			
			@Override
			public String cpuType(String cpuType) {
				// TODO Auto-generated method stub
				return cpuType;
			}
		};
		
	
	}

}
