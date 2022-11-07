package day7112022;
//Display the Non-repeating character from the given String
public class tononreversechar {
	public static void main(String[]args)
	{
		String nr="racecar";
		for(char i:nr.toCharArray())
		{
			if(nr.indexOf(i)==nr.lastIndexOf(i))
			{
				System.out.println(("The Non Repeating Character is :"+i));
			}
		}
	}

}
