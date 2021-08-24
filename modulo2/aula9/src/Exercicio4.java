import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a tabuada desejada? ");
        int tabuada = sc.nextInt();
        System.out.println("Tabuada do " + tabuada + " é:");
        for(int i = 1; i <= 10; i++){
            System.out.println("" + tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}
