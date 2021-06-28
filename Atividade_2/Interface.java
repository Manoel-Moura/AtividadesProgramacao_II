package Atividade_2;

import java.util.Scanner;

public class Interface {

	public String nome;
	public Double nota;

	public void menu() {
		System.out.println("================  Menu  ================");
		System.out.println("Lista de Alunos	 ------------------- (1)"); // ok
		System.out.println("Lista para teste ------------------- (2)"); // ok
		System.out.println("Adicionar        ------------------- (3)"); // com bug
		System.out.println("Remover          ------------------  (4)"); // com bug
		System.out.println("Buscar	         ------------------- (5)"); // ok
		System.out.println("SAIR             ------------------- (0)"); // ok
		System.out.println("========================================");

	}

	public void interfac(Vetor listaDeAlunos) {
		int i = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			menu();
			i = teclado.nextInt();

			switch (i) {
			case (1): {
				listaDeAlunos.printLista();
				break;
			}
			case (2): {
				int numeroDeAlunos = listaDeAlunos.numeroDeAlunos();
				int numAluno = 0;
				while (numeroDeAlunos < 10) {
					addAluno(listaDeAlunos, numAluno);
					numAluno++;
					numeroDeAlunos = listaDeAlunos.numeroDeAlunos();
					//listaDeAlunos.setCont(numeroDeAlunos);
				}
				break;
			}
			case (3): {
				Aluno novo = new Aluno();
				System.out.print("Nome: ");
				this.nome = teclado.next();
				System.out.print("Nota: ");
				this.nota = teclado.nextDouble();
				novo.setNome(this.nome);
				novo.setNota(this.nota);
				listaDeAlunos.adicionaAluno(novo);
				break;
			}
			case (4): {
				System.out.print("Numero: ");
				int numero = teclado.nextInt();
				listaDeAlunos.removeAluno(numero);
				break;
			}
			case(5): {
				System.out.print("Numero: ");
				//this.nome = teclado.next();
				int numero = teclado.nextInt();
				listaDeAlunos.buscaInt(numero);
			}

			}

		} while (i != 0);
	}

	private void addAluno(Vetor listaDeAlunos, int numAluno) {
		switch (numAluno) {
		case (0): {
			Aluno a1 = new Aluno("Manoel", 7.0);
			listaDeAlunos.adicionaAluno(a1);
			break;
		}
		case (1): {
			Aluno a2 = new Aluno("Brenne", 8.0);
			listaDeAlunos.adicionaAluno(a2);
			break;
		}
		case (2): {
			Aluno a3 = new Aluno("Alexandre", 9.5);
			listaDeAlunos.adicionaAluno(a3);
			break;
		}
		case (3): {
			Aluno a4 = new Aluno("Mariana", 10.0);
			listaDeAlunos.adicionaAluno(a4);
			break;
		}
		case (4): {
			Aluno a5 = new Aluno("Claudia", 2.30);
			listaDeAlunos.adicionaAluno(a5);
			break;
		}
		case (5): {
			Aluno a6 = new Aluno("Artur", 10.0);
			listaDeAlunos.adicionaAluno(a6);
			break;
		}
		case (6): {
			Aluno a7 = new Aluno("Bruno", 4.0);
			listaDeAlunos.adicionaAluno(a7);
			break;
		}
		case (7): {
			Aluno a8 = new Aluno("Neyde", 1.0);
			listaDeAlunos.adicionaAluno(a8);
			break;
		}
		case (8): {
			Aluno a9 = new Aluno("Junior", 9.5);
			listaDeAlunos.adicionaAluno(a9);
			break;
		}
		case (9): {
			Aluno a10 = new Aluno("Alex", 3.0);
			listaDeAlunos.adicionaAluno(a10);
			break;
		}
		}

	}
}
