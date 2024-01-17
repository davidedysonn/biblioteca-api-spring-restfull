package br.com.biblioteca.restfullwithspringcrudcompletopagination.mapper;

import java.util.List;

/**
 Contrato de forma generica.
 *   @param <D> - Parametro tipo DTO.
 *   @param <E> - Parametro tipo Entidade
 */
public interface GeralMapper <D, E>{

    E toEntity (D dto);
    D toDto (E entity);
    List<E> listToEntity (List<D> dtoList);
    List<D> listToDto (List<E> entityList);

//    @Named("partialUpdate")
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    void partialUpdate(@MappingTarget E entity, D dto);
}
