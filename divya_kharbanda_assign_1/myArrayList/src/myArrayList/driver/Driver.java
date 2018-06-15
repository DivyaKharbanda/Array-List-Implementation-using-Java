package myArrayList.driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import myArrayList.test.*;
import myArrayList.MyArrayList;
import myArrayList.util.Results;

public class Driver {

	public static void main(String[] args) 
	{
		File path=null;
		//=new File("C:\\Binghamton\\DesignPattern\\Assignment1\\src\\test");;
		
		// Taking the input from the user to enter the name of the file
		Scanner in = new Scanner(System.in);
		String filename ;
		System.out.println("Ener the Name of the Input file: ");
		filename = in.nextLine();
		
		MyArrayList myArrayListInstance = new MyArrayList();
		
		Scanner sc = new Scanner(System.in);
		String output ;
		System.out.println("Ener the Name of the output file: ");
		output = sc.nextLine();
		Results ResultsInstance = new Results(output);

		MyArrayListTest myArrayListTestInstance = new MyArrayListTest();
		try 
		{
			myArrayListTestInstance.readFromFile(myArrayListInstance,filename);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			PrintWriter pw = new PrintWriter(output);
			//myArrayListInstance.sum();
			pw.close();
		} 
		catch (FileNotFoundException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//myArrayListInstance.sum();
		
		myArrayListTestInstance.testMe(myArrayListInstance, ResultsInstance);

	}

}
