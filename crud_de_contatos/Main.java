package crud_de_contatos;



import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);

	/**
	 * Base de dados dos objetos de {@link Pessoa}.
	 */
	static ArrayList<Pessoa> alunos = new ArrayList<Pessoa>();

	/**
	 * Questão: Fazer um CRUD de Contatos, utilizando as classes {@link Pessoa} e
	 * {@link Endereco} criadas no pacote 'models'. Você deve fazer os ajustes
	 * necessários par isso. Tente não copiar o exemplo da sala de aula. Mas pode
	 * sim usá-lo como referência.
	 */
	public static void main(String[] args) {
		boolean quiserContinuar = true;
//		Telefone novoTelefone1 = new Telefone((byte) 86, "98147-4561");
//		Telefone novoTelefone2 = new Telefone((byte) 89, "95437-5413");
//		Telefone novoTelefone3 = new Telefone((byte) 81, "98450-2761");
//		Telefone novoTelefone4 = new Telefone((byte) 11, "98234-4823");
//		Pessoa eu = new Pessoa("Bruno", "123.321.456-00", novoTelefone1);
//		alunos.add(eu);
//		eu.addNumero(novoTelefone2);
//		eu.addNumero(novoTelefone3);
//		eu.addNumero(novoTelefone4);
		while (quiserContinuar) {
			imprimirMenu();
			int opcao = coletarOpcao();
			switch (opcao) {
			case 0:
				quiserContinuar = querExecutar();
				break;
			case 1: // adicionar pessoa
				addPessoa();
				break;
			case 2: // remover pessoa
				removePessoa();
				break;
			case 3: // alterar pessoa
				alteraPessoa();
				break;
			case 4: // recuperar pessoa
				recuperaPessoa();
				break;
			case 5: // imprimir lista
				imprimeLista();
				break;
			default:
				System.out.println("Escolha outra opção!");
				break;
			}
		}
		System.out.println("Obrigado por usar!");
		sc.close();
	}

	private static void imprimirMenu() {
		System.out.println("\n================  Menu  ================");
		System.out.println("Adicionar pessoa ------------------- (1)");
		System.out.println("Remover pessoa   ------------------- (2)");
		System.out.println("Alterar pessoa   ------------------- (3)");
		System.out.println("Recuperar pessoa ------------------- (4)");
		System.out.println("Imprimir lista   ------------------- (5)");
		System.out.println("SAIR             ------------------- (0)");
		System.out.println("========================================");
	}

	private static int coletarOpcao() {
		int x = sc.nextInt();
		return x;
	}

	private static boolean querExecutar() {
		return false;
	}

	private static void imprimeLista() {

		if (alunos.isEmpty()) {
			System.err.println("[ERRO] Lista vazia!");
		} else {
			for (Pessoa e : alunos) {
				System.out.println("\nNome: " + e.getNome() + "\nCPF: " + e.getCPF());
				e.listaTelefonica();
			}
		}

	}

	private static void alteraPessoa(int indice) {
		System.out.println("============== " + alunos.get(indice).getNome() + " ==============");
		System.out.println("Alterar nome     ------------------- (1)");
		System.out.println("Alterar CPF      ------------------- (2)");
		System.out.println("CRUD de Numero   ------------------- (3)");
		System.out.println("========================================");
		int aux = sc.nextInt();
		switch (aux) {
		case (1): {
			System.out.print("Novo nome: ");
			String nome = sc.next();
			alunos.get(indice).setNome(nome);
			;
			break;
		}
		case (2): {
			System.out.print("Novo CPF: ");
			String CPF = sc.next();
			alunos.get(indice).setCPF(CPF);
			;
			break;
		}
		case (3): {
			alteraNumero(indice);
			break;
		}
		default: {
			System.err.println("[ERRO] Entrada invalida!");
			break;
		}
		}
	}

	private static void alteraPessoa() {
		System.out.print("Indice da Pessoa: ");
		int aux2 = sc.nextInt();
		// while (true){
		if (alunos.size() < aux2 + 1) {
			System.err.println("[ERRO] Entrada invalida!");
		} else {
			alteraPessoa(aux2);
		}
	}

	private static void addPessoa() {
		System.out.println("================  Menu  ================");
		System.out.println("Adicionar pessoa sem numero -------- (1)");
		System.out.println("Adicionar pessoa com numero -------- (2)");
		System.out.println("========================================");
		byte aux = sc.nextByte();
		if (aux == 1) {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("CPF: ");
			String CPF = sc.next();
			alunos.add(new Pessoa(nome, CPF));
		} else if (aux == 2) {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("CPF: ");
			String CPF = sc.next();
			System.out.print("DDD: ");
			byte DDD = sc.nextByte();
			System.out.print("Numero: ");
			String numero = sc.next();
			Telefone novoTelefone = new Telefone(DDD, numero);
			alunos.add(new Pessoa(nome, CPF, novoTelefone));
		} else {
			System.err.println("[ERRO] Entrada invalida!");
		}
	}

	private static void removePessoa() {
		System.out.print("Indice da Pessoa: ");
		int aux2 = sc.nextInt();
		if (alunos.size() < aux2 + 1) {
			System.err.println("[ERRO] Entrada invalida!");
		} else {
			alunos.remove(aux2);
		}
	}

	private static void recuperaPessoa() {
		System.out.print("Indice da Pessoa: ");
		int aux2 = sc.nextInt();
		if (alunos.size() > aux2) {
			System.out.println("\nNome: " + alunos.get(aux2).getNome() + "\nCPF: " + alunos.get(aux2).getCPF());
			alunos.get(aux2).listaTelefonica();
		} else {
			System.err.println("[ERRO] Entrada invalida!");
		}
	}

	private static void alteraNumero(int indice) {
		System.out.println("================  Menu  ================");
		System.out.println("Adicionar numero ------------------- (1)");
		System.out.println("Apagar numero    ------------------- (2)");
		System.out.println("========================================");
		int aux = sc.nextInt();
		switch (aux) {
		case (1): {
			System.out.print("DDD: ");
			byte DDD = sc.nextByte();
			System.out.print("Numero: ");
			String numero = sc.next();
			Telefone novoTelefone = new Telefone(DDD, numero);
			alunos.get(indice).addNumero(novoTelefone);
			break;
		}
		case (2): {
			System.out.print("Indice do Numero: ");
			int apaga = sc.nextInt();
			if (alunos.get(indice).tamanhoListaTelefone() > apaga) {
				alunos.get(indice).removeNumero(apaga);
			} else {
				System.err.println("[ERRO] Entrada invalida!");
			}
			break;
		}
		default: {
			System.err.println("[ERRO] Entrada invalida!");
			break;
		}

		}
	}

}