public class Main {
    public static void main(String[] args) {
        Personagem mario = new Personagem("Mario", 40, 1.50);
        Personagem luigi = new Personagem("Luigi", 35, 1.90);

        Jogo jogo = new Jogo(mario, luigi);

        jogo.jogar();

    }
}
