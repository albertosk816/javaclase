package Arrays.Bloque2;


public class Ejercicio04DesplazamientoDerecha {

	public static void main(String[] args) {
		/*
		 * 4º.- Realiza un ejercicio que inicialice un array de 5 elementos 
		 * enteros al azar entre 0 y 100. Debes conseguir que se desplacen los 
		 * números un lugar a su derecha, de manera que el desplazamiento sea 
		 * circular, si un número sale por la derecha volverá a entrar por la izquierda. 
		 * Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.
		 */

		int array[] = new int [5];
		int aux;
				
		int i = 0;
		
		
		
		
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
			  System.out.println("Mi array principal: " + array[i]);
			 	
		}	
		aux = array[array.length-1];//para acceder al valor de la derecha
		for (i = array[array.length-1]; i > 0; i--) {
				array[i] = array[i-1];
				System.out.println("El array con la posicion cambiada es : " + array[i]);
			}
          
          array[0] = aux;
          

          for ( i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
		
	}

}
