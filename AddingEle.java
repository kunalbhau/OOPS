import java.util.*;

public class AddingEle
{
	public static void main(String args[])
	{
		// First create an empty arraylist
		Collection <Integer> I1 = new ArrayList<Integer>(5);
		
		I1.add(13);
		I1.add(13);
		I1.add(45);
		
		for(Integer n : I1)
		{
			System.out.println("The numbers are :" +n);
			
		}
		// create another arraylist
		Collection <Integer> I2 = new ArrayList<Integer>();
		//now appending all the elements to the list
		
		I2.addAll(I1);
		
		// display the modified arraylist
		System.out.println("The new arraylist is :" +I2);
	}
}
