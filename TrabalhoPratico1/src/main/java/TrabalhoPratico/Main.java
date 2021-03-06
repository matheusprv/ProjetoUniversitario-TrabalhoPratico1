/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Main {
    static ArrayList<Departamento> departamento = new ArrayList<Departamento>();
    static ArrayList<Curso> cursos = new ArrayList<Curso>();
    static ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
    static ArrayList<Aluno> aluno = new ArrayList<Aluno>();
    static ArrayList<Historico> historico = new ArrayList<Historico>();
    
    static Scanner tecladoNumerico = new Scanner(System.in);//Teclados diferentes evitam possíveis erros de código, como por exemplo pular uma entrada de tipo diferente da anterior.
    static Scanner tecladoAlfabeto = new Scanner(System.in);
    static int ano, semestre;
    
    public static void main(String[] args) {
        
        LocalDate data = LocalDate.now();//O mes e ano são pegos para serem usados no cadastro de novas disciplinas a fim de não repetir toda hora os mesmos calculos
        data.getYear();
        semestre=1;
        if(data.getMonthValue() > 6){
            semestre=2;
        }
        
        
        departamento.add(new Departamento("Departamento de Informática", "(31) 3741-3741", 123456,1));
        departamento.add(new Departamento("Departamento de Administração", "(31) 3741-1473", 123456,1));
        
        cursos.add(new Curso ("Técnico em Informática", "O aluno criará um software do zero", 1, 250, 1, departamento.get(0)));
        cursos.add(new Curso ("Bacharelado em Administração", "O aluno aprenderá a gerir uma empresa", 2, 220, 1, departamento.get(1)));
        
        disciplina.add(new Disciplina ("Prof1","Progrmação 1", semestre, ano, 1, cursos.get(0)));//Programação 1
        disciplina.add(new Disciplina ("Prof2","Progrmação OO", semestre, ano, 2, cursos.get(0)));//Programação OO
        disciplina.add(new Disciplina ("Prof3","Tópicos em Desenvolvimento", semestre, ano, 3, cursos.get(0)));//Tópicos em Desenvolvimento
        disciplina.add(new Disciplina ("Prof4","Gestão empresarial", semestre, ano, 1, cursos.get(1)));//Gestão Empresarial
        disciplina.add(new Disciplina ("Prof5","Gestão Ambiental", semestre, ano, 2, cursos.get(1)));//Gestão Ambiental
        
        aluno.add(new Aluno ("Matheus Peixoto", "0011111", "111.111.111-11", "Rua Ficticia, 1, centro", "123456789", "Veterano", "Graduação", LocalDate.of(2003, 10, 29), 'M', departamento.get(0), null));
        historico.add(new Historico(aluno.get(0), disciplina.get(0), null, 0));
        historico.get(0).addDisciplina(disciplina.get(1));
        historico.get(0).addNotaNumerica(0);
        historico.get(0).addNotaConceito(null);
        
        historico.get(0).setNotaNumerica(0, 100);
        
        aluno.add(new Aluno ("João", "0022222", "222.222.222-22", "Rua Ficticia2, 2, centro", "456789123", "Calouro", "Graduação", LocalDate.of(2003, 6, 7), 'M', departamento.get(0), null));
        historico.add(new Historico(aluno.get(1), disciplina.get(0), null, 0));
        historico.get(1).addDisciplina(disciplina.get(1));
        historico.get(1).addNotaNumerica(0);
        historico.get(1).addNotaConceito(null);
        
        aluno.add(new Aluno ("Maria", "0033333", "333.333.333-33", "Rua Ficticia3, 3, centro", "789123456", "Graduado", "Mestrado", LocalDate.of(2000, 1, 2), 'F', departamento.get(0), null));
        historico.add(new Historico(aluno.get(2), disciplina.get(0), null, 0));
        
        aluno.add(new Aluno ("José", "0044444", "444.444.444-44", "Rua Ficticia4, 4, centro", "147258369", "calouro", "doutorado", LocalDate.of(1997, 5, 19), 'M', departamento.get(0), null));
        historico.add(new Historico(aluno.get(3), disciplina.get(2), null, 0));

        
        //ADMINISTRAÇÂO
        aluno.add(new Aluno ("Alice", "0055555", "555.555.555-55", "Rua Ficticia5, 5, centro", "258369147", "Veterano", "Graduação", LocalDate.of(2000, 11, 8), 'F', departamento.get(1), null));
        historico.add(new Historico(aluno.get(4), disciplina.get(3), null, 0));
        historico.get(4).addDisciplina(disciplina.get(4));
        historico.get(4).addNotaNumerica(0);
        historico.get(4).addNotaConceito(null);
        
        historico.get(4).setNotaNumerica(0, 80);
        
        aluno.add(new Aluno ("Joana", "0066666", "666.666.666-66", "Rua Ficticia6, 6, centro", "369147258", "Calouro", "Graduação", LocalDate.of(2001, 1, 9), 'F', departamento.get(1), null));
        historico.add(new Historico(aluno.get(5), disciplina.get(3), null, 0));
        historico.get(5).addDisciplina(disciplina.get(4));
        historico.get(5).addNotaNumerica(0);
        historico.get(5).addNotaConceito(null);
        
        aluno.add(new Aluno ("Marcos", "0077777", "777.777.777-77", "Rua Ficticia7, 7, centro", "654987321", "Graduado", "Graduação", LocalDate.of(2003, 10, 29), 'M', departamento.get(1), null));
        historico.add(new Historico(aluno.get(6), disciplina.get(3), null, 0));
        
        aluno.add(new Aluno ("Marcelo", "0088888", "888.888.888-88", "Rua Ficticia8, 8, centro", "346129785", "Veterano", "Mestrado", LocalDate.of(1995, 7, 22), 'M', departamento.get(1), null));
        historico.add(new Historico(aluno.get(7), disciplina.get(4), null, 0));
        
        int opcao=0;
        do{
            System.out.print("1 - Cadastro de Disciplina. \n2 - Matricular Aluno em disciplina. \n3 - Registrar nota de aluno na disciplina. \n4 - Lista de alunos aprovados e reprovados.\n5 - Informações de alunos\n6 - Sair.\nDigite o número do menu para qual você deseja ir: ");
            opcao=tecladoNumerico.nextInt();
            if(opcao<1 && opcao>6){
                System.out.println("\nDigite um valor válido.");
            }
            
            //São os menus para onde o usuário pode ir
            else{ 
                if(opcao==1){
                    cadastrarDisciplina();
                }
                else if(opcao == 2){
                    matricularAlunoNaDisciplina();
                }
                else if(opcao == 3){
                    registrarNotaAluno();
                }
                else if(opcao == 4){
                    aprovadosReprovados();
                }
                else if(opcao == 5){
                    mostrarTudo();
                }
            }
        }while(opcao !=6);
        System.out.println("\n===============\nFechando o sistema\n===============");
    }
    
    public static void cadastrarDisciplina(){
        //As disciplinas são cadastradas
        
        System.out.print("Digite o número da disciplina: ");
        int numero = tecladoNumerico.nextInt();
        
        Curso curso=verificarCurso();// Nesse método é pedido o nome do curso
        
        System.out.print("Digite o nome da disciplina: ");
        String nomeDisciplina = tecladoAlfabeto.nextLine();
        
        System.out.print("Digite o nome do professor da disciplina: ");
        String professor = tecladoAlfabeto.nextLine();
        
        disciplina.add(new Disciplina(professor, nomeDisciplina, semestre, ano, numero, curso));
        System.out.println("\nDisciplina "+numero+" do curso "+curso.getNome()+" adicionada ao sistema.\n");
    }
    
    public static void matricularAlunoNaDisciplina(){
        //O aluno é matriculado na disciplina
        
        //Procura qual o aluno que fará a matrícula e em qual posição do vetor ele está
        int cont=-1;
        int posicaoAluno=0;//Qual a posição que o aluno se encontra no vetor. Receberá o valor de cont, que aumenta a cada aluno verificado
        Aluno alunoTemp = null; 
        //Enquanto a variavel alunoTemp for nula, o programa ficará num loop até que um valor verdadeiro seja encontrado
        while(alunoTemp==null){ 
            System.out.print("\nDigite o número da matrícula do aluno a ser cadastrado: ");
            String numMatricula = tecladoAlfabeto.nextLine();
            for(Aluno verificar : aluno){
                cont++;
                if(verificar.getNumeroMatricula().equals(numMatricula)){
                    alunoTemp=verificar;
                    posicaoAluno=cont;
                }
            } 
        }
        
        //Verifica qual o cursos do aluno para matriculá-lo na disciplina correta
        Curso curso=verificarCurso();
        
        Disciplina discTemp = null;//Variavel temporaria para verificar a disciplina do aluno 
        while(discTemp == null){
            System.out.print("Digite a DISCIPLINA para matricular "+alunoTemp.getNome()+": ");
            int materia = tecladoNumerico.nextInt(); // Disciplina escolhida
            for(Disciplina disc: disciplina){
                if(materia == disc.getNumeroDisciplina() & disc.getCurso().equals(curso)){// Verifica se a disciplina e o cursos estão de acordos 
                    discTemp=disc;
                }
            }
        }
        historico.get(posicaoAluno).addDisciplina(discTemp);
        historico.get(posicaoAluno).addNotaNumerica(0);
        historico.get(posicaoAluno).addNotaConceito(null);
        
        
        System.out.println("\nAluno "+alunoTemp.getNome()+" foi matriculado na disciplina "+discTemp.getNome()+" do curso "+curso.getNome()+"\n");
        
    }
    
    public static void registrarNotaAluno(){
        //Registra a nota do aluno em uma disciplina
        
        //Verifica qual o cursos que a matéria se encontra
        Curso curso=verificarCurso();
        
        //Variavel temporaria para verificar a disciplina do aluno 
        Disciplina discTemp = null;
        while(discTemp == null){
            System.out.print("Digite o código DISCIPLINA para dar nota ao aluno: ");
            int materia = tecladoNumerico.nextInt(); // Disciplina escolhida
            for(Disciplina disc: disciplina){
                if(materia == disc.getNumeroDisciplina() & disc.getCurso().equals(curso)){// Verifica se a disciplina e o cursos estão de acordos 
                    discTemp=disc;
                }
            }
        }
        
        //Entra num loop que verifia se o número de matrícula do aluno é válido
        Aluno alunoTemp = null; //Armazena uma variavel aluno que só serve para encontrar o aluno correto e imprimir seu nome na próxima saída
        while(alunoTemp==null){ 
            System.out.print("Digite o número da matrícula do aluno que vai receber a nota: ");
            String numMatricula = tecladoAlfabeto.nextLine();
            for(Aluno verificar : aluno){
                if(verificar.getNumeroMatricula().equals(numMatricula)){
                    alunoTemp=verificar;
                }
            } 
        }
        
        //Ao receber a nota númerica, transforma em nota conceitual
        System.out.print("Digite a nota do aluno: ");
        int notaNumerica = tecladoNumerico.nextInt();
        String notaConceito = null;
        if(notaNumerica<=10){
            notaConceito="F";
        }
        else if(notaNumerica>10 && notaNumerica <=20){
            notaConceito="E";
        }
        else if(notaNumerica>=21 && notaNumerica <=40){
            notaConceito="D";
        }
        else if(notaNumerica>=41 && notaNumerica <=60){
            notaConceito="C";
        }
        else if(notaNumerica>=61 && notaNumerica <=80){
            notaConceito="B";
        }
        else{
            notaConceito="A";
        }
        
        //Percorre o vetor historico para encontrar em qual posicao do vetor notaNumerica e notaConceito está a disciplina correspondente
        for(Historico hist: historico){
            if(hist.getAluno().equals(alunoTemp)){
                int posicaoDisc=0;//Esse valor serve para alterar na posição correta do ArrayList
                for(int i=0; i<hist.getDisciplinas().size();i++){
                    if(hist.getDisciplinas().get(i).getNumeroDisciplina()==discTemp.getNumeroDisciplina()){ //Verifica se a disciplina é a solicitada
                        posicaoDisc=i;
                    }
                }

                hist.setNotaNumerica(posicaoDisc, notaNumerica);
                hist.setNotaConceito(posicaoDisc, notaConceito);
                
                System.out.println("Nota "+hist.getNotaNumerica().get(posicaoDisc)+" ou "
                        +hist.getNotaConceito().get(posicaoDisc)+" atribuida ao aluno "
                        +hist.getAluno().getNome()+" na disciplina "
                        +hist.getDisciplinas().get(posicaoDisc).getNome()+ 
                        " do curso "+curso.getNome()+".\n");
            }
        }
    }
    
    public static void aprovadosReprovados(){
        //Verifica qual o cursos que a matéria se encontra
        Curso curso=verificarCurso();

        
        Disciplina discTemp = null;//Variavel temporaria para verificar a disciplina do aluno 
        int materia=0;//numero da disciplina
        
        //Solicita ao usuário uma disciplina e fica preso nesse loop até um valor válido ser encontrado
        while(discTemp == null){
            System.out.print("Digite o código DISCIPLINA para ver as notas: ");
            materia = tecladoNumerico.nextInt(); // Disciplina escolhida
            for(Disciplina disc: disciplina){
                if(materia == disc.getNumeroDisciplina() & disc.getCurso().getNome().equals(curso.getNome())){// Verifica se a disciplina e o curso são os que o usuário passou
                    discTemp=disc;
                }
            }
        }
        System.out.println("");
        System.out.println("Alunos aprovados e reprovados na disciplina "+discTemp.getNome());
        for(Historico h: historico){//Verifica as disciplinas e cursos estão de acordos com o que foi pedido para ser mostrado
            for(int i=0; i<h.getDisciplinas().size();i++){
                if(h.getDisciplinas().get(i).getNumeroDisciplina()== materia){
                    if(h.getDisciplinas().get(i).getCurso().getNome().equals(curso.getNome())){
                        if(h.getNotaNumerica().get(i)>=60){
                            System.out.println(h.getAluno().getNome()+": Aprovado\n");
                        }
                        else{
                            System.out.println(h.getAluno().getNome()+": Reprovado\n");
                        }
                    }
                }
            }
                
        }
        
    }
    
    public static void mostrarTudo(){
    //Exibe o nome, matriculas em disciplinas e as notas dos alunos
    
        System.out.println("");
        for(Historico h: historico){
            System.out.println(h.getAluno().getNome());
            for(int i=0; i<h.getDisciplinas().size();i++){
                System.out.println("Nº disciplina: "+h.getDisciplinas().get(i).getNumeroDisciplina() +" --- Nome da disciplina: "+h.getDisciplinas().get(i).getNome()+ " --- Curso disciplina: "+h.getDisciplinas().get(i).getCurso().getNome()+" --- Notas: "+h.getNotaConceito().get(i) + " --- Notas: "+h.getNotaNumerica().get(i));
            }
            System.out.println("==============\n");
            
        }
    }
    public static Curso verificarCurso(){
        //Solicita ao usuário o nome do curso e verifica se ele existe no sistema, se não, ele fica num loop
        
        Curso c=null;
        while(c==null){//O usuário fica preso no loop até escrever um valor correto
            System.out.print("Digite o curso da disciplina: ");
            String nomeCurso = tecladoAlfabeto.nextLine(); 
            for(Curso verificar : cursos){ //Compara o nome escrito pelo usuário com o nome dos outros cursos já cadastrados no sistema
                if(verificar.getNome().equals(nomeCurso)){
                    c=verificar;
                }
            }
        }
        return c;
    }
    
}