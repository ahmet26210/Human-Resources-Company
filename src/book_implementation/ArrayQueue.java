package src.book_implementation;

import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class ArrayQueue<E> {
	private int front;
	private int rear;
	private int size;
	private int capacity=10;
	private E[] data;
	
	public ArrayQueue() {
		this(10);
	}
	public ArrayQueue(int capacity) {
		this.capacity=capacity;
		front=0;
		rear=capacity-1;
		size=0;
		data=(E[]) new Object[capacity];
	}
	public boolean offer(E element) {
		if(size==capacity) {
			reallocate();
		}
		size++;
		rear=(rear+1)%capacity;
		data[rear]=element;
		return true;
	}
	public E peek() {
		if(size==0) {
			return null;
		}
		else {
			return data[front];
		}
	}
	public E poll() {
		if(size==0)
			return null;
		else {
			E result=data[front];
			size--;
			front=(front+1)%capacity;
			return result;
		}
	}
	public Iter iterator(){
		return new Iter();
	}
	public String toString() {
		int index=front;
		StringBuilder result = new StringBuilder();
		while(index<=rear) {
			result.append(data[index]);
			if(data[index+1]!=null) {
				result.append(" ==> ");	
			}
			index=(index+1)%capacity;
		}
		return result.toString();
	}
	private void reallocate() {
		int newcapacity=capacity*2;
		E[] newdata=(E[]) new Object[newcapacity];
		int j=front;
		for(int i=0;i<size;i++) {
			 newdata[i]=data[j];
			 j=(j+1)%capacity;
		}
		front=0;
		rear=size-1;
		capacity=newcapacity;
		data=newdata;
	}
	private class Iter implements Iterator<E>{
		private int index;
		private int count=0;
		public Iter() {
			index=front;
		}
		@Override
		public boolean hasNext() {
			return count<size;
		}

		@Override
		public E next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
			E element=data[index];
			index=(index+1)%capacity;
			count++;
			return element;
		}	
	}
	public static void main(String[] args) {
		ArrayQueue<Integer> queue=new ArrayQueue<>();
		queue.offer(1);
		queue.offer(2);
		System.out.print(queue.peek());
		System.out.print(queue);
		queue.poll();
		System.out.print(queue);
		System.out.print("\n");
		Iterator<Integer> i = queue.iterator();
		while(i.hasNext()) {
			int a=i.next();
			System.out.print(a);
		}
	}
}

