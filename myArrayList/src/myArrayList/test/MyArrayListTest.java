package myArrayList.test;

import java.io.File;
import java.io.IOException;

import myArrayList.MyArrayList;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;

public class MyArrayListTest 
{
	
	public void readFromFile(MyArrayList myArrayListInstance, String filename) throws IOException
	{
		// calling the method to read the file inputs
		FileProcessor fileProcessorInstance = new FileProcessor();
		fileProcessorInstance.readLine(myArrayListInstance, filename);
	}
	public int testMe(MyArrayList myArrayListInstance, Results resultsInstance) 
	{
		// Running the test cases one by one to check the correctness of the code
		testCase1(myArrayListInstance, resultsInstance);
		testCase2(myArrayListInstance, resultsInstance);
		testCase3(myArrayListInstance, resultsInstance);
		testCase4(myArrayListInstance, resultsInstance);	
		testCase5(myArrayListInstance, resultsInstance);
		testCase6(myArrayListInstance, resultsInstance);
		testCase7(myArrayListInstance, resultsInstance);
		testCase8(myArrayListInstance, resultsInstance);
		testCase9(myArrayListInstance, resultsInstance);
		testCase10(myArrayListInstance, resultsInstance);
		return 0;
	}
//	void mainOutput(MyArrayList myArrayListInstance, Results resultsInstance)
//	{
//		String testName = "The sum of all the values in the array list is:";
//		//System.out.println();
//		resultsInstance.storeNewResult(testName);
//		int number= 0;
//		number = myArrayListInstance.sum();
//		testName = String.valueOf(number);
//		resultsInstance.storeNewResult(testName);
//	}
	void testCase1(MyArrayList myArrayListInstance, Results resultsInstance)
	{
		String testName = "The sum of all the values in the array list is:";
		resultsInstance.storeNewResult(testName);
		int number= 0;
		number = myArrayListInstance.sum();
		testName = String.valueOf(number);
		resultsInstance.storeNewResult(testName);
		testName = "Test Case 1: Check whether the elements are inserting in a sorted manner";
		//System.out.println();
		resultsInstance.storeNewResult(testName);
		myArrayListInstance.toString();
		testName = "Test Case 1 is Passed!!";
		resultsInstance.storeNewResult(testName);
		System.out.println("********************************************************************");
	}
	void testCase2(MyArrayList myArrayListInstance, Results resultsInstance)
	{
		String testName = "Test Case 2: Check if we are able to delete the Number";
		resultsInstance.storeNewResult(testName);
		int number=8;
		//Scanner in = new Scanner(System.in);
		System.out.println("The value that you want to delete: "+number);
		//number = in.nextInt();
		myArrayListInstance.removeValue(number);
		testName = "Test Case 2 is Passed!!";
		resultsInstance.storeNewResult(testName);
		System.out.println("********************************************************************");
	}
	void testCase3(MyArrayList myArrayListInstance, Results resultsInstance)
	{
		String testName = "Test Case 3: Find number of values in array List";
		resultsInstance.storeNewResult(testName);
		int result = 0;
		result = myArrayListInstance.size();
		if(result == 0)
		{
			testName = "It seems that the Array List is Empty. But, if it is actually not Empty then Test Case 3 is Failed!!";
		}
		else if(result > 0)
		{
			testName = "Test Case 3 is Passed!!";
		}
		resultsInstance.storeNewResult(testName);
		System.out.println("********************************************************************");
	}
	void testCase4(MyArrayList myArrayListInstance, Results resultsInstance)
	{
		String testName = "Test Case 4: Find the Index of a number in Array List";
		resultsInstance.storeNewResult(testName);
		int number=8;
		//Scanner in = new Scanner(System.in);
		System.out.println("The value whose index you want to know: "+number);
		//number = in.nextInt();
		myArrayListInstance.indexOf(number);
		testName = "Test Case 4 is Passed!!";
		resultsInstance.storeNewResult(testName);
		System.out.println("********************************************************************");
	}
	void testCase5(MyArrayList myArrayListInstance, Results resultsInstance)
	{
		String testName = "Test Case 5: Find SUM of all values in array List";
		resultsInstance.storeNewResult(testName);
		int result = 0;
		//myArrayListInstance.toString();
		result = myArrayListInstance.sum();
		if(result == 0)
		{
			testName = "It seems that the Array List is Empty. But, if it is actually not Empty then Test Case 5 is Failed!!";
		}
		else if(result > 0)
		{
			testName = "Test Case 5 is Passed!!";
		}
		resultsInstance.storeNewResult(testName);
		System.out.println("********************************************************************");
	}
	
	void testCase6(MyArrayList myArrayListInstance, Results resultsInstance)
	{
		String testName = "Test Case 6: Check if SUM is working correctly after deletion of a particular value";
		resultsInstance.storeNewResult(testName);
		int result = 0;
		int occurances = 0;
		int number=5;
		//Scanner in = new Scanner(System.in);
		//number = in.nextInt();
		result = myArrayListInstance.sum();
		System.out.println("The value that you want to delete: "+number);
		myArrayListInstance.removeValue(number);
		occurances = myArrayListInstance.Occurances();
		int newResult = 0;
		System.out.print("After Deletion of all occurances of "+number+", ");
		newResult = myArrayListInstance.sum();
		if(newResult == (result - number*occurances))
		{
			testName = "Test Case 6 is Passed !!";
		}
		else 
		{
			System.out.println("sum1: "+(result - number*occurances));
			System.out.println("sum2: "+newResult);
			testName = "Test Case 6 is failed !!";
		}
		resultsInstance.storeNewResult(testName);
		System.out.println("********************************************************************");
	}
	void testCase7(MyArrayList myArrayListInstance, Results resultsInstance)
	{
		String testName = "Test Case 7: Check if Indexing is working after Deletion of a value";
		resultsInstance.storeNewResult(testName);
		int number=3;
		//Scanner in = new Scanner(System.in);
		System.out.println("The value whose index you want to know: "+number);
		//number = in.nextInt();
		int result = myArrayListInstance.indexOf(number);
		//System.out.println("Removing all occurances of "+number+" from Array List.");
		//System.out.println();
		myArrayListInstance.removeValue(number);
		int newResult = myArrayListInstance.indexOf(number);
		if(newResult == -1)
		{
			testName = "Test Case 7 is Passed !!";
		}
		else 
			testName = " Test Case 7 is failed !!";
		resultsInstance.storeNewResult(testName);
		System.out.println("********************************************************************");
	}
	void testCase8(MyArrayList myArrayListInstance, Results resultsInstance)
	{
		String testName = "Test Case 8: Range of Numbers";
		resultsInstance.storeNewResult(testName);
		int number=12000;
		//Scanner in = new Scanner(System.in);
		System.out.println("The value that you want to insert in the Array List: "+number);
		//number = in.nextInt();
		myArrayListInstance.insertSorted(number);
		testName = "Test Case 8 is passed !!";		
		resultsInstance.storeNewResult(testName);
		System.out.println("********************************************************************");
	}
	void testCase9(MyArrayList myArrayListInstance, Results resultsInstance)
	{
		String testName = "Test Case 9: Check if the Array List is getting updated after any operation";
		resultsInstance.storeNewResult(testName);
		myArrayListInstance.toString();
		int value=1200;
		myArrayListInstance.insertSorted(value);
		System.out.println();
		System.out.print("After addition of "+value+", ");
		myArrayListInstance.toString();
		testName = "Test Case 9 is passed !!";	
		resultsInstance.storeNewResult(testName);
		System.out.println("********************************************************************");
	}
	void testCase10(MyArrayList myArrayListInstance, Results resultsInstance)
	{
		String testName = "Test Case 10: Checking if all the operations are working fine together";
		resultsInstance.storeNewResult(testName);
		myArrayListInstance.toString();
		int value1=12000;
		int value2=23;
		int value3=34;
		System.out.print("Trying to Add Numbers: "+value1+","+value2+","+value3+"");
		System.out.println();
		
		myArrayListInstance.insertSorted(value1);
		
		myArrayListInstance.insertSorted(value2);
		
		myArrayListInstance.insertSorted(value3);
		myArrayListInstance.toString();
		int number=3;
		//Scanner in = new Scanner(System.in);
		System.out.println("The value whose index you want to know: "+number);
		int result = myArrayListInstance.indexOf(number);
		myArrayListInstance.sum();
		System.out.println("The value that you want to delete: "+value2);
		myArrayListInstance.removeValue(value2);
		//myArrayListInstance.toString();
		number = myArrayListInstance.sum();
		//System.out.println("The SUM of all the numbers is: "+number);
		testName = "Test Case 10 is passed !!";
		resultsInstance.storeNewResult(testName);		
		System.out.println("********************************************************************");
	}
}
