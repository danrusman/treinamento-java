package exercicios.exercicio02;

public class AppAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("T-Rex", "Labrador", 2015, "Fabiano", "(11) 91234-5678");
        Proprietario p = new Proprietario("marcos", "(19) 98765-4321");


        System.out.println(animal1);
        System.out.println(p);
    }
}
