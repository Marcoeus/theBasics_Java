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
		LinkedList<String> names = new LinkedList<String>();
		names.push("Bryan");
		names.push("Sue");
		names.push("Sally");
		names.add(2, "Susan");
		
		ListIterator<String> iter = names.listIterator();
		/*Check if there's an element in list.
		 * if so print actual element. This here prints the normal list 
		 * but adds Marco before each entry. The new list is printed below. */
		while(iter.hasNext()) {
			iter.add("Marco");
			System.out.println(iter.next());
		}
		System.out.println("---------------------");
		/*the forEach loop cannot modify the collection. That's 
		 * why iterators are used. This loop creates an iterator implicitly.*/
		for(String s: names) {
			System.out.println(s);
		}
	}

}
