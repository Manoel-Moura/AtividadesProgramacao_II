package crud_de_contatos;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
	private String nome;
	private String CPF;
	private List<Telefone> telefones;

	static Scanner sc = new Scanner(System.in);

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getCPF() {
		return this.CPF;
	}

	public void addNumero(Telefone novo) {
		this.telefones.add(novo);
	}

	public void removeNumero(int indice) {
		this.telefones.remove(indice);
	}

	public int tamanhoListaTelefone() {
		return telefones.size();
	}

	public void listaTelefonica() {
		System.out.println("\n	Lista de telefones: ");
		if (tamanhoListaTelefone() <= 0) {
			System.out.println("	Lista vazia! ");
		} else {
			for (Telefone e : telefones) {
				System.out.println("	(" + e.getDDD() + ") " + e.getNumero());
			}
		}
	}

	public Pessoa(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
		telefones = new ArrayList<Telefone>();
	}

	public Pessoa(String nome, String CPF, Telefone novo) {
		this.nome = nome;
		this.CPF = CPF;
		telefones = new ArrayList<Telefone>();
		this.telefones.add(novo);
	}

}
