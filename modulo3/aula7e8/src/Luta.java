import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private Integer rouds;
    private Boolean aprovada;

    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2){
            this.aprovada = true;
            this.desafiante = lutador1;
            this.desafiado = lutador2;
        } else {
            this.aprovada = false;
        }
    }

    public void lutar(){
        if(this.aprovada){
            System.out.println("-----DESAFIADO-----");
            this.desafiado.apresentar();
            System.out.println("-----DESAFIANTE-----");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("A Luta teve um empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println(this.desafiado.getName() + " ganhou a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println(this.desafiante.getName() + " ganhou a luta!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer!!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Integer getRouds() {
        return rouds;
    }

    public void setRouds(Integer rouds) {
        this.rouds = rouds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
}
