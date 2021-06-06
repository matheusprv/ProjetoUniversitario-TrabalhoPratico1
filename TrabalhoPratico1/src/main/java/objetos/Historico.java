/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class Historico {
    private Aluno aluno;
    private ArrayList<Disciplina> disciplinas= new ArrayList<Disciplina>();
    private ArrayList<String> notaConceito= new ArrayList<String>();
    private ArrayList<Integer> notaNumerica= new ArrayList<Integer>();

    public Historico(Aluno aluno, Disciplina disciplina, String notaConceito, int notaNumerica) {
        this.aluno = aluno;
        this.disciplinas.add(disciplina);
        this.notaConceito.add(notaConceito);
        this.notaNumerica.add(notaNumerica);
    }

    public void setAluno(Aluno aluno){
        this.aluno = aluno;
        
    }
    public void setDisciplinas(int posicao, Disciplina DisciplainaNova) {
        this.disciplinas.set(posicao, DisciplainaNova);
    }
    public void setNotaConceito(int posicao, String nota) {
        this.notaConceito.set(posicao, nota);
    }
    public void setNotaNumerica(int posicao, int nota) {
        this.notaNumerica.set(posicao, nota);
    }
    
    public Aluno getAluno() {
        return aluno;
    }
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public ArrayList<String> getNotaConceito() {
        return notaConceito;
    }
    public ArrayList<Integer> getNotaNumerica() {
        return notaNumerica;
    }

    
    
    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }
    public void addNotaConceito(String nota){
        this.notaConceito.add(nota);
    }
    public void addNotaNumerica(int nota){
        this.notaNumerica.add(nota);
    }
    
    public void removeDisciplina(Disciplina disciplina){
        int posicaoDisciplina = this.disciplinas.indexOf(disciplina);
        this.disciplinas.remove(disciplina);
        this.notaConceito.remove(posicaoDisciplina);
        this.notaNumerica.remove(posicaoDisciplina);
    }
}
