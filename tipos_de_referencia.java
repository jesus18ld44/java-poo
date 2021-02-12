package tutorial;

public class tipos_de_referencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Jesus Arevalo";
		int len = nombre.length();
		int spaceIndex = 0;
		char[] charTemp = new char[len];
		
		/*
		 * con bucle for pasamos a Array la cadena
		 */
		for (int i = 0; i < len; i++)
		{
			charTemp[i] = nombre.charAt(i);
			if (charTemp[i] == ' ' )
				spaceIndex = i;
		}
		
		System.out.println( "Nombre: " + nombre.substring( 0, spaceIndex ));
		System.out.println( "Apellido: " + nombre.substring( spaceIndex+1, len ) );
		
	}

}
