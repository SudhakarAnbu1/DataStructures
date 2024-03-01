package com.learn.stack;

import java.util.Stack;

public class StackDataStructure {

	public static void main(String[] args)
	{

		Stack<Integer> stack=new Stack<Integer>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);


		delete(stack);

	}
	public static void delete(Stack<Integer> stack)
	{

		for (int i =stack.size(); i >= 0; i--) 
		{
			//empty method is used to check the stack is empty or not
			if(stack.empty())
			{
				System.out.println("Stack is empty");
			}
			else
			{
				//pop method is used to delete the last element of the stack. 
				System.out.println(stack.pop());
			}
		}
	}

}
