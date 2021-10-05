package exercicios.exercicio02;

public class AppPessoa {
    public static void main(String[] args) {
        
        //Pessoa pessoa = new Pessoa("Daniel", "11 1234-5678");
        Estudante estudante = new Estudante("Gabriel", "11 9876-5432", "Ciência da Computação");
        
        //System.out.println(pessoa);
        System.out.println(estudante);

        Pessoa p = new Estudante("José", "11 1478-5236", "Ciências Contábeis");
        System.out.println(p);

    }

}
