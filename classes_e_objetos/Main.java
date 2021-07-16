package classes_e_objetos;

import java.util.ArrayList;
import java.util.List;

public class Main{
    
    /**
     * Questão #1: Fazer o método funcionar corretamente. 
     * <i>O método deve:</i>
     *  - instanciar dois objetos de {@link Empregado};
     *  - chamar métodos Get/Set dos objetos;
     *  - adicionar os objetos em uma objeto de {@code List};
     *  - iterar na lista para imprimir quanto cada {@link Empregado} ganha.
     * 
     */
    public static void main(String[] args) {
       
        Empregado caixa = new Empregado("Estagiário", 2000.0);
        Empregado supervisor = new Empregado("Supervisor", 300.0);

        caixa.setFuncao("Caixa");
        supervisor.setSalario(3000.0);
        String funcao = supervisor.getFuncao();
        double salario = caixa.getSalario();

        List<Empregado> empregados = new ArrayList<Empregado>();
        empregados.add(caixa);
        empregados.add(supervisor);

        for(Empregado e: empregados)
            System.out.println(e.getFuncao() + " recebe " + e.getSalario());

		System.out.println("Trabalho Concluído!");
    }
}