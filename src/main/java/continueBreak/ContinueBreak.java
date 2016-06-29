package continueBreak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContinueBreak {

	public static void main(String[] args) {

		List <String[]> list = new ArrayList<String[]>();
		list.add(args);
		
		int val = 0;
		while (val < 10) {
			val = val + 1;
			if (val == 4) {
				// continue skips to next iteration
				continue;
			}

			if (val > 6) {
				// break exits the loop
				break;
			}
			System.out.println(val);
			
			 val = 0;
			while (val<10){
				val = val +1;
				if (val ==4){
					continue;
				}
				
				if (val >4){
					break;
				}
				System.out.println(val);
			}
		}
	}

}
