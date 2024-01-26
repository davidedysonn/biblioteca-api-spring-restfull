package br.com.biblioteca.restfullwithspringcrudcompletopagination.services;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.dtos.LivroDto;
import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.Livro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LivroService {

    LivroDto cadastroLivro (LivroDto livroDto);
    LivroDto atualizarLivro (Long id, LivroDto livroDto);
    List<LivroDto> buscarLivros ();
    Page<String> buscaPorNomeLivro (String nomeLivro, Pageable pageable);
    LivroDto buscarLivroPorId (Long id);
    LivroDto adicionarQuantidade (Long id, int quantidade);
    void deletarCliente (Long id);
}
