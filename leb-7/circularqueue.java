/*
-------------------------------------------------------------------------------------------------
 Implement Circular Queue using array that performs following operations: INSERT, DELETE, DISPLAY
-------------------------------------------------------------------------------------------------
*/


import java.util.*;
public class circularqueue{

	 static circularqueue obj = new circularqueue();
     int[] q =new int[5];
	    int  front=-1;
	     int rear=-1;
	static int choice;

	void enqueue(int num)
	{
		if((rear>=4&&front==0)||(rear==front-1)) 
		{
			System.out.println("queue is  overflow");
		}
		else
		{
			rear=(rear+1)%5;
			q[rear]=num;

			if(front == -1)
			{
				front=0;
			}
		}
	}

	 void display()
	 {
	 	if(front==-1)
	 	{

	 		System.out.println(" queue is empty");
	 	}
	 	else if(rear<front)
	 	{
	 		for(int i=front;i<=4;i++)
	 		{
	 			System.out.println(q[i]);
	 		}
	 		for(int i=0;i<=rear;i++)
	 		{
	 			System.out.println(q[i]);
	 		}
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
	 	if(front==-1)
	 	{
	 		System.out.println(" queue is empty");
	 	}
	 	else if(front==rear)
	 	{
	 		System.out.println(q[front]);
	 		front=rear=-1;
	 	}
	 	else
	 	{
             System.out.println(q[front]);
             front=(front+1)%5;
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
	 	    choice=dk.nextInt();
	 		
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
	 	while(choice!=4);
	 }

}