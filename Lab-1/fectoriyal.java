

/*
-----------------------------------------------------------
Write a program to find factorial of a number. (Using Loop)
-----------------------------------------------------------
*/




import java.util.*;
public class fectoriyal{
	public static void main(String[] args) {
		Scanner dk=new Scanner(System.in);
		System.out.println("enter your number for fectoriyal");
		System.out.println("---------------------------------");
		int number=dk.nextInt();
		int temp=1;
		int count=0;
		for(int d=1;d<=number;d++)
		{
			System.out.print("*"+d);
			temp=d*temp;			
		}
		System.out.println("");
		System.out.println(temp);
	}
}