package edu.neu.csye6200.stack;

import java.util.Arrays;

public class Stack <T>{
private T[] arr;
private int index;

public Stack(int capacity){
	arr = (T[]) new Object[capacity];
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
public void push(T item) {
	if(this.isFull()) {
		System.exit(1);
	}
	arr[++index]=item;
}
public T pop() {
	if(this.isEmpty()) {
		System.exit(1);
	}
	return arr[index--];
}
public T peek() {
	if(this.isEmpty()) {
		System.exit(1);
	}
	return arr[index];
}

public String toString() {
	return Arrays.toString(arr);
}
}
