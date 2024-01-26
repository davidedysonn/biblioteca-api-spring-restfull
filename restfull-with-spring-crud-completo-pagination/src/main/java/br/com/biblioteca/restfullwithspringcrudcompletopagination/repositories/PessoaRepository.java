package br.com.biblioteca.restfullwithspringcrudcompletopagination.repositories;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
