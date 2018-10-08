package ejercicioClase;

import javax.swing.JOptionPane;

public class multiplosNumeros {

	public static void main(String[] args) {
    
		int num;
		int multiplos;
		
		
		/*num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		
		for (int i = 0; i < 100; i++) {
			
			
			multiplos = num * i;
			
			if (multiplos < 100) {
				System.out.println(multiplos);
			}
			
			
		}*/
		
		// Mismo ejercicio pero con el limite añadido
		
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		
		for (int i = 1; i < 100; i++) {
			
			
			multiplos = num * i;
			
			if (multiplos <= 100) {
				System.out.println(multiplos);
			}
			
			
		}
		
		

	}

}
