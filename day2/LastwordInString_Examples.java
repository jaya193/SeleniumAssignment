package week1.day2;

public class LastwordInString_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example 1:");
		String s="Hello World";
		String[] word =s.split(" ");
		String lastword = word[word.length-1];	
		System.out.println("The Last word is "+"\"" +lastword+"\""+" with length "+lastword.length());
		
		System.out.println("Example 2:");
		String s1="fly me  to  the moon";
		String repword =s1.replaceAll(" ", ",");
		String[] word1 =repword.split(",");
		String lastword1 = word1[word1.length-1];	
		System.out.println("The Last word is "+"\"" +lastword1+"\""+" with length "+lastword1.length());
		
		System.out.println("Example 3:");
		String s2="luffy is still joyboy";
		String repword2 =s2.replaceAll(" ", ",");
		String[] word2 =repword2.split(",");
		String lastword2 = word2[word2.length-1];	
		System.out.println("The Last word is "+"\"" +lastword2+"\""+" with length "+lastword2.length());

	}

	
}
