import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int maior = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i+1) + "º número:");
            numero = sc.nextInt();
            if(numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior numero informado foi: " + maior);


    }
}
