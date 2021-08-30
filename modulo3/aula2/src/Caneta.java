public class Caneta {
    String modelo;
    String cor;
    Double ponta;
    Integer carga;
    Boolean tampada;

    void status() {
    }

    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Eu não posso rabiscar, a caneta está tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
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

