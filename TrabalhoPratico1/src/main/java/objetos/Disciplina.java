/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Matheus
 */
public class Disciplina {
    private String professor;
    private int semestre, ano, numeroDisciplina;
    private Curso curso;

    public Disciplina(String professor, int semestre, int ano, int numeroDisciplina, Curso curso) {
        this.professor = professor;
        this.semestre = semestre;
        this.ano = ano;
        this.numeroDisciplina = numeroDisciplina;
        this.curso = curso;
    }

    public String getProfessor() {
        return professor;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getAno() {
        return ano;
    }

    public int getNumeroDisciplina() {
        return numeroDisciplina;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNumeroDisciplina(int numeroDisciplina) {
        this.numeroDisciplina = numeroDisciplina;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }


    
    
            
}
