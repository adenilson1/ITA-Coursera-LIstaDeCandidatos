import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Candidato> lista = new ArrayList<>();

		lista.add(new Candidato(80, true, 30));
		lista.add(new Candidato(80, false, 25));
		lista.add(new Candidato(80, false, 28));
		lista.add(new Candidato(90, false, 20));
		System.out.println("RESULTADO");
		Collections.sort(lista);

		for (Candidato candidato : lista) {
			System.out.println(candidato);
		}
		
		// ORDENANDO POR IDADE
		System.out.println("COmprando por idade");
		lista.sort(Comparator.comparing(Candidato::getIdade));
		for (Candidato candidato : lista) {
			System.out.println(candidato);
		}

	}

}
