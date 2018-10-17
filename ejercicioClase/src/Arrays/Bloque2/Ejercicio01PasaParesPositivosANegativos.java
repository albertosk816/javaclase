package Arrays.Bloque2;

public class Ejercicio01PasaParesPositivosANegativos {

	public static void main(String[] args) {
		int num [] = new int [150];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) Math.round(Math.random()*200 -100);
			System.out.println(num[i]);
			
			if(num[i] % 2 == 0){
				System.out.println(num[i] - (num[i] + num[i]));
			}
			else
				if(num[i] % 2 == 0 && num[i] < 0){
				System.out.println(num[i] + (num[i] - num[i]));
						
			}else
				System.out.println(num[i]);
			
				
		}

	}

}
