package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {
    public static void main(String[] args) {
        linha();
        System.out.println("Meu programa v.1");
        linha(); // chamada de método
        System.out.println("Opções: ");
        int tamanho = "Opções".length(); // Quantas letras tem uma frase
        linha2(tamanho);
        linha2(20);

        linha3(10, '*');

    }

    static void linha () { // void = não tem retorno
        System.out.println("----------------");
    }

    static void linha2(int tamanho) { // tamanho é um parâmetro
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    static void linha3(int tamanho, char letra) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(letra);
        }
        System.out.println();
    }

}
