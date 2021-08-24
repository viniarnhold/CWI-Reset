import java.util.Scanner;

public class AlunoResetLeituraTeclado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + nome);
        scan.close();
    }
}