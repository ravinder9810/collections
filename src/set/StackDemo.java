package set;

import java.util.Stack;
import java.util.TreeSet;

public class StackDemo{
	public static void main(String[] args) {
		
		TreeSet<Customer> cust = new TreeSet<Customer>();
		//HashSet<Customer> cust = new TreeSet<Customer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(50);
		
		
		System.out.println(stack);
		System.out.println(stack.pop());
		
	}

}
