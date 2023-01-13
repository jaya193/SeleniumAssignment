package week1.day2;

import java.util.Arrays;

public class OddoneInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {4,1,2,1,2}; 
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
