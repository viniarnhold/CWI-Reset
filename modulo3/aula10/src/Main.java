public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.reagir("Olá");
        c.reagir("Sai cachorro");
        System.out.println("");

        c.reagir(false);
        c.reagir(true);
        System.out.println("");

        c.reagir(17, 30);
    }
}
