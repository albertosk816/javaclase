package metodosYobjetos;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	
	public static void main(String[] args) {
	    
		int num1 = 0;
		int num2 = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del primer numero: "));
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del segundo numero: "));
		
		
		System.out.println(media(num1, num2));
		

	}

	public static float media(int num1, int num2) {
			
		float media = (num1 + num2)/2;
		return  media;
	}


	

}
