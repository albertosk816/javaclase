package Arrays.Bloque01;

public class Ejercicio05SumaIndiceImpar {

	public static void main(String[] args) {
		int num[] = new int[150];
		int i = 0;
		int suma = 0; 
		
		int sumaImpares = 0;
		
		for (i = 0; i < num.length; i++) {
			
			num[i] = (int) (Math.round(Math.random()*100)); 
			
			//System.out.println(num[i]);
			if(i % 2 != 0) {
				sumaImpares = num[i];
				
				suma = suma + sumaImpares; 
				
			
				
				
			}
			
		}
          System.out.println(suma);


	}

}
