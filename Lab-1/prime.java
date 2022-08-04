/*
---------------------------------------------------------
Write a program to check whether a number is prime or not
---------------------------------------------------------
*/
import java.util.*;
public class prime{
	public static void main(String[] args) {
		Scanner dk =new Scanner(System.in);
		System.out.println("enter a number");
		   int number =dk.nextInt();
              int temp=0;
		for(int d=2;d<number;d++){
			if(number%d==0)
			{
             System.out.println("number  not prime");
             temp++;
			}
			break;			
		}
		if(temp==0)
		{
			System.out.println("number is prime");
		}
		
	}
}
