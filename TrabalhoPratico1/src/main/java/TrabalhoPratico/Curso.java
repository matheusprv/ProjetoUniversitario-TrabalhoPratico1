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
public class Curso {
    private String nome, descricao;
    private int numeroCurso, horasSemestrais, nivel;
    private Departamento departamentoResp;

    public Curso(String nome, String descricao, int numeCursos, int horasSemestrais, int nivel, Departamento departamentoResp) {
        this.nome = nome;
        this.descricao = descricao;
        this.numeroCurso = numeCursos;
        this.horasSemestrais = horasSemestrais;
        this.nivel = nivel;
        this.departamentoResp = departamentoResp;
    }
    
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getNumeroCurso() {
        return numeroCurso;
    }
    public int getHorasSemestrais() {
        return horasSemestrais;
    }
    public int getNivel() {
        return nivel;
    }
    public Departamento getDepartamentoResp() {
        return departamentoResp;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setNumeroCurso(int numeroCurso) {
        this.numeroCurso = numeroCurso;
    }
    public void setHorasSemestrais(int horasSemestrais) {
        this.horasSemestrais = horasSemestrais;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setDepartamentoResp(Departamento departamentoResp) {
        this.departamentoResp = departamentoResp;
    }
    
    
}
