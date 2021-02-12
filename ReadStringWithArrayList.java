package tutorial;

import java.util.Scanner;
import java.util.ArrayList;

public class ReadStringWithArrayList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> array = getStrings();
		for( int i = 0; i < array.size(); i++)
			System.out.println( array.get( i ) );
		
	}

	public static ArrayList<String> getStrings()
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		
		System.out.println("Enter any number of strings, one per line");
		
		while (in.hasNextLine())
		{
			String oneLine = in.nextLine();
			if (oneLine.equals(""))
				break;
			
			array.add(oneLine);
			System.out.println("Metodo add. " + "Longitud: " + array.size() );
		}
		
		System.out.println("Done reading");
		return array;
	}
	
}
