package tutorial;

public class Hola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prueba para GIT

		/*
		for (int i = 0; i <= 10; i++)
		{
			System.out.print("i: ");
			System.out.println(i);
			for (int j = 0; j < i; j++)
				{
				System.out.print("	j: ");
				System.out.println(j);
				}
		}

 		*/

		int a = 6;
		int b = 10;
		System.out.println( minimo( a, b ) );

	}
	/*
	 * con public static hacemos una funcion global como en C,
	 * pero en Java no interesa escribir funciones como en C muy a menudo
	 */
	public static int minimo( int x, int y )
	{
		return x < y ? x : y;
	}

}
