package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "TestLeaf";
		
		char[] charArray = name.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
			
		}
		System.out.println("Check string conatins the word or not");
		if(name.contains("LE"))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not Present");
		}
		
	}

}
