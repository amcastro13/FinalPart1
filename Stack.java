package inNOut.project;

import java.util.EmptyStackException;



public final class Stack<T> implements StackInterface<T> {
	
	private static final int maxCapacity = 10;
	private static final int minimumCapacity = 0;
	private  T[] stacks;
	private int numOfObjects;
	
	public Stack(){
		this(minimumCapacity);
		
	}
	
	public Stack(int desiredCapacity) {
			@SuppressWarnings("unchecked")
			T[] tempStack = (T[])new Object[desiredCapacity];
			stacks = tempStack;
			numOfObjects = 0;
		
	
	}
	
	@Override
	public void push(T newEntry) {
		// TODO Auto-generated method stub
		if(stacks.length == numOfObjects) {
			resize();
		}
		if(isEmpty()) {
			stacks[numOfObjects + 1] = newEntry;
			numOfObjects++;
			
		}
		else if(numOfObjects < maxCapacity - 1){
			stacks[numOfObjects + 1] = newEntry;
			numOfObjects++;
			
			
		}
		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
		T temp = null;
		int currentObjects = numOfObjects;
		int newNumOfObjects = numOfObjects - 1;
		temp = stacks[currentObjects];
		stacks[currentObjects] = stacks[newNumOfObjects];
		stacks[newNumOfObjects] = null;
		numOfObjects--;
		
		
		return temp;
		}
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new EmptyStackException();
		else
		return stacks[numOfObjects];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean empty = false;
		if(numOfObjects == 0) {
			empty = true;
		}
			
		
		return empty;
	}
	
	public void resize() {
		@SuppressWarnings("unchecked")
		T[] newStack = (T[]) new Object[numOfObjects + 10];
		for(int i = 0; i <= numOfObjects - 1; i++) {
			newStack[i] = stacks[i];
		}
		stacks = newStack;
	
		
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(int i = 0; i <= numOfObjects; i++) {
			stacks[i] = null;
		}

		
	}

	
}

