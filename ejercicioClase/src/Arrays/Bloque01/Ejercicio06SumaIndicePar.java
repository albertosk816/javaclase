package Arrays.Bloque01;

public class Ejercicio06SumaIndicePar {

	public static void main(String[] args) {
		int num[] = new int[150];
		int i = 0;
		int suma = 0; 
		
		int sumaPares = 0;
		
		for (i = 0; i < num.length; i++) {
			
			num[i] = (int) (Math.round(Math.random()*100)); 
			
			//System.out.println(num[i]);
			if(i % 2 == 0) {
				sumaPares = num[i];
				
				suma = suma + sumaPares; 
				
			
				
				
			}
			
		}
          System.out.println(suma);

	}

}
