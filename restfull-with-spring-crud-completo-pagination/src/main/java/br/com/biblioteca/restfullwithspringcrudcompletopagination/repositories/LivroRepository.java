package br.com.biblioteca.restfullwithspringcrudcompletopagination.repositories;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
