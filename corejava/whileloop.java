package corejava;

import java.util.Scanner;

public class whileloop implements mathemetics_level1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileloop obj=new whileloop();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scan.nextInt();
				
		int fact;
		fact=obj.findFactorial(num);
		System.out.println("fact  "+fact);
		

	}

	@Override
	public int findFactorial(int number) {
		// TODO Auto-generated method stub
		int i=1,fact=1;
		while(i<=number) {
 fact = fact*i;
			i++;
		}
				
		return fact;
	}

}
