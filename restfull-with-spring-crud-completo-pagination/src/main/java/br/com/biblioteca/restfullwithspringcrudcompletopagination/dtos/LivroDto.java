package br.com.biblioteca.restfullwithspringcrudcompletopagination.dtos;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.Genero;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class LivroDto implements Serializable {
    private Long idLivro;
    private String nomeLivro;
    private String autor;
    private List<Genero> generos;
    private LocalDate dataLancamento;

    public LivroDto(){

    }

    public LivroDto(Long idLivro, String nomeLivro, String autor, List<Genero> generos, LocalDate dataLancamento) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.generos = generos;
        this.dataLancamento = dataLancamento;
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
}
