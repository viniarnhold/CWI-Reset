public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();

        //mario.masculino = true;
        //mario.corDaPele = "Clara";
        //mario.altura = 1.55;
        //mario.corDosOlhos = "Azuis";
        mario.corDoCabelo = "Castanho";
        mario.personalidade = "Alegre";
        mario.usandoChapeu = true;
        mario.forca = 80;

        System.out.println("");
        System.out.println("Antes de usar o Super Poder");
        mario.caracteristicas();

        mario.superHumanStrength();

        System.out.println("");
        System.out.println("Depois de usar o Super Poder:");
        mario.caracteristicas();
    }
}
