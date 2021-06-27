package logicalprograms;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		{  
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number for which fibonnaci series is to be found:");
			int previousNumber = 0;
			int currentNumber = 1;
			System.out.println(previousNumber+","+currentNumber);
		    int nextNumber;
		    int fibonacciNumber = scanner.nextInt();
			for (int i=0; i < fibonacciNumber-2; i++) 
			{
				nextNumber=previousNumber+currentNumber;
				previousNumber=currentNumber;
				currentNumber=nextNumber;
				System.out.println(nextNumber);
			}
		   
		}
	}

}
