package com.learn.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDataStructure {

	public static void main(String[] args) 
	{
		Queue q= new PriorityQueue <Integer>(); 
		//offer method is used to store the element in the queue data structure.
			q.offer(10);
			q.offer(20);
			q.offer(30);
			q.offer(40);
			q.offer(50);
			
			delete(q);
		
		
	}

	private static void delete(Queue q) 
	{
		
		for (int i = 0; i < q.size(); i++) 
		{
			//poll method is used to delete the first element of the queue.
				System.out.println(q.poll());
			
		}
	}

}
