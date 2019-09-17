package controle;

import java.util.ArrayList;
import java.util.HashMap;

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
    }

    public boolean cadastrarAluno(String matricula, String nome, String curso){
        if(alunos.containsKey(matricula)){
            return false;
        }

        alunos.put(matricula, new Aluno(matricula, nome, curso));

        return true;
    }

    public String consultarAluno(String matricula){
        if(!alunos.containsKey(matricula)){
            return "Matrícula: " + matricula + "\n\nAluno não cadastrado.";
        }

        Aluno aluno = alunos.get(matricula);

        return "Matrícula: " + matricula + "\n\nAluno: " + aluno.toString();
    }

    public boolean cadastrarGrupo(String nome){
        if(grupos.containsKey(nome)){
            
        }
    }
}
