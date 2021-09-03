public class Mario extends Personagem {
    private Boolean yoshi = false;

    public Mario(String nome, Integer idade, Double altura) {
        super(nome, idade, altura);
    }

    @Override
    public void crescer() {
        this.altura *= 1.5;
    }

    public void montarNoYoshi(){
        this.yoshi = true;
    }

    public void montado(){
        if(this.yoshi){
            System.out.println("Mário está montado no Yoshi!");
        } else {
            System.out.println("Mário não está montado no Yoshi!");
        }
    }
}
