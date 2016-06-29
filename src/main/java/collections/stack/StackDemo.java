package collections.stack;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("Z");
		stack.push("M");
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
