import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora?");
        double valorPorHora = sc.nextDouble();
        System.out.print("Quantas horas você trabalhou no mês?");
        int horasTrabalhadas = sc.nextInt();
        double salario = valorPorHora * horasTrabalhadas;
        System.out.println("Seu salário será de: R$" + salario);
    }
}
