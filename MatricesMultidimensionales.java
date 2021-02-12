package tutorial;

public class MatricesMultidimensionales {

	public static void printMatrix( int[][] m )
	{
//		for ( int i = 0; i < m.length; i++ ) {
//			if ( m[i] == null)
//				System.out.println( "null" );
//			else
//			{
//				for ( int j = 0; j < m[i].length; j++)
//					System.out.print( m[i][j] + " " );
//				System.out.println();
//			}
//		}
		
//		System.out.println();
		
		for ( int[] var : m )
		{
			for ( int var1: var)
				System.out.print(var1 + " ");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = { {1, 2}, {3, 4}, {5, 6}, {5, 6, 4} };
		System.out.println( "a: " ); printMatrix(a);
		
	}

}
