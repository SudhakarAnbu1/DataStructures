package com.learn.Arraylist;

import java.util.*;


public class Arraylist {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("mango");
		al.add(20);
		al.add("Orange");
		System.out.println(al);
		//Traversing the element by using for loop.
		for (int i = 0; i <=al.size()-1; i++) {
			System.out.println(al.get(i));
		}
		//Traversing the element by using Iterator.
		
		Iterator iter=al.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
			
		}
	}


