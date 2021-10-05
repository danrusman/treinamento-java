package exercicios.exercicio01;

public class Placar {
    private int golsTimeA, golsTimeB;
    private String nomeTimeA, nomeTimeB;
    
    public Placar() {
        this("Time da Casa", "Time Visitante", 0, 0);
    }

    public Placar(String nomeTimeA, String nomeTimeB) {
        this(nomeTimeA, nomeTimeB, 0, 0);
    }

    public Placar(String nomeTimeA, String nomeTimeB, int golsTimeA, int golsTimeB) {
        this.nomeTimeA = nomeTimeA;
        this.nomeTimeB = nomeTimeB;
        this.golsTimeA = golsTimeA;
        this.golsTimeB = golsTimeB;
    }

    public String toString() {
        return nomeTimeA + " " + golsTimeA + " X " + golsTimeB + " " + nomeTimeB;
    }
}
