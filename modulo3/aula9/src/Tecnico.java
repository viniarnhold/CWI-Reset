public class Tecnico extends Aluno {
    private Integer registroProfissional;

    public void praticar(){
        System.out.println(this.getNome() + "Está praticando!!");
    }

    public Integer getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(Integer registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
