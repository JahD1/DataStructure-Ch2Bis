package higharray;

public class HighArrayApp {
	
	public static void main(String[] args) {
		
		int maxSize =100;
		HighArray arr;
		arr = new HighArray(maxSize);
		
		arr.insert(77); //insert 10 items
		arr.insert(99); 
		arr.insert(44); 
		arr.insert(55); 
		arr.insert(22);
		arr.insert(88); 
		arr.insert(11); 
		arr.insert(00); 
		arr.insert(66); 
		arr.insert(33);
		
		System.out.println("The maximum value in the array is: "+ arr.getMax());
		
		arr.display(); //display items 
		
		int searchKey = 35;// search for item
		
		if( arr.find(searchKey)) 
			System.out.println("Found " + searchKey); 
		else
				System.out.println("Can’t find " + searchKey);
		
		arr.delete(00);// delete 3 items 
		arr.delete(55);
		arr.delete(99);
		
		arr.display();// display again
		
		System.out.println("The maximum value in the array is: "+ arr.getMax());
		
		arr.insert(101);
		System.out.println("The maximum value in the array is: "+ arr.getMax());
		
		
		
		/*The removeMax() method in Programming Project 2.2 suggests a way to sort the contents of 
		 * an array by key value. Implement a sorting scheme that does not require modifying the 
		 * HighArray class, but only the code in main(). You’ll need a second array, which will
		 *  end up inversely sorted. 
		 * (This scheme is a rather crude variant of the selection sort in Chapter 3, “Simple Sorting.”)*/
		
		/* 1. use the concept of the removeMax method in the array class to sort the array
		 * 2. dont change the HighArray Class 
		 * 3. you need a second array  
		 * 
		 * 
		 * 
		 * SOLUTION:
		 * 
		 * What we have:
		 * 1. a getMax() function in HighArray
		 * 2.we have a delete 
		 * 3. we have insert
		 * 
		 * What we need:
		 * 1. get the max 
		 * 2 delete the max, we need a way to store the max 
		 * 3. an array 
		 * 4.to store the values in the new array
		 * 5. display the new array 
		 * 
		 * Algorithm:
		 * 1. create new array
		 * 2. use a for loop to go through new array 
		 * 3. 
		 * */
		
		
		HighArray sortedArray = new HighArray(maxSize);
		
		
		for(int i =0; i<maxSize;i++)
		{
			long max = arr.getMax();
			
			if(max == -1)
				break;
			
			sortedArray.insert(max);
			arr.delete(max);	
		}
		
		arr.display();
		sortedArray.display();
		
	}// end main()

}// end HighArrayApp
