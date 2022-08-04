/*
--------------------------------------------------------------------------------------------------
Create array of object of class Student_Detail with attributes Enrollment_no, Name, Sem, CPI for 5 
students, scan their information and print it
--------------------------------------------------------------------------------------------------
*/



import java.util.Scanner;
class student{
	long EnrollmentNo;
	String Name;
	int  Sem;
	Double Cpi;

	Scanner sc= new Scanner(System.in);
 
 	public void input(){
 		System.out.println("Enter EnrollmentNo");
 		EnrollmentNo=sc.nextLong();
 		System.out.println("Enter Name");
 		Name =sc.next();
 		System.out.println("Enter Sem");
 		Sem =sc.nextInt();
 		System.out.println("Enter Cpi");
 		Cpi =sc.nextDouble();
 	}

 	public void display(){
 		System.out.println("EnrollmentNo	= "+EnrollmentNo);
 		System.out.println("Name	="+Name);
 		System.out.println("Sem 	="+Sem);
 		System.out.println("Cpi 	="+Cpi);
 	}	

}


public class StudentDetail{
	public static void main(String[] args) {
		student[] s=new student[5];
		for(int i=0;i<5;i++){
			System.out.println("*  *  *  *  *  *  *  *  *  ");
			System.out.println("enter "+(i+1)+" student detail-----");
			s[i]=new student();
			s[i].input();
		}
		for(int i=0;i<5;i++){
			System.out.println("*  *  *  *  *  *  *  *  *  ");
			System.out.println("detail of student no."+(i+1)+"------------");
			s[i].display();
		}
	}
}