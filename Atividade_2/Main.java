package Atividade_2;

public class Main {

    public static void main (String[] args) {

        Vetor listaDeAlunos = new Vetor();
        
        Aluno a1 = new Aluno("Manoel", 7.0);
        Aluno a2 = new Aluno("Brenne", 8.0);
        Aluno a3 = new Aluno("Alexandre", 9.5);


        listaDeAlunos.adicionaAluno(a1);
        listaDeAlunos.adicionaAluno(a2);
        listaDeAlunos.adicionaAluno(a3);
        //listaDeAlunos.getLista();
        
        listaDeAlunos.printLista();
        
        listaDeAlunos.removeAluno("Brenne");
        
        listaDeAlunos.printLista();
        
        listaDeAlunos.removeAluno(0);
        
        listaDeAlunos.printLista();

        	
        
        //System.out.println();
    }
}

