package week1.day2;

public class SqrtwithoutMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=4;
		//int num =1;
		int num=8;
		double tmp;
		double sq=num/2;
		if(num<2)
		{ 
			System.out.println(num);
		}
		else
		{
			do
			{
				tmp=sq;
				sq=(tmp+(num/tmp))/2;
			
				
			}while((tmp-sq)!=0);
			int output = (int)sq;
			System.out.println(output);
		}
		

	}

}
