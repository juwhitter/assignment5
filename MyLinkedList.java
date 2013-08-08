package assignment5;
/*
 * Braeden Bodily
 * Julian Whitteron
 */
import java.util.NoSuchElementException;

/**
 * Represents a generic doubly linked list.
 * 
 * @author Paymon Saebi 
 * @param <E> - the type of elements contained in the linked list
 */
public class MyLinkedList<E> implements List<E> 
{
	//Instance variables
	int size;
	Node head;
	Node tail;
	
	/**
	 * Constructor.  Creates a blank linked list.
	 */
	public MyLinkedList() 
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	/**
	 * @param element - The element to add at the beginning of the list.
	 *  
	 * Inserts the specified element at the beginning of the list.
	 * O(1) for a doubly-linked list.
	 */
	public void addFirst(E element) 
	{
		Node newHead = new Node(element);
		//If the size is 0, it assigns newHead to the head node, then proceeds with the rest.
		if (size == 0)
		{
			head = newHead;
			tail = newHead;
		}
			
		head.prev = newHead;
		newHead.next = head;
		head = newHead;
		size++;
	
	}
	
	/**
	 * @param element - The element to add at the end of the list.
	 * 
	 * Inserts the specified element at the end of the list.
	 * O(1) for a doubly-linked list.
	 */
	public void addLast(E o) 
	{
		
		Node newTail = new Node(o);
		//If the size is 0, it assigns newTail to the tail node, then proceeds with the rest.

		if (size == 0)
		{
			head = newTail;
			tail = newTail;
		}
		
		tail.next = newTail;
		newTail.prev = tail;
		tail = newTail;
		size++;
		
	}

	/**
	 * Inserts the specified element at the specified position in the list.
	 * Throws IndexOutOfBoundsException if index is out of range.
	 * O(N) for a doubly-linked list.
	 */
	public void add(int index, E element) throws IndexOutOfBoundsException 
	{
		if ((index > size-1) || (index < 0))
			throw new IndexOutOfBoundsException();
		
		Node n = new Node(element);
		Node temp = head;
		int x = 0;
		while (x < index)
		{
			temp = temp.next;
			x++;
		}
		n.next = temp;
		n.prev = temp.prev;
		temp.prev = n;
		n.prev.next = n;
		size++;
		
	}

	/**
	 * Returns the first element in the list.
	 * Throws NoSuchElementException if the list is empty.
	 * O(1) for a doubly-linked list.
	 */
	public E getFirst() throws NoSuchElementException 
	{	
		if (head == null)
			throw new NoSuchElementException();
		
		E item = head.data;		
		
		return item;		
	}

	/**
	 * Returns the last element in the list.
	 * Throws NoSuchElementException if the list is empty.
	 * O(1) for a doubly-linked list.
	 */
	public E getLast() throws NoSuchElementException 
	{
		if (tail == null)
			throw new NoSuchElementException();
		
		E item = tail.data;		
				
		return item;
	}

	/**
	 * Returns the element at the specified position in the list.
	 * Throws IndexOutOfBoundsException if index is out of range.
	 * O(N) for a doubly-linked list.
	 */
	public E get(int index) throws IndexOutOfBoundsException 
	{
		if ((index > size-1) || (index < 0))
			throw new IndexOutOfBoundsException();
		
		Node current = head;
		int startingPoint = 0;
		while (startingPoint < index)
		{
			current = current.next;
			startingPoint++;
			
		}
		E item = current.data;
		
		return item;
	}

	/**
	 * Removes and returns the first element from the list.
	 * Throws NoSuchElementException if the list is empty.
	 * O(1) for a doubly-linked list.
	 */
	public E removeFirst() throws NoSuchElementException 
	{	
		if (head == null)
			throw new NoSuchElementException();
		
		E item = head.data;	
		head.next.prev = null;
		head = head.next;
		size--;		
		return item;		
	}

	/**
	 * Removes and returns the last element from the list.
	 * Throws NoSuchElementException if the list is empty.
	 * O(1) for a doubly-linked list.
	 */
	public E removeLast() throws NoSuchElementException 
	{		
		if (tail == null)
			throw new NoSuchElementException();
		
		E item = tail.data;
		tail.prev.next = null;
		tail = tail.prev;
		size--;	
		return item;
	}

	/**
	 * Removes and returns the element at the specified position in the list.
	 * Throws IndexOutOfBoundsException if index is out of range.
	 * O(N) for a doubly-linked list.
	 */
	public E remove(int index) throws IndexOutOfBoundsException 
	{		
		if ((index > size-1) || (index < 0))
			throw new IndexOutOfBoundsException();
		
		Node temp = head;
		int x = 0;
		while (x < index)
		{
			temp = temp.next;
			x++;
		}
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		size--;	
		return temp.data;
	}

	/**
	 * Returns the index of the first occurrence of the specified element in the list, 
	 * or -1 if this list does not contain the element.
	 * O(N) for a doubly-linked list.
	 */
	public int indexOf(E element) 
	{		
		//While the index variable is less than size, it will check the data of the next node. Will check the very first slot before adding a number to index.
		int index = 0;
		Node temp = head;
		do
		{
			if(element.equals(temp.data))
					return index;
			index++;
			temp = temp.next;
		}
		while (index < size);
		return -1;
	}

	/**
	 * Returns the index of the last occurrence of the specified element in this list, 
	 * or -1 if this list does not contain the element.
	 * O(N) for a doubly-linked list.
	 */
	public int lastIndexOf(E element) 
	{		
		//While the index variable is greater than 0, it will check the data of the previous node. Will check the very last slot before removing a number to index.

		int index = size-1;
		Node temp = tail;
		do
		{
			if(element.equals(temp.data))
					return index;
			index--;
			temp = temp.prev;
		}
		while (index >= 0);
		return -1;

	}

	/**
	 * Returns the number of elements in this list.
	 * O(1) for a doubly-linked list.
	 */
	public int size() 
	{
		return size;
	}

	/**
	 * Returns true if this collection contains no elements.
	 * O(1) for a doubly-linked list.
	 */
	public boolean isEmpty() 
	{
		return (size == 0);
	}
	
	/**
	 * Removes all of the elements from this list.
	 * O(1) for a doubly-linked list.
	 */
	public void clear() 
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	/**
	 * Returns an array containing all of the elements in this list in proper sequence 
	 * (from first to last element).
	 * O(N) for a doubly-linked list.
	 */
	public Object[] toArray() 
	{				
		Object[] result = new Object[size];
		Node temp = head;
		for (int i = 0; i < size; i++)
		{
			result[i] = temp.data;
			temp = temp.next;
		}
		return result;
	}

	private class Node 
	{		
		//Added =null for next and prev.
		E data;
		Node next = null;
		Node prev = null;
		
		public Node(E element)
		{
			data = element;		
		}		
	}	
}
