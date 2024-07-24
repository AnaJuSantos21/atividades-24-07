package curso24_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ativ1 {

	public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			int numeroAleatorio = random.nextInt(100); 
			numeros.add(numeroAleatorio);		
			
		}
		
		System.out.println("Lista: " + numeros);
		
		numeros.remove(4);
		System.out.println("Lista: " + numeros);

	}

}
