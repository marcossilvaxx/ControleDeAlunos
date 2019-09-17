package controle;

import java.util.Objects;

/**
 * Laboratório de Programação 2 - Lab 4
 *
 * @author Marcos Vinícius Santos Silva - 119111008
 */

public class Aluno {

    private String matricula;
    private String nome;
    private String curso;

    public Aluno(String matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return this.matricula + " - " + this.nome + " - " + this.curso;
    }
}