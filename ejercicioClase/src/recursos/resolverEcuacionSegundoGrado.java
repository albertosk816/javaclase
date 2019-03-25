package recursos;

import javax.swing.JOptionPane;

public class resolverEcuacionSegundoGrado {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de A: "));
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de B: "));

		int c = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de C: "));
		
		
		int resultado1 = (int) (-b +Math.sqrt((b*b)-(4*(a*c))))/2*a;
		int resultado2 = (int) (-b +Math.sqrt((b*b)-(4*(a*c))))/2*a;
		
		System.out.println("Resultado 1 = " + resultado1 + "/nResultado 2 = " + resultado2);
	}

}
