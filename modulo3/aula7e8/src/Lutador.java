public class Lutador {
    //Atributos
    private String name;
    private String nacionalidade;
    private Integer idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    public Lutador(String name, String nacionalidade, Integer idade, Double altura,
                   Double peso, Integer vitorias, Integer derrotas, Integer empates) {
        this.name = name;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
       if(this.peso < 52.2){
           this.categoria = "Inválido";
       } else if (this.peso <= 70.3){
           this.categoria = "Leve";
       } else if (this.peso <= 83.9){
           this.categoria = "Médio";
       } else if (this.peso <= 120.2){
           this.categoria = "Pesado";
       } else {
           this.categoria = "Inválido";
       }
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("====================================================");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getName());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos");
        System.out.println("Pesando " + this.getPeso() + "kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");

    }

    public void status(){
        System.out.println("--------------------------------------");
        System.out.println(this.getName() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    public void ganharLuta(){
        this.vitorias = (this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.derrotas = (this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.empates = (this.getEmpates() + 1);
    }
}
