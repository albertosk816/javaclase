package While;

public class EjercicioMilNumeros {

	public static void main(String[] args) {
		/*Introducir un valor entre 0 a 10mil y calcular la suma, media y desvicacion tipica*/
		
		int suma = 0, media, desviacionTipica;
		int numAleatorio = 0;
		int i;
		
		for ( i = 0; i < 999; i++) {
			numAleatorio = (int) (Math.random()*100);
			

			suma += numAleatorio;
			

		
			
		}
		media = suma / i;
System.out.println(suma + "\n" + i);
	}

}
