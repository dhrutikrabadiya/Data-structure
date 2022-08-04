
/*
------------------------------------------------------------------------------------------------
Create class Employee_Detail with attributes Employee_id, Name, Designation, and Salary. Write a 
program to read the detail from user and print it.
------------------------------------------------------------------------------------------------
*/




import java.util.*;
Class Employs{
    int id;
    String name;
    String designation;
    Float salary;
}
Class main{
    public static void main (String args[]);{
        Scanner sc = new Scanner(System.in);
        System.out.print("how many employs ?");
        int n = sc.nextInt();
        Employs emp[] = new employs [n];
        for(int i=0; i<n;i++){ 
            emp[i] = new Employs();
            System.out.println("Enter" + (i+1)+ "Employs data :");
            System.out.print("Enter Employs id:");
            emp[i].id = sc.nextInt();
            System.out.print("Enter Employs name :");
            emp[i].name = sc.next();
            System.out.print("Enter Employs designation :");
            emp[i].designation = sc.next();
            System.out.print("Enter Employs salary :");
            emp[i].salary = sc.nextFloat(); 
              
        }
        System.out.println(" All Employee Details are :\n");
 for (int i = 0; i < n; i++) {
        System.out.println("Employee id, Name, Designation and Salary :" + emp[0].id + " " + emp[i].name + " " + emp[i].desig + " " +emp[i].salary);
    }

}

