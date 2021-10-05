package exercicios.exercicio02;

// uma classe abstrata não pode instanciar (criar) objetos
// ela serve apenas como um modelo para outras classes

public abstract class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + " : " + telefone;
    }

}
