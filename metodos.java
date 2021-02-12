package tutorial;

public class metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 65;
		int c = 154;
		
		System.out.println( minimo( a, b, c ) );
		
	}

	/*
	 * la sobrecarga de metodos en Java esta permitida si cambian los argumentos
	 * del metodo
	 */
	public static int minimo ( int x, int y, int z )
	{
		return x < y ? x<z ? x : z : y<z ? y : z;
	}
	
	public static int minimo ( int x, int y )
	{
		return x < y ? x : y;
	}
	
	
}
