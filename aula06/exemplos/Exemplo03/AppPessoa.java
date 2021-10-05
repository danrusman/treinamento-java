package exemplos.Exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Daniel", 23);
        Pessoa p2 = new Pessoa("Test", 999);


        //p.nome = "Daniel";
        //p.idade = 23;
        p.apresentar();

        //p2.nome = "Test";
        //p2.idade = 999;
        p2.apresentar();

    }
}
