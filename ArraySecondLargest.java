package week1.day2;

import java.util.Arrays;

public class ArraySecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data= {3,2,11,4,6,7};
		Arrays.sort(data);
		int indexOfSecondLargest=data.length-2;
		System.out.println(data[indexOfSecondLargest]);//index of second largest
	}

}
