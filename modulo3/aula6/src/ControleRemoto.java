public class ControleRemoto implements Controlador{
    //Atributos
    private Integer volume;
    private Boolean ligado;
    private Boolean tocando;

    //Construtor da Classe
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private Integer getVolume() {
        return volume;
    }

    private void setVolume(Integer volume) {
        this.volume = volume;
    }

    private Boolean getLigado() {
        return ligado;
    }

    private void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    private Boolean getTocando() {
        return tocando;
    }

    private void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("=========MENU==========");
        System.out.println("Está ligado? " + this.ligado);
        System.out.println("Está tocando? " + this.tocando);
        System.out.print("Volume: " + this.volume);
        for (int i = 0;i <= this.volume; i+= 10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");

    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }
    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
