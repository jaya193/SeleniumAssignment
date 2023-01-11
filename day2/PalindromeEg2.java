package week1.day2;

public class PalindromeEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="race a car";
		String rev ="";
		String s1= s.toLowerCase().replaceAll(" ","");
		System.out.println("Rev string:"+s1);
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev))
		{
			System.out.println("Palindrome:"+rev);
			System.out.println(true);
		}
		else
		{
			System.out.println("Not a Palindrome:"+rev);
			System.out.println(false);
		}

	}

}
