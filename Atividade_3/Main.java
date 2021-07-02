package Atividade_3;

import Atividade_2.Aluno;

public class Main {
	public static void main(String args[]) {

		int tam, i = 0;
		Lista listaDeEstudantes = new Lista();
		Aluno aux = new Aluno();

		listaDeEstudantes.adiciona(new Aluno("Manoel", 7.5));
		listaDeEstudantes.adiciona(new Aluno("Xandy", 8.0));
		listaDeEstudantes.adiciona(new Aluno("Gustavo", 3.5));
		listaDeEstudantes.adiciona(new Aluno("Pedro", 1.8));
		listaDeEstudantes.adiciona(new Aluno("Brenne", 10.0));

		listaDeEstudantes.remove(0);

		tam = listaDeEstudantes.tamanho();

		while (i < tam) {
			aux = (Aluno) listaDeEstudantes.verifica(i);
			aux.printAluno();
			i++;
		}

	}

}
