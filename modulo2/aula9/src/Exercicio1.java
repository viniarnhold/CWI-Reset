import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double nota;
        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = sc.nextDouble();
            if (!(nota >= 0) || !(nota <= 10)) {
                System.out.println("Nota invalida");
            }
        } while(!(nota >= 0) || !(nota <= 10));
        System.out.println("Sua nota foi: " + nota);
        sc.close();
    }
}
