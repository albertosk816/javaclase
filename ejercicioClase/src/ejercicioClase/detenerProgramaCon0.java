package ejercicioClase;

import javax.swing.JOptionPane;

public class detenerProgramaCon0 {

	public static void main(String[] args) {

	/*	int num;
		int contadorNum = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		for (int i = 0; num != 0 ; i++) {
			contadorNum += num;
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			
		
			}*/
		
		float media = 0;
		float num = 0;
		float contadorNum = 0;
		float i = 0;

		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		for (i = 0; num != 0 ; i++) {
			
			contadorNum += num;
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
					
			
		}
				
						JOptionPane.showMessageDialog(null, "La media de los numeros es: " + contadorNum / i);

	}

}
