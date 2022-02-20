package collectionFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties p = new Properties();
		
		p.setProperty("Browser", "Chrome");
		p.setProperty("Language", "Java");
		p.setProperty("Course", "Java SE");
		
		System.out.println(p);
		
		//to store in external files .txt, .xml
		p.store(new FileOutputStream("G:\\Selenium\\Trainings\\LearningJavaBegineerToMaster\\src\\newfile.txt"), "Laptop");
		
		// to read .txt or .xml
		p.load(new FileInputStream("G:\\\\Selenium\\\\Trainings\\\\LearningJavaBegineerToMaster\\\\src\\\\newfile.txt"));
		System.out.println(p.getProperty("Browser"));
	}
 
}
