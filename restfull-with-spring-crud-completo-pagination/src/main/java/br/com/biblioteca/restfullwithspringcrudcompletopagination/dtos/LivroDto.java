package br.com.biblioteca.restfullwithspringcrudcompletopagination.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class LivroDto implements Serializable {
    private Long idLivro;
    private String nomeLivro;
    private String autor;
    private List<String> generos;
    private LocalDate dataLancamento;
    private int quantidade;

    public LivroDto(){

    }

    public LivroDto(Long idLivro, String nomeLivro, String autor, List<String> generos, LocalDate dataLancamento, int quantidade) {
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

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
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
}
