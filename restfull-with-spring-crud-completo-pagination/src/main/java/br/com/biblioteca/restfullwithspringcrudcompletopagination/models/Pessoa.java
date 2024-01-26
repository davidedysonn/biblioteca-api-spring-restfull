package br.com.biblioteca.restfullwithspringcrudcompletopagination.models;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.enuns.TipoAturizacao;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

public class Pessoa {
    private Long id;
    private String nome;
    private String sexo;
    private String endereco;
    @Column(name = "tipo_autorizacao")
    private TipoAturizacao tipoAturizacao;
    private Boolean banido;
    private List<Livro> livros;


    public Pessoa() {
    }

    public Pessoa(Long id, String nome, String sexo, String endereco, TipoAturizacao tipoAturizacao, Boolean banido, List<Livro> livros) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.tipoAturizacao = tipoAturizacao;
        this.banido = banido;
        this.livros = livros;
    }

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public TipoAturizacao getTipoAturizacao() {
        return tipoAturizacao;
    }

    public void setTipoAturizacao(TipoAturizacao tipoAturizacao) {
        this.tipoAturizacao = tipoAturizacao;
    }

    public Boolean getBanido() {
        return banido;
    }

    public void setBanido(Boolean banido) {
        this.banido = banido;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", endereco='" + endereco + '\'' +
                ", tipoAturizacao=" + tipoAturizacao +
                ", banido=" + banido +
                ", livros=" + livros +
                '}';
    }
}
