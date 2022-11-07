package day7112022;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class readfile {
	public static void main(String[]args)
	{
		String Anudip="D:\\Eclipse path\\Anudip daywise codes\\src\\day7112022\\filereadtest.txt";
		try{
			FileReader fileread=new FileReader(Anudip);
			System.out.println("Yes the Anudip file is available");
		}catch(FileNotFoundException f){
			System.out.println("The file is not available");
			f.printStackTrace();
		}	
	}
}
