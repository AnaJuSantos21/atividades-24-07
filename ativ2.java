package curso24_07;

import java.util.ArrayList;
import java.util.Random;

public class ativ2 {

	public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			int numeroAleatorio = random.nextInt(100); 
			numeros.add(numeroAleatorio);		
			
		}
		
		System.out.println("Lista: " + numeros);
		
		for (Integer numero : numeros) {
            System.out.println(numero * 2);
        }
    }




	}


