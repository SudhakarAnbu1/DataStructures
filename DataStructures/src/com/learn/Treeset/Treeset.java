package com.learn.Treeset;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		//Generic is used for type safety.TreeSet does not allow the heterogeneous data.
		TreeSet<Integer> tr=new TreeSet<Integer>();
		tr.add(20);
		tr.add(10);
		tr.add(40);
		tr.add(30);
		tr.add(50);
		//Duplicate values are not allowed in tree set.
		tr.add(10);
		
		System.out.println(tr);
		//Traversing the element by using Advanced for loop because TreeSet wont have any indexes. 
		for(Object obj:tr)
		{
			System.out.println(obj);
		}
		

	}

}
