package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		boolean isPrime =false;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				isPrime= true;
				break;		  
			}
		}
		if(!isPrime)
			{
				System.out.println(n +" is Prime Number");
			}
		else
		{
			System.out.println(n +" is not Prime Number");
		}
		}
	

	}


