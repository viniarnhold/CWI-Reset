public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();

        Mario mario2 = new Mario("Mario2", 45, 1.50);

        System.out.println("");
        System.out.println("Construtor 1");
        mario.caracteristicas();

        System.out.println("");
        System.out.println("Construtor 2");
        mario2.caracteristicas();

        mario2.superHumanStrength();
        System.out.println("Status após Mario2 utilizar sua Super Força");
        mario2.caracteristicas();

    }
}
