package br.com.biblioteca.restfullwithspringcrudcompletopagination.services;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.dtos.LivroDto;

import java.util.List;

public interface LivroService {

    LivroDto cadastroLivro (LivroDto livroDto);
    LivroDto atualizarLivro (Long id, LivroDto livroDto);
    List<LivroDto> buscarLivros ();
    void deletarCliente (Long id);
}
