package exemplos.exemplo01;

/**
 * AppFuncionario
 */
public class AppFuncionario {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Daniel", 1000);

        // cria um gerente utilizando o construtor com 3 parâmetros
        Gerente g = new Gerente("Amanda", 2000, 10);

        // cria um gerente utilizando o construtor com 1 parâmetro
        Gerente g2 = new Gerente("João");


        f.exibir();
        g.exibir();
        g2.exibir();
    }
}
