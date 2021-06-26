package Atividade_2;

public class Vetor {
    Aluno[] alunos;
    int cont = 0;

    Vetor(){
        alunos = new Aluno[10]; 
    }

    public void adicionaAluno(Aluno novoAluno){
        if(cont < this.alunos.length){
            this.alunos[cont] = novoAluno;
            this.cont++;
        }
    }
    
    public  void removeAluno(String nome) {
    	Aluno[] aux = getLista();
    	int i;
    	//System.out.print(aux[0].getNome());
    	for(i = 0; i < aux.length - 1; i++) {
    		if(aux[i] != null && aux[i].getNome().equals(nome)) {
    			aux[i] = aux[i + 1];
        		this.cont--;
    		}
    		if(aux[i] != null && aux[i+1] == null) {
    			aux[i] = null;
    		}
    	}
    	
    }
    
    public  void removeAluno(int numero) {
    	Aluno[] aux = getLista();
    	int i;
    	//System.out.print(aux[0].getNome());
    	for(i = 0; i < aux.length - 1; i++) {
    		if(aux[i] != null) {
    			aux[i] = aux[i + 1];
        		this.cont--;
    		}
    		if(aux[i] != null && aux[i+1] == null) {
    			aux[i] = null;
    		}
    	}
    	
    }

    public Aluno[] getLista(){
        return alunos;
    }

    public void printLista(){
    	Aluno[] aux = getLista();
        for(int i = 0; i < aux.length; i++){
        	if(aux[i] != null) {
        		aux[i].printAluno();
        	}
        }
    }


    
}
