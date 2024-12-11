package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3 {
		File myFile = new File("data3.txt");{
		
		try {
			Scanner scan = new Scanner(myFile);
			int count = 0;
			
			while(scan.hasNext()) {
				System.out.println(scan.hasNext());
				System.out.println("--------------");
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

		}
}