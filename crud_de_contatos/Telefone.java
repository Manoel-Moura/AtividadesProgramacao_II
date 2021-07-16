package crud_de_contatos;


public class Telefone {
	private byte DDD;
	private String numero;

	public void setDDD(byte DDD) {
		this.DDD = DDD;
	}

	public byte getDDD() {
		return this.DDD;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return this.numero;
	}

	public Telefone(byte DDD, String numero) {
		this.DDD = DDD;
		this.numero = numero;
	}
}
