package ejercicioClase;

import javax.swing.JOptionPane;

public class buscaMayorMenor {

	public static void main(String[] args) {

		int cantidadNumeros;
		int numMayor = 0;
		int numMenor = 0;
		int num;
		
		
		cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros desea introducir: "));
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		
	      numMayor = num;
	      numMenor = num;
		
		for (int i = 1; i < cantidadNumeros; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			
			
			if (num > numMayor) {
				numMayor = num;
				
			}
			
			else {if  (num < numMenor){
				numMenor = num;
			}
			
			}
			
			
			
		}
		
		JOptionPane.showMessageDialog(null,"El numero mayor de los introducidos es: " + numMayor);
		JOptionPane.showMessageDialog(null,"El numero menor de los introducidos es: " + numMenor);
		

	}

}
