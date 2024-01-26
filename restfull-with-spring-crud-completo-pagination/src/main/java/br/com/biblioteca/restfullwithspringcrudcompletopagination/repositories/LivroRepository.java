package br.com.biblioteca.restfullwithspringcrudcompletopagination.repositories;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.Livro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

//    @Query(value="select n from livro n where nome_livro like concat('%', ?1, '%')", nativeQuery = true)
    @Query(value="select nome_livro from livro where nome_livro like concat('%', ?1, '%')", nativeQuery = true)
    Page<String> buscarLivroPorNome(String nomeLivro, Pageable pageable);


}
