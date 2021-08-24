import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valores1 = new int[5];
        int[] valores2 = new int[5];


        for (int i = 0;i < 5; i++){
            valores1[i] = sc.nextInt();
        }
        for (int i = 0;i < 5; i++){
            valores2[i] = valores1[i] * 2;
        }

        System.out.println("Valores do primeiro vetor: ");
        for (int valor1 : valores1){
            System.out.println(valor1);
        }

        System.out.println("Valores do segundo vetor: ");
        for (int valor2 : valores2){
            System.out.println(valor2);
        }
        sc.close();
    }
}
