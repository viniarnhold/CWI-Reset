import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();
        //Nome fictício do banco
        System.out.println("Bem vindo ao Vini's Bank");


        int escolha = 0;
        while(escolha != 7){

            //Menu de informações da aplicação
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Abrir conta");
            System.out.println("2 - Fechar conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar mensalidade");
            System.out.println("6 - Status da conta");
            System.out.println("7 - Sair");
            escolha = sc.nextInt();

            //Tratamento da escolha digitada pelo usuário
            switch (escolha) {
                case 1: {
                    conta.abrirConta();
                    break;
                }
                case 2:{
                    conta.fecharConta();
                    break;
                }
                case 3: {
                    conta.depositar();
                    break;
                }
                case 4: {
                    conta.sacar();
                    break;
                }
                case 5: {
                    conta.pagarMensalidade();
                    break;
                }
                case 6: {
                    conta.statusDaConta();
                    break;
                }
            }

        }
        sc.close();
    }
}
