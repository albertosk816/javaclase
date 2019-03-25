package Arrays.Bloque2;

public class Ejercicio02OrdenaElementosArray {

	public static void main(String[] args) {
		/*
		 *2º.-Realiza un ejercicio que inicialice dos arrays de 150 elementos enteros al azar entre 0 y 100. 
		 *Debes crear un tercer array, compuesto de la siguiente forma: en los elementos de índice impar del 
		 *tercer array debes copiar los elementos de índice impar del primer array; en los elementos de 
		 *índice par del tercer array debes copiar los elementos de índice par del segundo array. 
		 */
		
		int array1[] = new int[150];
		int array2[] = new int [150];
		int array3[] = new int[150];
		int i = 0, j = 0;
		int j2 = 0;

				
		
		for (i = 0; i < array1.length; i++) {
			array1[i] = (int) Math.round(Math.random()*100);
			if(i % 2 != 0) {
				array3[i] = array1[i];
				System.out.print(array1[i]);
			}
		}
		
		for (j = 0; j < array2.length; j++) {
			array2[j] = (int) Math.round(Math.random()*100);
			if(j % 2 == 0){
			      array3[j] = array2[j];
			      System.out.print("\n" + array2[j]);
			}
		}
			
		for (j2 = 0; j2 < array3.length; j2++) {
						
			System.out.print("\n" + array3[j2]);
		}
		


	}

}
