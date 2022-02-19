package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {

	
	static void divide() throws IOException
	{
		
		
		try(FileInputStream fs = new FileInputStream("G:\\Selenium\\Trainings\\LearningJavaBegineerToMaster\\src\\exceptionHandling\\my.txt")
			;Scanner s = new Scanner(fs))
		{
			
			int a = s.nextInt();
			//int b = s.nextInt();
			int c = s.nextInt();
			System.out.println(a/c);
		}	
	}
	public static void main(String[] args) throws IOException {
		try
		{
			divide();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
