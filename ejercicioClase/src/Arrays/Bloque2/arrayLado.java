package Arrays.Bloque2;

public class arrayLado {

	public static void main(String[] args) {
		int array[] = new int [5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*100);
			
			System.out.println(array[i]);
		}

	}

}
