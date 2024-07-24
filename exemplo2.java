package curso24_07;

import java.util.ArrayList;
import java.util.Arrays;

public class exemplo2 {

	public static void main(String[] args) {
		String[] disciplinas = {"matemática", "filosofia", "história", "física"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("geografia");
		novaLista.add("língua inglesa");
		novaLista.add("arte");
		
		for (String i: novaLista) {
			System.out.println("disciplina: " + i);
		}
	}

}
