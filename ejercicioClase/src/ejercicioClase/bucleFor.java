package ejercicioClase;

import javax.swing.JOptionPane;

public class bucleFor {

	public static void main(String[] args) {
		
	//EJERCICIO 01 
		
		/*
		
		int suma = 0;
		int num = 0;

		
      for (int i = 1; i < 5; i++) {
	      num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de un numero: "));
	     
	     if (num > 10){
	    	 suma = suma + num;
	     }

	     
    }
		
	     		 JOptionPane.showInputDialog(suma);
		
		*/
		
     //EJERCICIO 02
		
	/*	int suma = 0;
		int num = 0;
		int cantidadNumeros;
		
		cantidadNumeros= Integer.parseInt(JOptionPane.showInputDialog("Introduzca cuantos numeros va a pedir: "));
		
      for (int i = 1; i <= cantidadNumeros; i++) {
	      num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de un numero: "));
	     
	     if (num > 10){
	    	 suma = suma + num;
	     }

	     
    }
		
	     		 JOptionPane.showInputDialog(suma);*/
		
		//EJERCICIO 03
		
/*
		int num = 0;
		int cantidadNumeros;
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		
		cantidadNumeros= Integer.parseInt(JOptionPane.showInputDialog("Introduzca cuantos numeros va a pedir: "));
		
      for (int i = 1	; i <= cantidadNumeros; i++) {
	      num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de un numero: "));
	     
	     if (num > 0){
	    	 
	    	 contadorPositivos++;	    	 

	    	 
	    	 }else {
	    		contadorNegativos++;
	    		    	 
	    	 
	     }

	     
    }

	JOptionPane.showMessageDialog(null, "Los numeros positivo son: " + contadorPositivos);
      JOptionPane.showMessageDialog(null, "Los numeros negativos son: " + contadorNegativos);
		 
	     		 
		*/
		


	}

}
