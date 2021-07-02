package Atividade_3;

import java.util.ArrayList;

public class Lista<T> {

	ArrayList<T> listaGenerica = new ArrayList<T>();

	public void adiciona(T x) {
		listaGenerica.add(x);
	}

	public void remove(int x) {
		listaGenerica.remove(x);
	}

	public T verifica(int x) {
		T aux = listaGenerica.get(x);
		return aux;
	}

	public int tamanho() {
		return listaGenerica.size();
	}

}
