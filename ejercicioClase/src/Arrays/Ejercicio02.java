package Arrays;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*2º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		 * Debes crear una función que reciba como parámetro un valor entero, otro parámetro con el array inicializado 
		 * y otro con la longitud del array. La función se llamará "encuentraValor (int array[], int longitud, int valorBuscado)" 
		 * y debe devolver un valor entero. El valor entero devuelto será -1 si el "valorBuscado" no existe dentro del array, y 
		 * será el índice del primer elemento del array cuyo valor sea igual al "valorBuscado". */
		
		int num[] = new int[150];
		int i = 0;
		
		int valorBuscado;
		
		
		valorBuscado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		
		for (i = 0; i < num.length; i++) {
			num[i] = (int) (Math.round(Math.random()*100));	
			
			if(valorBuscado == num[i]) {
				System.out.println("El indice del valor introducido es: " + i + " y el valor introducido es " + valorBuscado);
			}else {
				//if(){
			}
				System.out.println("-1");
			}
		}

	
	}


