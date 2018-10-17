package Arrays.Bloque01;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar 
		 * entre 0 y 100, dentro de una función. Debes crear una función que reciba el array y su 
		 * longitud "int sumaPares (int array[], int longitud)", que devuelva la suma de los números 
		 * pares contenidos en el array.*/
		
		int num[] = new int[150];
		int i = 0;
		int suma = 0; 
		
		int sumaPares = 0;
		
		for (i = 0; i < num.length; i++) {
			
			num[i] = (int) (Math.round(Math.random()*100)); 
			
			//System.out.println(num[i]);
			if(num[i] % 2 == 0) {
				sumaPares = num[i];
				
				suma = suma + sumaPares; 
				
				
				
			}
			
		}
          System.out.println(suma);

	}

}
