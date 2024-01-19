package br.com.biblioteca.restfullwithspringcrudcompletopagination.services;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.dtos.LivroDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LivroService {

    LivroDto cadastroLivro (LivroDto livroDto);
    LivroDto atualizarLivro (Long id, LivroDto livroDto);
    List<LivroDto> buscarLivros ();
    List<LivroDto> buscaPorNomeLivro (String nomeLivro);
    LivroDto buscarLivroPorId (Long id);

    void deletarCliente (Long id);
}
