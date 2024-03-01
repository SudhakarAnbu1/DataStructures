package com.learn.Priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		//Generic is used for type safety which means it can be allows to store similar type of data only. 
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(50);
		pq.add(20);
		pq.add(40);
	//	pq.add("Mango");    we can't store the hetrogenious data, because of type safety.
		pq.add(10);
		pq.add(30);
		System.out.println(pq);
		//Traversing the element by using iterator because it does not have any indexes.
		Iterator iter=pq.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
