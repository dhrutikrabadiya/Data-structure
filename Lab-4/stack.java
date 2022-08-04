/*
----------------------------------------------------------------------------------------------
Implement a program for stack that performs following operations using array: PUSH, POP, PEEP, 
CHANGE & DISPLAY
---------------------------------------------------------------------------------------------


*/



  import java.util.Scanner;
class newstack{
    int a[] = new int[5];
    int top = 0;
    int x;
    
    public void push(int x)
    {
        if(top>=5){
			 System.out.println("stack is overflow");
		}
		else{
			top++;
			a[top]= x;
		}
    }
    public int pop()
    {
        if(top<=0){
            System.out.println("stack is underflow");
			
		}
        else
        {
            System.out.println(a[top]);
            top--;
        }
        return 0;	
			
    }
    public int peep(int j)
    {
        if(a[top-j+1]<=0){
            System.out.println("stack is underflow");
        }
        else{
            System.out.println(a[top-j+1]);
        }
        return 0;
    }
    public void change(int p,int c)
    {
        if (top<=0) {
            System.out.println("stack is underflow");
        }
         else
         {
            
            a[top-p+1]=c;
       }
    }
    public void display()
    {
        if (top<=0) {
                System.out.println("stack is underflow");
            }

        else{
        for (int i=top;i>=1;i--)
        {
            
			    System.out.println(a[i]);
            }
		}
    }
}

public class stack {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        newstack s1=new newstack();
        
        while(true)
        {
            System.out.println("1 for push\n 2 for pop\n 3 for peep\n 4 for change\n 5 for disply\n 6 for exit");
            int choise=sc.nextInt();

            switch (choise) {
                case 1:
                
                    System.out.println("Enter No to push in stack");
                    int x =sc.nextInt();
                    s1.push(x);
                    break;
                    
                
                case 2:
                
                    s1.pop();
                    break;
                
                case 3:
               
                    System.out.println("Enter Ith element from top");
                    int j=sc.nextInt();
                    s1.peep(j);
                    break;
              
                case 4:
                
                    System.out.println("enter position of the top ");
                    int p = sc.nextInt();
                    System.out.println("Enter New No to change");
                    int c =sc.nextInt();
                    s1.change(p,c);
                    break;
                
                case 5:
                s1.display();
                break;
                
                default :
                    {
                        break;
                    }
                }
            
        }
      
    }
}

