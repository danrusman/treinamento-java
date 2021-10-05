package exercicios.Exercicio03;

public class AppVeiculo {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Gol", "VW", 12.5);

        veiculo.mostrarConsumo();
        System.out.println("Consumo: " + veiculo.mostrarConsumo());
        //v.consumoCarro();
    }

}
