package edu.neu.csye6200.stack;

import java.util.Arrays;

public class IntStack {
private int[] arr;
private int index;

public IntStack(int capacity){
	arr =  new int[capacity];
	index =-1;
}

public int size() {
	return index+1;
} 
public boolean isEmpty() {
	return this.size()==0;
}
public boolean isFull() {
	return this.size()==arr.length;
}
public void push(int item) {
	if(this.isFull()) {
		System.exit(1);
	}
	arr[++index]=item;
}
public int pop() {
	if(this.isEmpty()) {
		System.exit(1);
	}
	return arr[index--];
}
public int peek() {
	if(this.isEmpty()) {
		System.exit(1);
	}
	return arr[index];
}
public String toString() {
	return Arrays.toString(arr);
}
}
