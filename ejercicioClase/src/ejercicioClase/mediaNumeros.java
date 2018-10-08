package ejercicioClase;

import javax.swing.JOptionPane;

public class mediaNumeros {

	public static void main(String[] args) {
		
		int cantidadNumeros;
		int num = 0;
		int contadorNegativos = 0, contadorPositivos = 0, media, sumaNumeros = 0;
		
	 cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cuantos numeros va a pedir: "));
	 
	 

     for (int i = 1	; i <= cantidadNumeros; i++) {
     num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de un numero: "));
     sumaNumeros += num;
     
     if (num < 0) {

		 contadorNegativos++;
		 
		 
     }
     else {
    	 contadorPositivos++;
     }
     
    
     
}
     

     media = sumaNumeros / cantidadNumeros;
     
     JOptionPane.showMessageDialog(null, "La media de los numeros introducidos es: " + media);
	
     
     
	
	}
}


