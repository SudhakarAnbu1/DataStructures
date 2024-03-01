package com.learn.Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add("Orange");
		ll.add(50);
		ll.add(20);
		ll.add("Apple");
		System.out.println(ll);
		//Traversing the element by using Traditional for loop.
		System.out.println("Travesing the element by using forloop");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		//Traversing the element by using Iterator.
		//In descending Order.
		System.out.println("Traversing the elment in descending Order by using iterator");
		Iterator iter=ll.descendingIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		

	}

}
