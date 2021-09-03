public class Luigi extends Personagem{

    public Luigi(String nome, Integer idade, Double altura) {
        super(nome, idade, altura);
    }

    @Override
    public void crescer() {
        this.altura *= 1.75;
    }

    public void voar(){
        System.out.println("Luigi está voando!");
    }
}
