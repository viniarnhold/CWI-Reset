public class Mario {
    private Boolean masculino;
    private String corDaPele;
    private Double altura;
    private String corDosOlhos;
    protected String corDoCabelo;
    protected String personalidade;
    public Boolean usandoChapeu;
    public Integer forca;

    public void caracteristicas(){
        System.out.println("Masculino: " + this.masculino);
        System.out.println("Cor da pele: " + this.corDaPele);
        System.out.println("Altura: " + this.altura);
        System.out.println("Cor dos olhos: " + this.corDosOlhos);
        System.out.println("Cor do cabelo: " + this.corDoCabelo);
        System.out.println("Personalidade: " + this.personalidade);
        System.out.println("Usando chapéu: " + this.usandoChapeu);
        System.out.println("Força: " + this.forca);
    }
    public void superHumanStrength(){
        this.personalidade = "Confiante e irritado";
        this.forca *= 1000;
    }
}
