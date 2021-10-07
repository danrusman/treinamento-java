package exemplos.exemplo03;

public class Carro implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Ligando o carro... ");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o carro... ");

    }
}
