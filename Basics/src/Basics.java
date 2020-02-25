import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Basics {

	public static void main(String[] args) throws FileNotFoundException
	{
		/*Read in a file*/
		File text = new File("text.txt");		
		Scanner scnr = new Scanner(text);
		
		/*Create a list*/
		List<String> students = new ArrayList<String>();
		
		/*Write content of file into list "students"*/
		while(scnr.hasNextLine()) {
			students.add(scnr.nextLine());
		}
		
		/*Print the list with a for each loop*/
		for(String name: students) 
		{
			System.out.printf("name: %s \n", name);
		}	
		
		/*Close scanner so that it doesn't eat up memory*/
		scnr.close();

	}

}
