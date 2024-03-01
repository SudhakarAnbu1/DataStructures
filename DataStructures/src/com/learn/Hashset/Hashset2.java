package com.learn.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset2 {

	public static void main(String[] args) {
		/*HashSet hs=new HashSet();
		hs.add(10);
		hs.add("Apple");
		hs.add(50);
		hs.add(20);
		//Duplicates are not allowed in hash set.
		hs.add(10);
		hs.add("Orange");
		System.out.println(hs);
		//Traversing the element by using advanced for loop.we does  not access the element by using normal for loop.
		//Because it will not contain any index.
		System.out.println("Traversing the element by using advanced for loop");
		for(Object obj:hs)
		{
			System.out.println(obj);
		}
		//Traversing the element by using Iterator.
		Iterator iter=hs.iterator();
		System.out.println("Traversing the element by using Iterator in ascening order");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}*/
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(50);
		hs.add(30);
		hs.add(70);
		hs.add(30);
		System.out.println(hs);
		
	}
	

}
