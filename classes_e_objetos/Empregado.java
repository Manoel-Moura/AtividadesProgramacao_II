package classes_e_objetos;

public class Empregado {
	
	private String funcao;
	private double salario;
	
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getFuncao() {
		return this.funcao;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	
	Empregado(String funcao ,double salario){
		this.funcao = funcao;
		this.salario = salario;
	}
}
