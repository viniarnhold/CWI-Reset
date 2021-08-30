public class Caneta {
    public String modelo;
    public String cor;
    private Double ponta;
    protected Integer carga;
    protected Boolean tampada;

    public void status() {
    }

    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Eu não posso rabiscar, a caneta está tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ponta=" + ponta +
                ", carga=" + carga +
                ", tampada=" + tampada +
                '}';
    }
}

