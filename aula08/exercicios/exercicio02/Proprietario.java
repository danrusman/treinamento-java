package exercicios.exercicio02;

public class Proprietario {
    private String nome, telefone;
    private Animal animal;

    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String toString() {
        return "Proprietário: " + nome + " - " + telefone;
    }

}
