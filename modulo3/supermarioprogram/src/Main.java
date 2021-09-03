public class Main {
    public static void main(String[] args) {

        Mario mario = new Mario("Mario", 40, 1.60);
        Luigi luigi = new Luigi("Luigi", 30, 1.85);
        Yoshi yoshi = new Yoshi("Yoshi", 20, 1.50);

        Jogo jogo = new Jogo(mario, yoshi);

        jogo.statusJogador1();
        jogo.statusJogador2();

        jogo.jogar();

        mario.montado();
        mario.montarNoYoshi();
        mario.montado();

        luigi.voar();

        yoshi.comerFruta();
        System.out.println("Velocidade do Yoshi é " + yoshi.getVelocidade());
        yoshi.comerFruta();
        System.out.println("Velocidade do Yoshi é " + yoshi.getVelocidade());
        yoshi.comerFruta();
        yoshi.comerFruta();
        System.out.println("Velocidade do Yoshi é " + yoshi.getVelocidade());

    }
}
