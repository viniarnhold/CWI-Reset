public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase){
        if(frase == "Toma, comida!" || frase == "Olá"){
            System.out.println("Abanar o rabo e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar o rabo");
        } else if(hora >= 18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar o rabo e latir");
        }
    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar e latir");
        }
    }
}
