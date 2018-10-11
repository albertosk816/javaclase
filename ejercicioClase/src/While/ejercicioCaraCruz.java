package While;

import javax.swing.JOptionPane;



public class ejercicioCaraCruz {

	public static void main(String[] args) {
		int contadorVictoriasHumano = 0;
		int contadorVictoriasPC = 0;
		int numAzar;
		int numIntroducido;
		
	
				  
		do {
            numIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el 0 (para cara) o el 1 (para cruz)"));
            numAzar = (int) (Math.round(Math.random()));
            
		    if(numAzar == numIntroducido) {
		    	contadorVictoriasHumano++;
		    }else
		    	contadorVictoriasPC++;
		    
		} while (contadorVictoriasHumano< 3 && contadorVictoriasPC< 3);
				    
				    
		
		JOptionPane.showMessageDialog(null, "NºVictorias JH : \n" +contadorVictoriasHumano + " \n NºVictorias PC: \n" + contadorVictoriasPC);

	}

}
