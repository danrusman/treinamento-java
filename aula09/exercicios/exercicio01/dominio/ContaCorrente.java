package exercicios.exercicio01.dominio;

public class ContaCorrente extends Conta {
    // final = contante, valor que não pode ser alterado
    final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo()) { // verifica se tem saldo suficiente
            return super.sacar(valor); // chame o sacar da superclasse
        }
        return false; // não tem saldo suficiente
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public String toString() {
        return "Conta corrente: " + super.toString();
    }

}