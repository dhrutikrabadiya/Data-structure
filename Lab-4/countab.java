/*
--------------------------------------------------------------------------------------------
Write a program to determine if an input character string is of the form ab where i >= 1 i.e. 
Number of ‘a’ should be equal to number of ‘b
--------------------------------------------------------------------------------------------
*/




import java.util.*;
public class countab {
    int topa=0;
    int topb=0;
    char stacka[] = new char[100];
    char stackb[] = new char[100];
    void push(String str)
    {
        
        for (int i = 0; i <str.length(); i++) 
        {
           if (str.charAt(i)=='a')
           {
               stacka[topa] = str.charAt(i);
               topa++;
           }
           else if (str.charAt(i)=='b')
           {
               stackb[topb] = str.charAt(i);
               topb++;
           }
            
           }
           if (topa==topb) {
            System.out.println("Valid String");
           }
           else
           {
            System.out.println("Invalid String");
           }
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stirng");
        String str = sc.nextLine();
        countab input = new countab();
        input.push(str);
    }
}
