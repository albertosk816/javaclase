package metodosYobjetos;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
		public static int numMax = 0;
		public static int numMinimo = 0;
		
	public static void main(String[] args) {
		

		
		numMax = Integer.parseInt(JOptionPane.showInputDialog("Introuce el valor del maximo: "));
		numMinimo = Integer.parseInt(JOptionPane.showInputDialog("Introuce el valor del minimo: "));
		
		//System.out.println(pideNumeros());
	}
	
	public static void pideNumeros() {
				
		int num1 = 0;
		int num2 = 0;
		
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del primer numero: "));

		num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del segundo numero: "));
		
		
	}

}
