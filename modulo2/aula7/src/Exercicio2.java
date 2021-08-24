import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double nota1 = sc.nextInt();
        System.out.print("Segunda nota: ");
        double nota2 = sc.nextInt();
        System.out.print("Terceira nota: ");
        double nota3 = sc.nextInt();
        System.out.print("Quarta nota: ");
        double nota4 = sc.nextInt();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média foi de: " + media);

        sc.close();
    }
}
