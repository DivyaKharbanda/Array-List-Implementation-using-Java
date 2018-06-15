package myArrayList.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import myArrayList.MyArrayList;

public class FileProcessor {
	public void readLine(MyArrayList myArrayListInstance, String filename) throws IOException
    {
		// Here we are reading the lines of file one by onein
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferReader = new BufferedReader(fileReader);
        String readLine = null;
        try
        {
            while((readLine = bufferReader.readLine()) != null)
            {
                if((Integer.parseInt(readLine)>=0 && Integer.parseInt(readLine)<=10000))
                {
                    myArrayListInstance.insertSorted(Integer.parseInt(readLine));
                }
            }
        }
        catch(IOException io)
        {
            io.printStackTrace();
        }
        finally
        {
            fileReader.close();
            bufferReader.close();
        }
    }
}
