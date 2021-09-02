public class Aluno extends Pessoa{
    private Integer matricula;
    private String curso;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula(){
        System.out.println("Sua matricula será cancelada!");
    }

    public void pagarMensalidade(){
        System.out.println("Pagando sua mensalidade");
    }
}
