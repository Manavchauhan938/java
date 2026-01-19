package corejava;

import java.util.Scanner;

public class MathImpl implements mathematics,mathemetics_level1 {
	@Override
	public int addition(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1+number2;
	}
	@Override
	public int substraction(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1-number2;
	}
	@Override
	public int findFactorial(int number) {
		// TODO Auto-generated method stub
		number=5;
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathImpl obj=new MathImpl();
		obj.addition(10, 20);
		obj.substraction(23, 556);
		long fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			
			fact=fact*i;
		}
		System.out.println("Factorial "+fact);
		
	}

}