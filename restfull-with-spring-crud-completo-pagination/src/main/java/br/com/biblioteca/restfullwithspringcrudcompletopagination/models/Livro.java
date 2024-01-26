package br.com.biblioteca.restfullwithspringcrudcompletopagination.models;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.enuns.Genero;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
@Entity
public class Livro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_livro")
    private Long idLivro;
    @Column(name="nome_livro")
    private String nomeLivro;
    private String autor;
    private List<Genero> generos;
    @Column(name="data_lancamento")
    private LocalDate dataLancamento;
    private int quantidade;

    
    public Livro(){

    }

    public Livro(Long idLivro, String nomeLivro, String autor, List<Genero> generos, LocalDate dataLancamento, int quantidade) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.generos = generos;
        this.dataLancamento = dataLancamento;
        this.quantidade = quantidade;
    }

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(idLivro, livro.idLivro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLivro);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "idLivro=" + idLivro +
                ", nomeLivro='" + nomeLivro + '\'' +
                ", autor='" + autor + '\'' +
                ", generos=" + generos +
                ", dataLancamento=" + dataLancamento +
                ", quantidade=" + quantidade +
                '}';
    }
}
