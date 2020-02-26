import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Basics {

	public static void main(String[] args) throws FileNotFoundException
	{
		int[][] data = {
				{1, 561, 51, 15},
				{45, 54, 51, 98, 5, 64, 4},
				{78, 98, 5, 8}
				};
//		System.out.println(data.length);
//		System.out.println(data[0].length);
		
		
		for(int i =0; i< data.length; i++) 			
		{	int columns = data[i].length;
			for(int j=0; j < columns; j++)
			{
			System.out.print(data[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
