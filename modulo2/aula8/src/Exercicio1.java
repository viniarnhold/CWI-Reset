import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Scanner das notas e cálculo de médias
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4)/4;

        //Conceito - Aprovado ou não
        System.out.printf("Sua média foi: %.2f\n", media);
        if(media < 7){
            System.out.println("Aluno reprovado");
        } else if (media < 10){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno aprovado com louvores");
        }
        sc.close();
    }
}
