/*
-------------------------------------------------------------------------------
Implement a program to convert in-fix notation to post-fix notation using stack
-------------------------------------------------------------------------------

*/



import java.util.*;

public class postfix{

  static String postfix= "";
  static  postfix obj =new postfix();
  int top=-1;
 char[] ch= new char[100];


    public static void main(String[] args)
    {

        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the infix expression you want to convert: ");
        String infix=sc.nextLine();
        String ans;
        ans = obj.infixtopostfix(infix);
        System.out.println(ans);
    }
       

      
    
    public void push(char c)
    {
        if(top>=100){
            System.out.println("Overflow");
        }
        else{
            top++;
            ch[top]=c;
        }
    }
    public char peek(){
        
    
    
            return ch[top];
        

    }
    public char pop(){
        if(top==-1){
            System.out.println("Underflow");
            
        }
        return ch[top--];
    }

   public String infixtopostfix( String infix){
    char symbol;
    

     for(int i=0;i<infix.length();i++)
     {
        symbol= infix.charAt(i);

        if( symbol =='(')
        {
            obj.push(symbol);
        }
        else if( symbol ==')')
        {
            while(obj.peek() !='(')
            {
                postfix= postfix+obj.pop();
            }
            obj.pop();
        }
        else if(Character.isLetter(symbol))
        {
            postfix = postfix + symbol;
        } 
        else
        {
            while(top!=-1 && (obj.peek()!='(') && precedenc(symbol) <= precedenc(obj.peek()))
            {
                postfix = postfix + obj.pop();
                 
            }
            obj.push(symbol);
        }
    }
 
    while(top!=-1)
     {
        postfix = postfix + obj.pop();
       
     }
     return postfix;
   }

   static int precedenc(char x){
    switch(x){
        case '+':
        case '-':
                         return 1;
        case '*':
        case '/':
        case '%': 
                         return 2; 
        case '^':
            return 3;
    }
    return x;
}
}

    

