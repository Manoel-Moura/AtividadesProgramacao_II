package atividade_2;

public class Aluno {

	private String nome;
	private double nota;

	public void printAluno() {
		System.out.println("Nome: " + getNome() + "\nNota: " + getNota() + "\n\n");
	}

	public String getNome() {
		return this.nome;
	}

	public double getNota() {
		return this.nota;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Aluno(String nome, double nota) {
		setNome(nome);
		setNota(nota);
	}

	public Aluno() {
		setNome("-Aluno novo-");
		setNota(0.0);
	}

}
