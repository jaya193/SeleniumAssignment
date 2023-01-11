package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="A man,a plan,a canal:Panama";
		String rev ="";
		String s1= s.toLowerCase().replaceAll(",","").replaceAll(" ", "").replaceAll(":", "");
		//System.out.println(s1);
		
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
			System.out.println("Not a Palindrome:");
			System.out.println(false);
		}

	}

}
