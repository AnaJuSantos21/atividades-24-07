package curso24_07;

import java.util.ArrayList;
import java.util.Random;

import java.util.ArrayList;

public class exemplo4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt(100); 
			numeros.add(numeroAleatorio);
		}
		
		for (int numero : numeros) {
			System.out.println(numero);
		}

	}

}
