package br.com.biblioteca.restfullwithspringcrudcompletopagination.repositories;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {

//    @Query(value="select n from livro n where nome_livro like concat('%', ?1, '%')", nativeQuery = true)
    @Query(value="select nome_livro from livro where nome_livro like concat('%', ?1, '%')", nativeQuery = true)
    List<String> buscarLivroPorNome(String nomeLivro);
}
