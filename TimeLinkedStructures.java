package assignment5;
/*
 * Julian Whitteron
 * Braeden Bodily
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeLinkedStructures
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		long start, mid, end;
		int timesToLoop = 10;
		int sizeN = 1000000;
		
//		// Timing addFirst-----------------------------------------------------------------------------------------------
		MyLinkedList<Integer> mylinkedlisttest = new MyLinkedList<Integer>(); // Create the test MyLinkedList object
//		
//		System.out.println("Test addFirst()");
//		try 
//		{
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {e.printStackTrace();}
//		
//		// Continue to add objects 
//		for (int i = 0; i <= sizeN; i++)
//		{
//			// Print out every increment of 10000 to test times for large sizes N
//			if ((i % 50000) == 0)
//			{
//				start = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++)
//				{
//					mylinkedlisttest.addFirst(j);
//					i++;
//				}
//				mid = System.nanoTime();
//				// Test time of for loop
//				for (int j = 0; j < timesToLoop; j++);
//				end = System.nanoTime();
//				
//				//System.out.println(i - timesToLoop);
//			}
//
//			// Add an addFirst to take into account the i++ in the for loop.
//			mylinkedlisttest.addFirst(i);
//		}
//		
//		
//		// Timing ArrayList add()
		ArrayList<Integer>	arraytest = new ArrayList<Integer>();
//		
//		System.out.println("Test ArrayList add()");
//		try 
//		{
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {e.printStackTrace();}
//		
//		// Continue to add objects 
//		for (int i = 0; i <= sizeN; i++)
//		{
//			// Print out every increment of 10000 to test times for large sizes N
//			if ((i % 50000) == 0)
//			{
//				start = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++)
//				{
//					arraytest.add(0, j);
//					i++;
//				}
//				mid = System.nanoTime();
//				// Test time of for loop
//				for (int j = 0; j < timesToLoop; j++);
//				end = System.nanoTime();
//				
//				//System.out.println(((mid - start) - (end - mid)) / timesToLoop);
//			}
//
//			// Add an addFirst to take into account the i++ in the for loop.
//			arraytest.add(i);
//		}
//		
//		
		// Test MyLinkedList get methods------------------------------------------------------------------------------------
//		System.out.println("Test MyLinkedList get()");
//		
//		mylinkedlisttest = new MyLinkedList<Integer>();
//		
//		try 
//		{
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {e.printStackTrace();}
//		
//		for (int i = 0; i <= sizeN; i++)
//		{
//			mylinkedlisttest.addLast(i);
//			
//			if ((i % 50000) == 0)
//			{
//				//int index = (int) (Math.random() * mylinkedlisttest.size());
//				start = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++)
//				{
//					mylinkedlisttest.get((int) (Math.random() * mylinkedlisttest.size()));
//				}
//				mid = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++);
//				end = System.nanoTime();
//						
//				System.out.println(((mid - start) - (end - mid)) / timesToLoop);		
//			}
//			
//		}
//		
//		
//		System.out.println("Test ArrayList get()");
//		
//		arraytest = new ArrayList<Integer>();
//		
//		try 
//		{
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {e.printStackTrace();}
//		
//		for (int i = 0; i <= sizeN; i++)
//		{
//			arraytest.add(i);
//			
//			if ((i % 50000) == 0)
//			{
//				//int index = (int) (Math.random() * mylinkedlisttest.size());
//				start = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++)
//				{
//					arraytest.get((int) (Math.random() * arraytest.size()));
//				}
//				mid = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++);
//				end = System.nanoTime();
//						
//				System.out.println(((mid - start) - (end - mid)) / timesToLoop);		
//			}
//			
//		}
//		
//
//		// Test MyLinkedList remove methods------------------------------------------------------------------------------------
//		System.out.println("Test MyLinkedList remove()");
//		
//		mylinkedlisttest = new MyLinkedList<Integer>();
//		
//		try 
//		{
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {e.printStackTrace();}
//		
//		for (int i = 0; i <= sizeN; i++)
//		{
//			mylinkedlisttest.addLast(i);
//			
//			if ((i % 50000) == 0 && i != 0)
//			{
//				//int index = (int) (Math.random() * mylinkedlisttest.size());
//				start = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++)
//				{
//					mylinkedlisttest.remove((int) (Math.random() * mylinkedlisttest.size()));
//				}
//				mid = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++);
//				end = System.nanoTime();
//						
//				System.out.println(((mid - start) - (end - mid)) / timesToLoop);		
//			}
//			
//		}
//		
//		
//		System.out.println("Test ArrayList remove()");
//		
//		arraytest = new ArrayList<Integer>();
//		
//		try 
//		{
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {e.printStackTrace();}
//		
//		for (int i = 0; i <= sizeN; i++)
//		{
//			arraytest.add(i);
//			
//			if ((i % 50000) == 0 && i != 0)
//			{
//				//int index = (int) (Math.random() * mylinkedlisttest.size());
//				start = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++)
//				{
//					arraytest.remove((int) (Math.random() * arraytest.size()));
//				}
//				mid = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++);
//				end = System.nanoTime();
//						
//				System.out.println(((mid - start) - (end - mid)) / timesToLoop);		
//			}
//			
//		}
//		
		
		// Test MyLinkedList to java's LinkedList add()----------------------------------------------------------
		
//		System.out.println("Java's LinkedList addFirst()");
		LinkedList<Integer> javalist = new LinkedList<Integer>();
//		try 
//		{
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {e.printStackTrace();}
//		
//		// Continue to add objects 
//		for (int i = 0; i <= sizeN; i++)
//		{
//			// Print out every increment of 10000 to test times for large sizes N
//			if ((i % 50000) == 0)
//			{
//				start = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++)
//				{
//					javalist.addFirst(j);
//					i++;
//				}
//				mid = System.nanoTime();
//				// Test time of for loop
//				for (int j = 0; j < timesToLoop; j++);
//				end = System.nanoTime();
//				
//				System.out.println(((mid - start) - (end - mid)) / timesToLoop);
//			}
//
//			// Add an addFirst to take into account the i++ in the for loop.
//			javalist.addFirst(i);
//		}

		// Test MyLinkedList to java's LinkedList get()----------------------------------------------------------
		
//		System.out.println("Java's LinkedList get()");
//		
//		try 
//		{
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {e.printStackTrace();}
//		
//		for (int i = 0; i <= sizeN; i++)
//		{
//			javalist.addLast(i);
//			
//			if ((i % 50000) == 0)
//			{
//				//int index = (int) (Math.random() * mylinkedlisttest.size());
//				start = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++)
//				{
//					javalist.get((int) (Math.random() * javalist.size()));
//				}
//				mid = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++);
//				end = System.nanoTime();
//						
//				System.out.println(((mid - start) - (end - mid)) / timesToLoop);		
//			}
//			
//		}
		
//		System.out.println("Test Javas LinkedList remove()");
//		
//		javalist = new LinkedList<Integer>();
//		
//		try 
//		{
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {e.printStackTrace();}
//		
//		for (int i = 0; i <= sizeN; i++)
//		{
//			javalist.addLast(i);
//			
//			if ((i % 50000) == 0 && i != 0)
//			{
//				//int index = (int) (Math.random() * mylinkedlisttest.size());
//				start = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++)
//				{
//					javalist.remove((int) (Math.random() * javalist.size()));
//				}
//				mid = System.nanoTime();
//				for (int j = 0; j < timesToLoop; j++);
//				end = System.nanoTime();
//						
//				System.out.println(((mid - start) - (end - mid)) / timesToLoop);		
//			}
//			
//		}
		
		System.out.println("Push test");
		MyStack<Integer> stacktest = new MyStack<Integer>();
		try 
		{
			Thread.sleep(4000);
		} catch (InterruptedException e) {e.printStackTrace();}
		
		for (int i = 0; i <= sizeN; i++)
		{
			stacktest.push(i);
			
			if ((i % 50000) == 0)
			{
				start = System.nanoTime();
				for (int j = 0; j < timesToLoop; j++)
				{
					stacktest.push(i);
				}
				mid = System.nanoTime();
				for (int j = 0; j < timesToLoop; j++);
				end = System.nanoTime();
						
				System.out.println(((mid - start) - (end - mid)) / timesToLoop);		
			}
			
		}
		
		
	}
}
