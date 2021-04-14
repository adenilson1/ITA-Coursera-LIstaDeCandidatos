
public class Candidato implements Comparable<Candidato> {
	private int nota;
	private boolean deficiente;
	private int idade;

	public Candidato(int nota, boolean deficiente, int idade) {
		this.nota = nota;
		this.deficiente = deficiente;
		this.idade = idade;
	}

	public int getNota() {
		return nota;
	}

	public int getIdade() {
		return idade;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	@Override
	public int compareTo(Candidato outro) {
		if (nota == outro.getNota()) {
			if (deficiente == outro.isDeficiente()) {
				return idade - outro.getIdade();
			} else {
				if (deficiente)
					return 1;
				else
					return -1;
			}

		} else {
			return nota - outro.getNota();
		}
	}

	@Override
	public String toString() {

		return "Nota do candidato:" + nota + "; " + "Deficiente:" + deficiente + "; " + "Idade:" + idade;
	}

}
