import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.Collection;
import java.util.LinkedList;

public class Basics {

	public static void main(String[] args) throws FileNotFoundException
	{
		LinkedList<String> names = new LinkedList<String>();
		names.push("Bryan");
		names.push("Sue");
		names.push("Sally");
		
		System.out.println(names.remove());
		System.out.println(names.remove());
		System.out.println(names.remove());
		
	}

}
