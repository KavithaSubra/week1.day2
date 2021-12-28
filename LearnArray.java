package week1.day2;

import java.util.Arrays;

public class LearnArray {
	/* Index starts with 0
	 *  length - to find the no. of data in the array
	 *  array[index]-
	 *  index of last data = length-1
	 *  Arrays.sort(arrayName)-> to sort the data is asc order
	 *  size of array - Declared at the creation of array
	 *  Size of the array is fixed; we can't change the size during runtime;
	*/
public static void main(String[] args) {
	//int[] - int Array
	//String[] - String array
	//data saved with indices
	//int[] nums = {10,20,30,40,50};
	
	int[] nums = new int[3];
	nums[0]=100;
	nums[1]=20;
	nums[2]=50;
	//nums[3]=85;
	
	//System.out.println(nums.length);
	//System.out.println(nums[2]);
	//System.out.println(nums[4]);
	//to sort arrays
	
	Arrays.sort(nums);
	
	for(int i=0; i<nums.length; i++)
		System.out.println(nums[i]);
}
}
