package edu.neu.csye6200.queue;

import java.util.Arrays;

public class IntQueue{
	private int front;
	private int rear;
	private int count;
	private int[] arr ;
	
	public IntQueue(int capacity){
		
		arr =  new int[capacity];
		count =0;
		front = 0;
		rear = -1;
	}
	
	public int size() {
		return count ;
	}
	public boolean isEmpty() {
		return this.size()==0;
	}
	public boolean isFull() {
		return this.size()==arr.length;
	}
	public void dequeue() {
		if (this.isEmpty()) {
			System.exit(1); 
		}
		System.out.println("Removing " + arr[front]);
		front = (front + 1) % arr.length;
		count--;
	}
	
	public void enqueue(int item) {
		if (this.isFull()) {
			System.exit(1); 
		}
		System.out.println("Adding " + item);
		rear = (rear + 1) % arr.length; 
		arr[rear] = item;
		count++;
	}
	
	public int peek() {
		if (this.isEmpty()) {
			System.exit(1); 
		}
		return arr[front];
	}
	public String toString() {
		return Arrays.toString(arr);
	}
}
