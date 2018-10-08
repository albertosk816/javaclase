package ejercicioClase;

import javax.swing.JOptionPane;

public class maquinadevuelvemonedas {

	public static void main(String[] args) {
		
        int precioArticulo, cantidadADar, unidadesEntregadas;
        

        String mensaje= "Introduzca una cantidad: ";  
        String mensaje2= "Introduzca una cantidad a dar: ";
        
         precioArticulo = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
         
         cantidadADar = Integer.parseInt(JOptionPane.showInputDialog(mensaje2));
         
             JOptionPane.showMessageDialog(null, (precioArticulo - cantidadADar));
         
         
        

        

   
	
	
	}
	
}
