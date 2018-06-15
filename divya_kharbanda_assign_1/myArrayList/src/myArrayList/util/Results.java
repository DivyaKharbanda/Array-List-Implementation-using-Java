package myArrayList.util;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import myArrayList.MyArrayList;
import myArrayList.util.FileDisplayInterface;
import myArrayList.util.StdoutDisplayInterface;

public class Results implements FileDisplayInterface, StdoutDisplayInterface
{
	private String name1;
	private String output = "";
	public Results(String fileName) {
		 name1 = fileName;
		 
		// TODO Auto-generated constructor stub
	}
	@Override
	public void writeToFile(String testName) 
	{
		System.out.print(testName);
		//System.out.println();
	}
	@Override
	public void writeToStdout(String testName) 
	{
		// Here we are writing the output of the test cases on console
		System.out.println(testName);
		//System.out.println();
	}
	public void storeNewResult(String testName)
	{
		// Here we are writing the output of the test cases in output file
		MyArrayList myArrayList = new MyArrayList();
		try {
			PrintWriter pr = new PrintWriter(new FileWriter(name1, true));
			writeToFile(output);
			//myArrayList.sum();
			pr.write(testName);
			pr.println();
			pr.flush();
			pr.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		writeToStdout(testName);
	}
}