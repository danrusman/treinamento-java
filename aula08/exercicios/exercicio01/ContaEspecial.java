package exercicios.exercicio01;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() + limite >= valor) {
            return super.sacar(valor);
        }
        return false; // não tem saldo suficiente
    }

    @Override
    public String toString() {
        return "Conta especial: " + super.toString() + " limite: " + limite;
    }
}