package controle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Laboratório de Programação 2 - Lab 4
 *
 * @author Marcos Vinícius Santos Silva - 119111008
 */

public class Sistema {
    private HashMap<String, Aluno> alunos;
    private HashMap<String, Grupo> grupos;
    private ArrayList<Aluno> alunosParticipantes;

    public Sistema() {
        this.alunos = new HashMap<String, Aluno>();
        this.grupos = new HashMap<String, Grupo>();
        this.alunosParticipantes = new ArrayList<Aluno>();
    }

    public boolean cadastrarAluno(String matricula, String nome, String curso){
        if(alunos.containsKey(matricula)){
            return false;
        }

        alunos.put(matricula, new Aluno(matricula, nome, curso));

        return true;
    }

    public Aluno consultarAluno(String matricula){
        if(!alunos.containsKey(matricula)){
            return null;
        }

        Aluno aluno = alunos.get(matricula);

        return aluno;
    }

    public boolean cadastrarGrupo(String nome){
        if(grupos.containsKey(nome)){
            return false;
        }

        grupos.put(nome, new Grupo(nome));

        return true;
    }

    public Grupo consultarGrupo(String nome){
        if(!grupos.containsKey(nome)){
            return null;
        }

        Grupo grupo = grupos.get(nome);

        return grupo;
    }

    public String alocarAluno(String matricula, String nomeGrupo){
        Aluno aluno = consultarAluno(matricula);
        Grupo grupo = consultarGrupo(nomeGrupo);
    }

}

