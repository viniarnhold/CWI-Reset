public class Personagem {
    private String nome;
    private Integer idade;
    private Double altura;
    private Integer forca;
    private Integer estamina;
    private Integer moedasColetadas;
    private Integer vidas;

    public Personagem(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
        this.forca = 80;
        this.moedasColetadas = 0;
        this.vidas = 1;
    }

    public void saltar(){
        if (this.nome == "Mario"){
            System.out.println(this.nome + " fez um salto de " + (this.altura * 0.5) + "m");
        } else if (this.nome == "Luigi"){
            System.out.println(this.nome + " fez um salto de " + (this.altura * 2) + "m");
        } else {
            System.out.println(this.nome + " fez um salto de " + this.altura + "m");
        }
    }

    public void perderEstamina(){
        this.estamina -= 10;
        if(this.estamina < 0){
            this.estamina = 0;
        }
    }

    public void ganharEstamina(){
        this.estamina += 5;
        if(this.estamina > 100){
            this.estamina = 100;
        }
    }

    public void revigorar(){
        this.estamina = 100;
    }

    public void morrer(){
        this.estamina = 0;
        this.vidas -= 1;
        if(this.vidas < 0){
            this.vidas = 0;
        } else {
            revigorar();
        }
    }

    public void pegarMoeda(){
        this.moedasColetadas += 1;
        if(this.moedasColetadas >= 10){
            this.vidas += 1;
            this.moedasColetadas = 0;
        }
    }

    public void crescer(){
        this.altura *= 2;
    }

    public void caracteristicas(){
        System.out.println("-------CARACTERÍSTICAS-------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.printf("Altura: %.2f\n", this.altura);
        System.out.println("Força: " + this.forca);
        System.out.println("Estamina: " + this.estamina);
        System.out.println("Moedas coletadas: " + this.moedasColetadas);
        System.out.println("Vidas: " + this.vidas);
    }
    public void superHumanStrength(){
        if (this.forca != null) {
            this.forca *= 1000;
        }
        else {
            System.out.println(this.nome + " não tem força alguma");
        }
    }
}
