package assignment5;
/*
 * Braeden Bodily
 * Julian Whitteron
 */
import java.util.ArrayList;

import assignment4.SortUtil;
import junit.framework.TestCase;

public class TestLinkedStructures extends TestCase 
{

	MyLinkedList<Integer> testlist;
	MyStack<Integer> teststack;
	
	protected void setUp() throws Exception 
	{
		testlist = new MyLinkedList<Integer>();
		super.setUp();
	}

	protected void tearDown() throws Exception 
	{
		super.tearDown();
	}

	public void testConstructor()
	{
		//Testing constructor, making sure the size variable, the size method both point to 0, and head and tail are both null.
		assertEquals(0,testlist.size());
		assertEquals(0,testlist.size);
		assertEquals(null, testlist.head);
		assertEquals(null, testlist.tail);
	}
	public void testAddFirst()
	{
		//Tries to get the first element of an empty array. exception is expected.
		try
		{
			testlist.getFirst();
			fail("Didn't throw the expected exception.");
		}
		catch (Exception e){}
		testlist.addFirst(12);
		testlist.addFirst(24);
		assertEquals(24,(int)testlist.get(0));
		assertEquals(12,(int)testlist.get(1));
	}
	public void testAddLast()
	{
		testlist.addLast(223);
		testlist.addLast(2);
		testlist.addLast(40);
		assertEquals(223,(int)testlist.get(0));
		assertEquals(2,(int)testlist.get(1));
		assertEquals(40,(int)testlist.getLast());
		assertEquals(223,(int)testlist.getFirst());
	}
	public void testAddandRemove()
	{
		//Attempts to add 23 to the 4th element of an empty list, expected to throw exception.
		try
		{
			testlist.add(4,23);
			fail("Didn't throw the expected exception.");
		}
		catch (Exception e){}
		//Adds 1 to element 0(head) and 5 to the last element(tail).
		testlist.addFirst(1);
		testlist.addLast(5);
		//tries to add 7 to the 7th element, which is out of bounds, expected to throw exception.
		try
		{
			testlist.add(7,7);
			fail("Didn't throw the expected exception.");
		}
		catch (Exception e){}
		//Adds 2 to element 1, 4 to element 2, 6 to element 3.
		testlist.add(1,2);
		testlist.add(2,4);
		testlist.add(3,6);
		//Making sure 2 is in element 1, 4 is in element 2, and 6 is in element 3.
		assertEquals(2,(int)testlist.get(1));
		assertEquals(4,(int)testlist.get(2));
		assertEquals(6,(int)testlist.get(3));
		//Checking that 5 is returned when removeLast() is called, and then making sure that the previous slot is now the last.
		assertEquals(5,(int)testlist.removeLast());
		assertEquals(6,(int)testlist.getLast());
		
		//Checks that 2 is returned when element 1 is removed, and that everything else shifts over accordingly.
		assertEquals(2,(int)testlist.remove(1));
		assertEquals(4,(int)testlist.get(1));
		assertEquals(6,(int)testlist.get(2));		
	}
	
	public void testIndexOf()
	{
		for (int i = 0; i <20; i++)
			testlist.addLast(i);
		//Testing indexOf 
		assertEquals(10,testlist.indexOf(10));
		//Testing to make sure -1 is returned when something doesn't exist.
		assertEquals(-1, testlist.indexOf(45));
		testlist.add(15, 1);
		//Testing lastindexof (reverse search)
		assertEquals(15,testlist.lastIndexOf(1));
	}
	public void testSizeIsEmptyClear()
	{
		//Testing isempty against an empty list
		assertEquals(true,testlist.isEmpty());
		//Testing against a populated list and verifying the size.
		for (int i = 0; i <20; i++)
			testlist.addLast(i);
		assertEquals(20,testlist.size());
		assertEquals(false,testlist.isEmpty());
		//Clearing the list and and making sure its empty
		testlist.clear();
		assertEquals(0,testlist.size());
		try
		{
			testlist.getFirst();
			fail("Didn't throw the expected exception.");
		}
		catch (Exception e){}
		try
		{
			testlist.getLast();
			fail("Didn't throw the expected exception.");
		}
		catch (Exception e){}
		
	}
	public void testToArray()
	{
		for (int i = 0; i < 5; i++)
			testlist.addLast(i);
		
		Object[] test = testlist.toArray();
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < test.length;i++)
			output.add((Integer) test[i]);
		assertEquals("[0, 1, 2, 3, 4]", output.toString());
	}
	
	public void testStack()
	{
		teststack = new MyStack<Integer>();
		// Add integers to myStack
		teststack.push(3);
		teststack.push(5);
		teststack.push(1);
		
		// test size()
		assertEquals(3, teststack.size());
		// test pop()
		assertEquals(1, (int)teststack.pop());
		assertEquals(5, (int)teststack.pop());
		
		// Clear the stack
		teststack.clear();
		assertEquals(true, teststack.isEmpty());
		
		// Test for exception in peek()
		try
		{
			teststack.peek();
			fail("Didn't throw the expected exception.");
		}
		catch (Exception e){}
		
		// Test for exception in pop()
		try
		{
			teststack.pop();
			fail("Didn't throw the expected exception.");
		}
		catch (Exception e){}
	}
}