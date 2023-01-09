package week1.day2;

import java.util.Arrays;

public class MinMax_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = {22,5,45,236,189,2};
		int len =n.length;
		//sort in ascending order
		Arrays.sort(n);
		System.out.println("Min "+n[0]);
		System.out.println("Max "+n[len-1]);
	}

}
