package While;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int numMayor = 0;
		int num;
		
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		numMayor = num;
		
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			
			if (num > numMayor) {
				numMayor=num;
			}
			
				
			
		}
		
		JOptionPane.showMessageDialog(null, "El numero mayor de los introducidos es: " + numMayor);
		
	}

}
