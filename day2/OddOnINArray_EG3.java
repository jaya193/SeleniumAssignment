package week1.day2;

import java.util.Arrays;

public class OddOnINArray_EG3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1}; 
		Arrays.sort(nums);
		//System.out.println(nums);
		for(int i=0;i<nums.length;i++)
		{   int j;
			for(j=0;j<nums.length;j++)
			{
				if(nums[i]==nums[j]&& i!=j)
				{
					//System.out.println(nums[i]);
					break;
			}
			}
				if(j == nums.length)
				{
					System.out.println(nums[i]);
				}	
				
			
			
		}

	}

}
