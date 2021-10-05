package exercicios.Exercicio03;

public class Veiculo {
    String modelo, marca;
    double consumo;

    Veiculo (String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    void dadosCarro() {
        System.out.println("Informações do carro: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
    }

    //void consumoCarro() {
    //    System.out.println("Informações de consumo: ");
    //    System.out.println("Consumo: " + this.consumo);
    //}

    double mostrarConsumo() {
        return consumo;
    }
    
}
