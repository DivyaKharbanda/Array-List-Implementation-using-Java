package myArrayList;

public class MyArrayList 
{
	private int sizeOfArray;
    private int[] rawData;
    private int occurance;

    // initializing the data member
    public MyArrayList()
    {
        rawData = new int[50];
    }
    // setter method to start rawdata hold reference of new array
    public void setArray(int[] arrayRef)
    {
        rawData = arrayRef;
    }
    // inserting the elements in array in a sorted manner
    public void insertSorted(int newValue)
    {
    	//checking if the values are in range of 0 to 10000
    	if(newValue >= 0 && newValue <= 10000)
    	{
        // check if size is equal to length
        if(sizeOfArray == rawData.length)
        {
            // make new array with 50% increment in size
            int lengthOfArray = rawData.length + (rawData.length/2);
            int[] tempArray = new int[lengthOfArray];

            //copy old data into new array
            for(int i=0; i<rawData.length; i++)
            {
                tempArray[i]=rawData[i];
            }
            
            //call the setter method to start rawdata hold reference of new array
            setArray(tempArray);

            //insert new value
            rawData[sizeOfArray]=newValue;
        }
        // if size has not reached array length directly out into array
        else
        {
            rawData[sizeOfArray] = newValue;
        }
        // increase sizeOfArray by 1
        sizeOfArray++;
        // if and else common steps outside no repetitive code
       // Arrays.sort(rawData,0, sizeOfArray);
        
        for(int k=0; k<sizeOfArray-1; k++)
        {
        	int minimumIndex=k;
        	for(int j=k+1; j<sizeOfArray; j++)
        	{
        		if(rawData[j] < rawData[minimumIndex])
        		{
        			int temp = rawData[minimumIndex];
        			rawData[minimumIndex] = rawData[j];
        			rawData[j] = temp;
        		}
        	}
        }
        }
    else
    {
    	System.out.println("Error !! Number "+newValue+" range should be between 0 and 10000");
    }
    }
    
    //method to remove the value
    public void removeValue(int value)
    {
    	occurance=0;
    	boolean flag = false;
    	String result="Value is not found in the Array List";
    	for(int i=0; i<sizeOfArray; i++)
    	{
    		if(rawData[i]==value)
    		{
    			for(int index=i; index<sizeOfArray;index++)
    			{
    				rawData[index]=rawData[index+1];
       			}
    			i--;
    			sizeOfArray--;
    			flag = true;
    			occurance++; // Number of times, a number is there in the array list
    		}
    	}
    	if(flag==false)
    	{
    		System.out.println(result);
    	}
    	else 
    	{
    		System.out.println("The Array List after deleting all occurances of "+ value+" is: ");
    		toString();
    	}
    }
    
    public int Occurances() 
    {
    	return occurance;
    }
    
    // method to find the index of a value
    public int indexOf(int value) 
    {
    	boolean flag = false;
    	int result = 0;
    	for(int i=0; i<sizeOfArray; i++ )
    	{
    		if(rawData[i] == value)
    		{
    			result = i;
    			System.out.println("Index of First occurance of element "+value+" is:"+result);
    			System.out.println();
    			flag = true;
    			return result;
    		}
    		else
    		{
    			result = -1;
    		}
    	}
    	if(flag==false)
		{
    		System.out.println("The Element "+value+" is not found in Array list!!");
		}
    	return result;
    }
    
    // method to find the total number of values in array list
    public int size()
    {
    	int count = 0;
    	for(int i=0; i<sizeOfArray; i++)
        {
            //System.out.println("array is1: "+rawData[i]);
            count++;            
        }
        System.out.println("The Total number of values stored in Array list are: "+count);
        System.out.println();
		return count;
    }
    
    // method to find the ssum of all the values in array list
    public int sum()
    {
    	int sum=0;
    	for(int i=0; i<sizeOfArray; i++)
        {
    		sum= sum+rawData[i];
        }
    	System.out.println("Sum of all Numbers in ArrayList: "+sum);
    	System.out.println();
		return sum;	
    }
    
    @Override
    public String toString() 
    {
       	System.out.println("Array List in sorted Manner: ");
    	for (int i = 0; i < sizeOfArray; i++) 
    	{
    		System.out.println("Element at location "+i+ " is:"+ rawData[i]+" ");
    	}
    	System.out.println();
    	return super.toString();
    }
}
