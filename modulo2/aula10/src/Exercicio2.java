import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idades = new int[10];

        System.out.println("Digite as idades em questão: ");
        for(int i = 0; i<idades.length; i++){
            idades[i] = sc.nextInt();
        }

        int maioresDeIdade = 0;
        for(int idade : idades){
            if(idade >= 18){
                maioresDeIdade++;
            }
        }
        System.out.println("As idades digitadas foram: ");
        for (int idade : idades){
            System.out.println(idade);
        }
        System.out.println("Foram informados " + maioresDeIdade + " maiores de idade");

        sc.close();
    }
}
