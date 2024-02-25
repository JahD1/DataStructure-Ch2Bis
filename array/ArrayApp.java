package array;


public class ArrayApp {
	
		static int nElems = 0;//number of items 
		//--------------------------------------------------------------	
				/*Modify the method in Programming Project 2.1 so that
				the item with the highest key is not only returned by the 
				method, but also removed from the array. Call the method 
				removeMax().
				 */
		//--------------------------------------------------------------
		public static void main(String[] args) {
			
			long[] arr;//reference to array
			arr = new long[100];//make array
			
			
			int j;//loop counter
			long searchKey;//key of item to search for
		
		//--------------------------------------------------------------
			arr[0] = 77;//insert 10 items
			arr[1] = 99; 
			arr[2] = 44; 
			arr[3] = 55; 
			arr[4] = 22; 
			arr[5] = 25; 
			arr[6] = 11; 
			arr[7] = 00; 
			arr[8] = 66; 
			arr[9] = 3;
			
			nElems = 10;//now 10 items in array
			
		//--------------------------------------------------------------	
			for(j=0; j<nElems; j++) // display items
				System.out.print(arr[j] + " ");
			System.out.println("");
			
		//--------------------------------------------------------------
			searchKey = 66; //find key with 66
			for(j=0; j<nElems; j++) //for each element
				if(arr[j] == searchKey)// found item?
					break;				// yes, exit loop before end
			if(j == nElems)				// at the end?
				System.out.println("Can’t find " + searchKey);// yes
			else
				System.out.println("Found " + searchKey);	//no
		//--------------------------------------------------------------
			searchKey = 55;// delete item with key 55
			for(j=0; j<nElems; j++) //look for it 
				if(arr[j] == searchKey)
					break;
			for(int k=j; k<nElems-1; k++)//move higher ones down
				arr[k] = arr[k+1];
			nElems--; //decrement size
			
		//--------------------------------------------------------------
			for(j=0; j<nElems; j++) // display items
				System.out.print( arr[j] + " ");
			System.out.println("");
		
			
			System.out.println("max: " + removeMax(arr));
			
			for(j=0; j<nElems; j++) // display items
				System.out.print( arr[j] + " ");
			System.out.println("");

		}//end main()
		
		public static long removeMax(long arr[])
		{
			long max =arr[0];
			int maxIndex=0;
			for(int i =0;i<arr.length;i++)
			{
				if(arr[i]>max) {
					max=arr[i];
					maxIndex = i;
				}
			}
			
			for(int k=maxIndex; k<nElems;k++)
			{
				arr[k]=arr[k+1];
			}
			 
			nElems--;
			
			
			System.out.println("Removed");
			
			return max;
		}
		
		
	}//end Array class

