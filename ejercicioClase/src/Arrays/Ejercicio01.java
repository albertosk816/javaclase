package Arrays;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num[] = new int[100];
		int limiteMaximo;
		int limiteMinimo;
		int i = 0;
		int diferencia;
		
	
		limiteMaximo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor del limite maximo: "));
		limiteMinimo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor del limite minimo: "));
		
		diferencia = limiteMaximo - limiteMinimo;
		
		for (i = 0; i < num.length; i++) {
			
			num [i]= (int) ((Math.round(Math.random() * diferencia + limiteMinimo)));
			//num [i]= (int) ((Math.round(Math.random()* 100 + limiteMinimo)));
			//if(num [i] <= limiteMaximo && num[i] >= limiteMinimo) {
		
				System.out.println(num[i]);
		


			}
		}
				

	}
		

