package Arrays.Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio03MultiplicaArray {

	public static void main(String[] args) {
		/*
		 * 3º.- Realiza un ejercicio que inicialice un array de 150 elementos 
		 * enteros al azar entre 0 y 100. Debes conseguir multiplicar cada uno 
		 * de los elementos del array por un número determinado, pedido al usuario.
		 */
		
		int array1[] = new int[150];
		int i = 0;
		
		int num = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor para multiplicar nuestra cadena de arrays: "));
		
		for (i = 0; i < array1.length; i++) {
			array1[i] = (int) Math.round(Math.random()*100);
			System.out.println(array1[i] + " -- " + (array1[i]*num));
		}
		
		

	}

}
