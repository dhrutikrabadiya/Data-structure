/*
-----------------------------------------
Read n numbers in an array then read two different numbers, replace 1st number with 2nd number 
in an array and print its index and final array.
-----------------------------------------
*/



import java.util.Scanner;

public class ReplaceInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];


		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i=0; i<n; i++){
			if(arr[i]==a){
				arr[i]=b;
				System.out.print(i+" ");
				System.out.println(" ");
			}
		}

		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}