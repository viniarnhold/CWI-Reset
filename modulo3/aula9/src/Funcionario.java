public class Funcionario extends Pessoa{
    public String setor;
    public Boolean trabalhando;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudaTrabalho(){
        this.trabalhando = !this.trabalhando;
    }
}
