package javapractices;

public class Sumofint {

	public static void main(String[] args) {
		String str="5df12fgfggf2";
		int temp=0;
		for(int i=0;i<=str.length();i++)
		{

		char c= str.charAt(i);
		if(Character.isDigit(c))
		{
		temp+=c;
		}
		}
		System.out.println(temp);

	}

}
