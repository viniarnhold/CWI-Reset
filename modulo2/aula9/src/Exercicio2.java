import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("Informe o primeiro número: ");
            num1 = sc.nextInt();
            System.out.println("Informe o segundo número: ");
            num2 = sc.nextInt();

        } while(num2<=num1);

        for (int i = num1 ;i < num2 ; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
