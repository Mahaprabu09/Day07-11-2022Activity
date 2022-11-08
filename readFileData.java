package day7112022;
import java.io.*;
import java.io.FileReader;
public class readFileData {
	static void checkfiledata()
	{
		try{
			FileReader readfile=new FileReader("D:\\Eclipse path\\Anudip daywise codes\\src\\readfiledata.txt");
			BufferedReader br=new BufferedReader(readfile);
			String line=br.readLine();
			
			if(line.indexOf("Anudip")!=-1){
				System.out.println("Anudip is available");
			}
			else
			{
				System.out.println("Anudip is not available");}
			}catch(IOException e)
		{
				e.printStackTrace();		
		}
	}
	
	public static void main(String[]args)
	{
		checkfiledata();
		
	}
	

}
