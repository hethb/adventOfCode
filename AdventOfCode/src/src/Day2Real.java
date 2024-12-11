package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2Real {
	
		File myFile = new File("data2.txt");{
			
			ArrayList<Integer> myList = new ArrayList<Integer>();
			
			
//	public static boolean decreasing(String[] list) {
//			int count = 0;
//			for(int i = 1; i < list.length; i++) {
//				
//			}
//			
//		}
		
		try {
			Scanner scan = new Scanner(myFile);
			
			while(scan.hasNext()) {
				myList.add(scan.nextInt());
				
				
				
				
			}
			
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}

	


}
