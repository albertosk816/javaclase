package While;

import javax.swing.JOptionPane;

public class juegoAdivinaNum {

	public static void main(String[] args) {
		int numPensado = (int) (Math.random()* 100);	
		int tirada;
		
		
		do {
		     tirada = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero de 0-100"));
		     
		     if (tirada > numPensado) {
		    	 JOptionPane.showMessageDialog(null, "El numero introducido es inferior a " + tirada);
		     }else {
		    	 if(tirada < numPensado){
		     
		    	 JOptionPane.showMessageDialog(null, "El numero pensado es superior a " + tirada);
		     }else
		    	 JOptionPane.showMessageDialog(null, "¡¡¡ENHORABUENA EL" + numPensado + " ES EL CORRECTO!!!");
		     
		   }
		} while (tirada != numPensado);
		
		
	}

}
