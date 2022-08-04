/*
----------------------------------------------------------------------------------------------
Implement Simple Queue using array that performs following operations: INSERT, DELETE, DISPLAY
----------------------------------------------------------------------------------------------
*/	




import java.util.*;
public class queue{

	 static queue obj = new queue();
     int[] q =new int[5];
	    int  front=0;
	     int rear=0;
	

	void enqueue(int num)
	{
		if(rear>=5) 
		{
			System.out.println("queue is  underflow");
		}
		else
		{
			rear++;
			q[rear]=num;

			if(front == 0)
			{
				front=1;
			}
		}
	}

	 void display()
	 {
	 	if(front==0)
	 	{

	 		System.out.println(" queue is empty");
	 	}
	 	else
	 	{
	 		for(int i=front;i<=rear;i++)
	 		{
	 			System.out.println(q[i]);
	 		}
	 	}

	 }

	 void dequeue()
	 {
	 	if(front==0)
	 	{
	 		System.out.println(" queue is empty");
	 	}
	 	else if(front==rear)
	 	{
	 		System.out.println(q[front]);
	 		front=rear=0;
	 	}
	 	else
	 	{
             System.out.println(q[front]);
             front++;
	 	}
	 }

	 public static void main(String[] args) {
	 	
	 	Scanner dk =new Scanner(System.in);

      
	 	System.out.println("you have three choice BOSS");
	 		System.out.println("1  = insert in queue");
	 		System.out.println("2 =  delete in queue");
	 		System.out.println("3 = display queue");

	 	
	 	

	 	do
	 	{
	 		System.out.println("-------------");
	 	    System.out.println("please enter your choice");
	 	    System.out.println("-------------");
	 	    int choice=dk.nextInt();
	 		
	 		switch(choice)
	 		{
	 		case 1:
	 			System.out.println("enter a number to insert");
	 			int num=dk.nextInt();
	 			obj.enqueue(num);
	 			break;

	 		case 2:
	 			obj.dequeue();
	 			break;
	 		case 3:
	 			System.out.println("---------------");
	 			obj.display();
	 			break;
	 		default:
	 			System.out.println(" no data found");
	 			break;
	 		}
	 	}
	 	while(true);
	 }

}