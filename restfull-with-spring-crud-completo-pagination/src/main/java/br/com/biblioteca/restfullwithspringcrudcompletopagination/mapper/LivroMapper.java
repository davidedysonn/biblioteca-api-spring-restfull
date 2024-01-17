package br.com.biblioteca.restfullwithspringcrudcompletopagination.mapper;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.dtos.LivroDto;
import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.Livro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface LivroMapper extends GeralMapper<LivroDto, Livro>{
}
