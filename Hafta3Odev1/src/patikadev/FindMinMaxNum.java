package patikadev;

import java.util.Scanner;

public class FindMinMaxNum {

	public static void main(String[] args) {
			
			int maxNum = 0, minNum = 0;
			
			Scanner input = new Scanner(System.in);

	        System.out.print("How many numbers do you want to enter : ");
	        int n = input.nextInt();

	       
	        for (int i = 0; i < n; i++) {
	            System.out.printf("Enter the %s. number : ",i + 1);
	            int number = input.nextInt();

	            if (i == 0) {
	                maxNum = number;
	                minNum = number;
	            }

	            if (number > maxNum) {
	                maxNum = number;
	            }

	            if (number < minNum) {
	                minNum = number;
	            }
	        }
	        System.out.println("Lowest Value : " +minNum );
	        System.out.println("Highest Value : "+maxNum );

	        input.close();
	    }
				
	}

