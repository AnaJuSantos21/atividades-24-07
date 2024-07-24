package curso24_07;

import java.util.ArrayList;
import java.util.Arrays;

public class exemplo3 {

	public static void main(String[] args) {
		// Criando um ArrayList de números inteiros
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10); // Adicionando elementos ao ArrayList
		numeros.add(20);
		
		System.out.println("adicionando um valor: " + numeros.get(0)); //Saída:10
		System.out.println("adicionando um valor: " + numeros.get(1)); //Saída:20
		
		numeros.set(1, 25);
		System.out.println("modificando um valor: " + numeros.get(1)); // Saída:25
		
		numeros.remove(0);
		System.out.println("obtendo o tamanho do ArrayList: " +numeros.get(0)); //Saída:1 

	}

}
