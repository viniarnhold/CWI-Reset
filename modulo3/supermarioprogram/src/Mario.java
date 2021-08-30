public class Mario {
    private String nome;
    private Integer idade;
    private Double altura;
    private String personalidade;
    private Integer forca;
    private Integer estamina;

    public Mario() {
        this.nome = "Mario Bross";
        this.idade = 40;
        this.altura = 1.50;
        this.estamina = 100;
        this.personalidade = "Empolgado";
        this.forca = 80;
    }

    public Mario(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
        this.personalidade = "Empolgado";
        this.forca = 80;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getEstamina() {
        return estamina;
    }

    public void setEstamina(Integer estamina) {
        this.estamina = estamina;
    }

    public void caracteristicas(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.printf("Altura: %.2f\n", this.altura);
        System.out.println("Personalidade: " + this.personalidade);
        System.out.println("Força: " + this.forca);
        System.out.println("Estamina: " + this.estamina);
    }
    public void superHumanStrength(){
        if (this.forca != null) {
            this.personalidade = "Confiante e irritado";
            this.forca *= 1000;
        }
        else {
            System.out.println(this.nome + " não tem força alguma");
        }
    }
}
