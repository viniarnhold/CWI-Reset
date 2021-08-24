import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int numero2 = sc.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("Resultado da soma: " + resultado);
    }
}
