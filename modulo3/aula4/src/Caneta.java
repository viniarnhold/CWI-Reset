public class Caneta {
    public String modelo;
    private Float ponta;
    private Boolean tampada;
    private String cor;

    public Caneta(String modelo, Float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPonta() {
        return ponta;
    }

    public void setPonta(Float ponta) {
        this.ponta = ponta;
    }

    public Boolean getTampada() {
        return tampada;
    }

    public void setTampada(Boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "modelo='" + modelo + '\'' +
                ", ponta=" + ponta +
                ", tampada=" + tampada +
                ", cor='" + cor + '\'' +
                '}';
    }
}
