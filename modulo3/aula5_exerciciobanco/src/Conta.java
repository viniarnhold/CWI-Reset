import enums.TiposDeConta;

import java.util.Scanner;

public class Conta {

    public Integer numero;
    protected TiposDeConta tipo;
    private String dono;
    private Double saldo;
    private Boolean status;

    Scanner sc = new Scanner(System.in);

    public Conta() {
        this.saldo = 0.00;
        this.status = false;
    }

    public Integer getNumero() {

        return numero;
    }

    public void setNumero(Integer numero) {

        this.numero = numero;
    }

    public TiposDeConta getTipo() {

        return tipo;
    }

    public void setTipo(TiposDeConta tipo) {

        this.tipo = tipo;
    }

    public String getDono() {

        return dono;
    }

    public void setDono(String dono) {

        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {

        this.saldo = saldo;
    }

    public Boolean getStatus() {

        return status;
    }

    public void setStatus(Boolean status) {

        this.status = status;
    }

    //Método abrir conta, solicitando o tipo de conta e com base na escolha, o "bonus" dado pelo banco
    public void abrirConta() {
        this.status = true;
        System.out.println("Digite o tipo de conta a ser aberta(CONTA_CORRENTE/CONTA_POUPANCA:");
        this.tipo = tipo.valueOf(sc.next());
        if (this.tipo == TiposDeConta.CONTA_CORRENTE) {
            this.saldo = 50.0;
            System.out.println("Conta aberta com sucesso!");
        } else if (this.tipo == TiposDeConta.CONTA_POUPANCA) {
            this.saldo = 150.0;
            System.out.println("Conta aberta com sucesso!");
        } else {
            System.out.println("Tipo de conta inexistente");
        }
        }

    //Método que fecha a conta do usuário, verificando se a conta pode ou não ser fechada
    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Não foi possível fechar sua conta, ainda há dinheiro na sua conta!");
        } else if (saldo < 0) {
            System.out.println("Não foi possível fechar sua conta, ainda há pendência");
        } else {
            this.status = false;
            System.out.println("Sua conta foi fechada com sucesso!");
        }
    }

    //Método que solicita um valor a ser depositado e verifica se é possível realizar depósito
    public void depositar() {
        if (this.status) {
            System.out.println("Informe o valor a ser depositado:");
            this.saldo += sc.nextDouble();
        } else {
            System.out.println("Você não pode fazer esse deposito, a conta não está aberta");
        }
    }

    //Método que solicita um valor a ser sacado e verifica se é possível realizar o saque
    public void sacar() {
        if(this.status == false){
            System.out.println("Você não pode fazer esse saque, a conta não está aberta");
        } else {
            System.out.println("Informe o valor a ser sacado:");
            double saque = sc.nextDouble();
            if (saque <= this.saldo){
                this.saldo -= saque;
            } else {
                System.out.println("Você não pode efetuar esse saque, o valor de saque é maior que o saldo");
            }
        }
    }
    //Método que checa o tipo de conta e com base nisso faz o pagamento da mensalidade
    public void pagarMensalidade(){
        if (this.tipo == TiposDeConta.CONTA_CORRENTE){
            this.saldo -= 12.0;
        } else {
            this.saldo -= 20.0;
        }
    }

    //Método que imprime o status da conta para o usuário(toString modificado)
    public void statusDaConta() {
        System.out.println("Conta{" +
                "numero=" + this.numero +
                ", tipo=" + this.tipo +
                ", dono='" + this.dono + '\'' +
                ", saldo=" + this.saldo +
                ", status=" + this.status +
                '}');
    }
}