package Arrays.Bloque01;

public class Ejercicio01CambiarOrden {

	public static void main(String[] args) {

		int num[] =  new int[150];
		int i = 0;
		int j = 0;
		
		for (i = 0; i < num.length; i++) {
			num[i] = (int) Math.round(i);
			System.out.println(num[i]);
			
			if(num[i] == 149){
				num[i] = num[j];
			
			for (j = 149; j < num.length; j--) {
				num[i] = num[j];
					System.out.println(num[j]);
				
				
				
			}
			}
		}


	}

}
