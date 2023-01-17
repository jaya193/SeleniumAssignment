package week1.day2;

public class MajarityNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Eg 1:
		//int [] nums = {3,2,3};
		//Eg 2:
		int [] nums = {2,2,1,1,1,2,2};
		int maxcount =0;
		int index = -1;
		int count =0;
		for(int i=0;i<nums.length;i++)
		{ 
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					//System.out.println("No of Count:"+count+","+nums[i]);
					//break
					count++;
				}}
				if(count>maxcount)
				{
					maxcount=count;
					index =i;
				}
		}
		
		
		
				if(maxcount>(nums.length/2))
				{
					System.out.println("Majaority number in Array :"+nums[index]);
				}
				else
				{
					System.out.println("No majarity element");
				}
			

	}

	}

