package ejercicioClase;

import javax.swing.JOptionPane;

public class Ejercicio2Bloque3 {

	public static void main(String[] args) {
		float num1, num2;
		String mensaje = ("");
		
		String menu = "Menu \n"
				+ "1.- suma de dos numeros\n"
				+ "2.- resta de dos numeros\n"
				+ "3.- multiplicacion de dos numeros\n"
				+ "4.- division de dos numeros\n"
				+ "5.- modulo de la division\n"
				+ "6.- potencia de dos numeros\n"
				+ "7.- raiz de un numero\n";
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
			num1=Integer.parseInt(JOptionPane.showInputDialog("introduzca un valor: "));
			num2=Integer.parseInt(JOptionPane.showInputDialog("introduzca un segundo valor : "));
			

		switch (num) {
		
		case 1:

			mensaje = ("Resultado = " + (num1 + num2));
		
			
			break;
			
		case 2:
			
			mensaje = ("Resultado = " + (num1 - num2));

	
			
			break;
			
		case 3:

			mensaje = ("Resultado = " + (num1 * num2));
		     
			
			break;
			
		case 4:
			
			mensaje = ("Resultado = " + (num1 / num2));

			
			break;
			
		case 5:

			mensaje = ("Resultado = " + (num1 % num2));

			
			break;
			
		case 6:

			mensaje = ("Resultado = " + (Math.pow(num1, num2)));

			
			break;
			
		case 7:

			mensaje = ("Resultado = " + (Math.sqrt(num1)));

			
			break;
			
			default:
				JOptionPane.showInputDialog("El valor introducido no es correcto");
			
			
		
		}
		
		JOptionPane.showMessageDialog(null, mensaje);
		

	}

}
