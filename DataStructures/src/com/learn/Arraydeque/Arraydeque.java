package com.learn.Arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Arraydeque {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(40);
		ad.add(30);
		ad.add(50);
		ad.add(20);
		System.out.println(ad);
		//Add first method is used to store the element in the first Position.
		ad.addFirst("First Element");
		//Add last method is used to store the element in the last position.
		ad.addLast("Last Element");
		//Traversing the element by using advanced for loop because it wont contain any indexes.
		for(Object obj:ad)
		{
			System.out.println(obj);
		}
		System.out.println("Traversing the element by using the Iterator");
		Iterator iter=ad.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
