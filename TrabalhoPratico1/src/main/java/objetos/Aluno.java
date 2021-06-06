/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.time.LocalDate;

/**
 *
 * @author Matheus
 */
public class Aluno {
    private String nome, numeroMatricula, cpf, endereco, telefoneContato, turma, programa;
    private LocalDate dataNascimento;
    private char sexo;
    private Departamento departamentoPrinc, departamentoSec;

    public Aluno(String nome, String numeroMatricula, String cpf, String endereco, String telefoneContato, String turma, String programa, LocalDate dataNascimento, char sexo, Departamento departamentoPrinc, Departamento departamentoSec) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
        this.turma = turma;
        this.programa = programa;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.departamentoPrinc = departamentoPrinc;
        this.departamentoSec = departamentoSec;
    }

    public String getNome() {
        return nome;
    }
    public String getNumeroMatricula() {
        return numeroMatricula;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefoneContato() {
        return telefoneContato;
    }
    public String getTurma() {
        return turma;
    }
    public String getPrograma() {
        return programa;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public char getSexo() {
        return sexo;
    }
    public Departamento getDepartamentoPrinc() {
        return departamentoPrinc;
    }
    public Departamento getDepartamentoSec() {
        return departamentoSec;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setDepartamentoPrinc(Departamento departamentoPrinc) {
        this.departamentoPrinc = departamentoPrinc;
    }
    public void setDepartamentoSec(Departamento departamentoSec) {
        this.departamentoSec = departamentoSec;
    }
    
    
    
}
