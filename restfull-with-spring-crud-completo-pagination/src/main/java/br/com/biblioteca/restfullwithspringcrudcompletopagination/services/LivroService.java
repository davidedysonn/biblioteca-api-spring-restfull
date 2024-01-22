package br.com.biblioteca.restfullwithspringcrudcompletopagination.services;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.dtos.LivroDto;
import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.Livro;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LivroService {

    LivroDto cadastroLivro (LivroDto livroDto);
    LivroDto atualizarLivro (Long id, LivroDto livroDto);
    List<LivroDto> buscarLivros ();
    List<String> buscaPorNomeLivro (String nomeLivro);
    LivroDto buscarLivroPorId (Long id);
    void deletarCliente (Long id);
}
