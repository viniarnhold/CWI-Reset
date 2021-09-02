public class Bolsista extends Aluno{
    private Double bolsa;

    public Double getBolsa() {
        return bolsa;
    }

    public void setBolsa(Double bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }
}
