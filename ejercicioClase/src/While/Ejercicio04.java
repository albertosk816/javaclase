package While;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		int numMenor = 0;
		int num;
		
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		numMenor = num;
		
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			
			if (num < numMenor && num != 0) {
				numMenor = num;
			}
			
				
			
		}
		
		JOptionPane.showMessageDialog(null, "El numero mayor de los introducidos es: " + numMenor);

	}

}
