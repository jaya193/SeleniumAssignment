package week1.day2;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1^2+9^2 =1+81-->82
		8^2+2^2 =64+4=68
		6^2+8^2=36+64-->100
		1^2+0^2+0^2 =1*/
		int num =19;
		int rem =0;
		int sum =0;
		int res= num;
		Boolean flag=false;
		while(sum!=1 && sum!=4)
		{
		while(num!=0)
		{
			sum=0;
			rem =num%10;
			//System.out.println("rem:"+rem);
			sum=sum+(rem*rem);
			//System.out.println("sum:"+sum);
			num=num/10;
			//System.out.println("num:"+num);
		}
		num=sum;
		}
		if(sum==1)
		{
			System.out.println("Happy Number:"+res);	
			flag =true;
			System.out.println(flag);
		}
		else
		{
			System.out.println("Not Happy Number:"+res);
			System.out.println(flag);
			flag=false;
		}
		}
		
		
        
	
	}


