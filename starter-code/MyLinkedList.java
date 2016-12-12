package ListLab;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{

	private Node<T> head;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public boolean remove(int index) {
		//to-do

		/*
		head
		 */
		if (index == 0) {

			head = head.getNext();

		/*
		tail
		 */
		} else if (index +1 == size) {

			getNodeAt(index - 1).setNext(null);

		/*
		previous node
		*/
		} else {

			Node<T> previousNode = getNodeAt(index -1);
			Node<T> nextNode = previousNode.getNext().getNext();

			previousNode.setNext(nextNode);
		}
	}

	public T get(int index) {
		//to-do
		Node<T> currentNode = getNodeAt(index);
		return currentNode.getData();
	}

	public Node<T> getNodeAt(int index) {

		Node<T> currentNode = head;

		for (int i = 0; i < index; i++) {

			currentNode = currentNode.getNext();
	}

	public void add(T obj) {
		//to-do
		Node<T> newNode = new Node<>(obj, null);
		Node<T> lastNode = null;

		if (head == null) {
			head = newNode;
		} else {
			lastNode = getNodeAt(size, -1);
			lastNode.setNext(newNode);
		}

		size++;
		}
	}

	//The methods below are bonus

	public void add(int index, T obj){
		//to-do
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(head);
	}

	private class MyIterator<T> implements Iterator<T> {

		private Node<T> node;

		public MyIterator(Node<T> node) {
			//to-do
		}
		@Override
		public boolean hasNext() {
			//to-do
		}

		@Override
		public T next() {
			//to-do
		}

		@Override
		public void remove() {
			// to-do

		}

	}
}
