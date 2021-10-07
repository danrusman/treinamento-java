package exemplos.exemplo03;

public class Caminhao implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Ligando o caminhão... ");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o caminhão... ");

    }
}
