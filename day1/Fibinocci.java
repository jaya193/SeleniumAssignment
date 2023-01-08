package week1.day1;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=1;i<12;i++)
		{
			sum= firstNum+secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);	
			
		}

	}

}
