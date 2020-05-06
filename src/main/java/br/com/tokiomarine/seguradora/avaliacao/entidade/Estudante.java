package br.com.tokiomarine.seguradora.avaliacao.entidade;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "estudante")
public class Estudante {
	// TODO Implementar a entidade Estudante conforme solicitado

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Nome é obrigatório")
    private String nome;
    @NotNull(message = "Email é obrigatório")
    private String email;
    private String telefone;
    @NotNull(message = "Matricula é obrigatório")
    private String matricula;
    private String curso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
