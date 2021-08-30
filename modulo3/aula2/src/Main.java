public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.tampada = false;
        c1.destampar();
        System.out.println(c1);
        System.out.println("");
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 1.0;
        c2.tampada = false;
        c2.tampar();
        System.out.println(c2);
        System.out.println("");
        c2.rabiscar();


    }
}
