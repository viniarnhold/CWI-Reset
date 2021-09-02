public class Escola {
    public static void main(String[] args) {

        Visitante p1 = new Visitante();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Bolsista p5 = new Bolsista();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        p5.setNome("Carlos");

        p2.setCurso("Informática");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        p5.setBolsa(20.0);
        p5.pagarMensalidade();
    }
}
