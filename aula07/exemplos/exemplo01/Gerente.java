package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int numFuncionarios;

    public Gerente(String nome, double salario, int numFuncionarios) {
        super(nome, salario);
        this.numFuncionarios = numFuncionarios;
    }

    public Gerente(String nome) {
        super(nome, 0);
    }

    // @ é uma anotação
    // @Override 
    @Override
    public void exibir() {
        System.out.println(getNome() + " - " + getSalario() + " - " + numFuncionarios);
    }

}
