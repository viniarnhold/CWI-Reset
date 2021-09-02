import java.util.Random;

public class Jogo {
    private Personagem jogador1;
    private Personagem jogador2;

    public Jogo(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void statusJogador1(){
        this.jogador1.caracteristicas();
    }

    public void statusJogador2(){
        this.jogador2.caracteristicas();
    }

    public void jogar(){
        Random aleatorio = new Random();
        int moedasJogador1 = aleatorio.nextInt(30);
        int moedasJogador2 = aleatorio.nextInt(30);

        for(int i=0;i < moedasJogador1;i++){
            System.out.println("Jogador 1 coletou uma moeda");
            this.jogador1.pegarMoeda();
        }
        for(int i=0;i < moedasJogador2;i++){
            System.out.println("Jogador 2 coletou uma moeda");
            this.jogador2.pegarMoeda();
        }

        statusJogador1();
        statusJogador2();
    }


}
