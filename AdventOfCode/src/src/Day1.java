package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("data.txt");
		
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		
		try {
			Scanner scan = new Scanner(myFile);
			while(scan.hasNext()) {
				//call nextInt 2x each iteration
				//add to the respective lists
				
				leftList.add(scan.nextInt());
				rightList.add(scan.nextInt());
				
				
				
				
				
				
				
			}
			int sum = 0;
			while(leftList.size() > 0) {
				int smallestLeft = leftList.get(0);
				int smallestIndex = 0;
				for(int i = 0; i < leftList.size(); i++) {
					if(leftList.get(i) < smallestLeft) {
						smallestLeft = leftList.get(i);
						smallestIndex = i;
					}
				}
				
				
				leftList.remove(smallestIndex);
				
				int smallestRight = rightList.get(0);
				smallestIndex = 0;
				for(int i = 0; i < rightList.size(); i++) {
					if(rightList.get(i) < smallestRight) {
						smallestRight = rightList.get(i);
						smallestIndex = i; 
					}
				}
				
				rightList.remove(smallestIndex);
				
				System.out.println(smallestLeft + " : " + smallestRight + " " + Math.abs(smallestRight - smallestLeft));
				
				sum += Math.abs(smallestLeft - smallestRight);
			}
			
			System.out.println("sum is " + sum);
			//look for the smallest element in the left
			//look for the smallest element in the right 
			//find their difference
			//remove the smallest elements each time
			
			
			//repeat
			
			
			
			
			
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
