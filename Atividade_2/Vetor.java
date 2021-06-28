package Atividade_2;

public class Vetor {
	Aluno[] alunos;
	int cont = 0;

	Vetor() {
		alunos = new Aluno[10];
	}

	public void adicionaAluno(Aluno novoAluno) {
		if (cont < this.alunos.length) {
			this.alunos[cont] = novoAluno;
			this.cont++;
		} else {
			System.err.print("[ERRO] Lista Cheia");
		}
	}


	public void busca(String nome) {
		Aluno[] aux = getLista();
		int teste = 0;
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i].getNome().equals(nome)) {
				aux[i].printAluno();
				teste++;
			}
		}
		if (teste == 0) {
			System.err.println("[ERRO] Aluno não encontrado.");
		}
	}

	public void removeAluno(String nome) {
		Aluno[] aux = getLista();
		int i;
		// System.out.print(aux[0].getNome());
		for (i = 0; i < aux.length - 1; i++) {
			if (aux[i] != null && aux[i].getNome().equals(nome)) {
				aux[i] = aux[i + 1];
			}
			if (aux[i] != null && aux[i + 1] == null) {
				aux[i] = null;
				this.cont--;

			}
		}

	}

	public void removeAluno(int numero) {
		Aluno[] aux = getLista();
		int i;
		for (i = numero; i < aux.length - 1; i++) {
			if (aux[i] != null) {
				aux[i] = aux[i + 1];
			}
			if (aux[i] != null && aux[i + 1] == null) {
				aux[i] = null;
				this.cont--;
			}
		}

	}

	public Aluno[] getLista() {
		return alunos;
	}

	public void printLista() {
		Aluno[] aux = getLista();
		if (aux[0] == null) {

			System.err.println("Lista vazia.");

		} else {

			for (int i = 0; i < aux.length; i++) {
				if (aux[i] != null) {
					aux[i].printAluno();
				}
			}
		}
	}

	public int numeroDeAlunos() {
		Aluno[] aux = getLista();
		int cont = 0;
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null) {
				cont++;
			}
		}
		return cont;
	}

}
