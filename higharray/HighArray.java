package higharray;

public class HighArray {
	
	private long[] a; //ref to array
	private int nElems;// number of data items
	
	 //----------------------------------------------------------- 
	
	public HighArray(int max) //constructor
	{ 
	a = new long[max]; //create the array
	nElems = 0;// no items yet
	} 
	//-----------------------------------------------------------
	public boolean find(long searchKey) //find specified value 
	{
		
		int j;
		
		for(j=0; j<nElems; j++) //for each element 
			if(a[j] == searchKey)//found item?
				break;			//exit loop before end 
			if(j == nElems) 	//gone to the end?
				return false;	//yes, can't find it
			else
				return true;	//no, found it
		
	}// end find()
	//-----------------------------------------------------------
	public void insert(long value) // put element into array 
	{
		
		a[nElems] = value;			//insert it
		nElems++;					//increment size 
		
	}// end insert()
	//-----------------------------------------------------------
	public boolean delete(long value) // delete element from array
	{
		
		int j;
		
		for(j=0; j<nElems; j++) //look for it
			if( value == a[j] )
				break;
		if(j==nElems)			//cant find it 
			return false;
		else {					// found it 

			for(int k=j; k<nElems; k++) //move higher ones down 
				a[k] = a[k+1];
			nElems--;			// decrement size 
			return true;
			
			}
	}// end delete()
	//-----------------------------------------------------------
	public void display() //display array contents 
	{
		
		for(int j=0; j<nElems; j++)//for each element 
			System.out.print(a[j] + " "); //display it 
		System.out.println("");
		
	}
	//-----------------------------------------------------------
	/*To the HighArray class in the highArray.java program (Listing 2.3), 
	add a method called getMax() that returns the value of the 
	highest key in the array, or –1 if the array is empty. Add some 
	code in main() to exercise this method. You can assume all the 
	keys are positive numbers. */
	//-----------------------------------------------------------
	public long getMax()
	{
		if(nElems==0)
			return -1;
		
		long max = a[0];
		for(int j=1; j<nElems;j++)
		{
			if(a[j]> max)
				max = a[j];
		}
		return max;
					
	}
}// end HighArray class