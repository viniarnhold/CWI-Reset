public class Yoshi extends Personagem{
    private Integer frutasComidas;
    private Integer velocidade;

    public Yoshi(String nome, Integer idade, Double altura) {
        super(nome, idade, altura);
        this.frutasComidas = 0;
        this.velocidade = 10;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void comerFruta(){
        this.frutasComidas++;
        if(this.frutasComidas%2==0){
            this.velocidade *= 2;
        }
    }
}
