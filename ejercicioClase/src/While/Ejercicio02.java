package While;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {

		int suma = 0, num = -1;
		float contadorNum = 0;
		

		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog(
					"Introduzca numero (0 -> Salir): "));
			suma = suma + num;
			contadorNum++;
		}
		

		JOptionPane.showMessageDialog(null, "La media de los numeros es: " + suma / contadorNum);
		
	}

}
