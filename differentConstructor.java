package day7112022;

public class differentConstructor {
	differentConstructor()
	{
		System.out.println("This method has no parameter");
	}
	differentConstructor(int a)
	{
		System.out.println("This is the integer parameter");
	}
	differentConstructor(String s)
	{
		System.out.println("This is the String parameter");
	}
	differentConstructor(int n1,String n2,double n3)
	{
		System.out.println("Whic consist of the multi datatypes");
	}
	
	public static void main(String[] args) {
		differentConstructor dc1=new differentConstructor();
		differentConstructor dc2=new differentConstructor(98);
		differentConstructor dc3=new differentConstructor("Anudip");
		differentConstructor dc4=new differentConstructor(98,"Anudip Foundation",98.9f);
	}

}
