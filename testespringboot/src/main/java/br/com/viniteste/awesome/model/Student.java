package br.com.viniteste.awesome.model;

public class Student {
    private String name;
    private Integer idade;
    private String curso;

    public Student(String name, Integer idade, String curso) {
        this.name = name;
        this.idade = idade;
        this.curso = curso;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
