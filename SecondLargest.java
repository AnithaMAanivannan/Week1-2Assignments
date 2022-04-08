package week1.day1;

import java.util.Arrays;

public class SecondLargest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,5,87,12,56};
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
	}

}
