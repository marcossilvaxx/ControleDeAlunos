package controle;

import java.util.HashSet;
import java.util.Objects;

/**
 * Laboratório de Programação 2 - Lab 4
 *
 * @author Marcos Vinícius Santos Silva - 119111008
 */

public class Grupo {
    private String nome;
    private HashSet<Aluno> alunos;

    public Grupo(String nome, HashSet<Aluno> alunos){
        this.nome = nome;
        this.alunos = alunos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo grupo = (Grupo) o;
        return Objects.equals(this, grupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nome.toLowerCase());
    }
}
