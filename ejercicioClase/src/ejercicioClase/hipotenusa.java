package ejercicioClase;

import javax.swing.JOptionPane;

public class hipotenusa {

	public static void main(String[] args) {
		
        float cateto1, cateto2;
        
        float radio;
        
        float radioCircunferencia;
        
        float longitudBase, alturaRectangulo;
        
        float baseTriangulo, alturaTriangulo;
        
        
        String menu = "Menu \n"
                + "1. Cálculo de la hipotenusa de un triángulo.\n"
                + "2. Cálculo de la superficie de una circunferencia.\n"
                + "3. Cálculo del perímetro de una circunferencia.\n"
                + "4. Cálculo del área de un rectángulo.\n"
                + "5. Cálculo del área de un triángulo.\n"
                + "0. Salir de la aplicación.\n\n";
                
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
    	
    
    switch (num) {
    
    case 1:
        cateto1= Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud del cateto 1: "));
        cateto2 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud del cateto 2: "));
    	JOptionPane.showMessageDialog(null , "La longitud de la hipotenusa es : " + Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2))));
        
    	JOptionPane.showInputDialog(menu);
    	
        break;
        
    case 2:
    	radio= Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud del radio : "));
    	
    	JOptionPane.showMessageDialog(null , "La superficie de la circunferencia es: " + Math.PI * (Math.pow(radio, 2)));

    	JOptionPane.showInputDialog(menu);
    	
        break;
    case 3:
    	radioCircunferencia = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud del radio: "));
    	
    	JOptionPane.showMessageDialog(null , "El perimetro de la circunferencia es : " + (2*Math.PI) * radioCircunferencia);
    	
    	JOptionPane.showInputDialog(menu);
    	
        break;
    case 4:
    	 longitudBase= Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud de la base: "));
         alturaRectangulo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la altura del rectangulo: "));
         
         JOptionPane.showMessageDialog(null, "El area del rectangulo es : " + longitudBase * alturaRectangulo);
         
         JOptionPane.showInputDialog(menu);
         
         break;
    case 5:
   	    baseTriangulo= Float.parseFloat(JOptionPane.showInputDialog("Introduzca la longitud de la base: "));
        alturaTriangulo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la altura del triangulo: "));
       
        JOptionPane.showMessageDialog(null, "El area del triangulo es : " + (baseTriangulo * alturaTriangulo) / 2 );

        JOptionPane.showInputDialog(menu);
        
        
    
        
        default:
        	JOptionPane.showMessageDialog(null,  "Opcion incorrecta");
        	
        	JOptionPane.showInputDialog(menu);
        	
    
    }
	
	
	}
	
}
