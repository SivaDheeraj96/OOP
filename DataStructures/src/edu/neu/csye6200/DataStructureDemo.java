package edu.neu.csye6200;

import edu.neu.csye6200.queue.IntQueue;
import edu.neu.csye6200.queue.Queue;
import edu.neu.csye6200.stack.IntStack;
import edu.neu.csye6200.stack.Stack;

public class DataStructureDemo {
public static void demo() {
	
	System.out.println("-------GenericQueue-------");
	Queue<Float> q1 = new Queue<Float>(4);
	q1.enqueue(1.0f);
	q1.enqueue(3.0f);
	System.out.println(q1.peek());
	q1.dequeue();
	System.out.println(q1.peek());
	q1.enqueue(5.0f);
	System.out.println(q1);
	q1.dequeue();
	q1.dequeue();
	System.out.println(q1.isEmpty());
	System.out.println("-------IntQueue-------");
	IntQueue q2 = new IntQueue(5);
	q2.enqueue(5);
	q2.enqueue(6);
	System.out.println(q2.peek());
	q2.dequeue();
	q2.enqueue(3);
	System.out.println(q2.peek());
	q2.dequeue();
	q2.dequeue();
	System.out.println(q2.isEmpty());
	
	System.out.println("-------GenericStack-------");
	Stack<String> names = new Stack<String>(4);
	names.push("north");
	names.push("east");
	names.push("west");
	System.out.println(names.peek());
	names.push("south");
	System.out.println(names.isFull());
	System.out.println(names);
	names.pop();
	names.pop();
	names.pop();
	names.pop();
	System.out.println(names.isEmpty());
	
	
	
	System.out.println("-------IntStack-------");
	IntStack q3 = new IntStack(3);
	q3.push(12);
	q3.push(1);
	q3.push(2);
	System.out.println(q3);
	System.out.println(q3.peek());
	q3.pop();
	q3.pop();
	System.out.println(q3.isEmpty());
}


}
