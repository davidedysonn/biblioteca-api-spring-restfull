package br.com.biblioteca.restfullwithspringcrudcompletopagination.services.servicesimpl;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.dtos.LivroDto;
import br.com.biblioteca.restfullwithspringcrudcompletopagination.mapper.LivroMapper;
import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.Livro;
import br.com.biblioteca.restfullwithspringcrudcompletopagination.repositories.LivroRepository;
import br.com.biblioteca.restfullwithspringcrudcompletopagination.services.LivroService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LivroServiceImpl implements LivroService {

    private final LivroRepository livroRepository;
    private final LivroMapper livroMapper;

    public LivroServiceImpl(LivroRepository livroRepository, LivroMapper livroMapper) {
        this.livroRepository = livroRepository;
        this.livroMapper = livroMapper;
    }

    @Override
    public LivroDto cadastroLivro(LivroDto livroDto) {
        Livro livro = livroMapper.toEntity(livroDto);
        Livro livro2 = livroRepository.save(livro);
        LivroDto respostaLivroDto = livroMapper.toDto(livro2);
        return respostaLivroDto;
    }

    @Override
    public LivroDto atualizarLivro(Long id, LivroDto livroDto) {
        Optional<Livro> verificarLivro = livroRepository.findById(id);
        if(!verificarLivro.isEmpty() && verificarLivro != null){
            Livro livroEntity = verificarLivro.get();
            livroEntity.setNomeLivro(livroDto.getNomeLivro());
            livroEntity.setAutor(livroDto.getAutor());
            livroEntity.setGeneros(livroDto.getGeneros());
            livroEntity.setDataLancamento(livroDto.getDataLancamento());

            LivroDto retornoDto = livroMapper.toDto(livroRepository.save(livroEntity));
            return retornoDto;
        }
        else {
            //Lembra de fazer tratamento de erros aqui
            return null;
        }

    }

    @Override
    public LivroDto adicionarQuantidade(Long id, int quantidade) {
        Optional<Livro> verificarLivro = livroRepository.findById(id);
        if(!verificarLivro.isEmpty() && verificarLivro != null){
            Livro livroEntity = verificarLivro.get();
            livroEntity.setQuantidade(livroEntity.getQuantidade() + quantidade);
            LivroDto retornoDto = livroMapper.toDto(livroRepository.save(livroEntity));
            return retornoDto;
        }
        else {
            //Lembra de fazer tratamento de erros aqui
            return null;
        }
    }

    @Override
    public List<LivroDto> buscarLivros() {
        List<Livro> livros = livroRepository.findAll();
        List<LivroDto> retornoLivros = new ArrayList<>();
        for(Livro livro: livros){
            retornoLivros.add(livroMapper.toDto(livro));
        }

        return retornoLivros;
    }

    @Override
    public Page<String> buscaPorNomeLivro(String nomeLivro, Pageable pageable) {
        Page<String> livroEnt = livroRepository.buscarLivroPorNome(nomeLivro, pageable);
        return livroEnt;
    }

    @Override
    public LivroDto buscarLivroPorId (Long id) {
        Optional<Livro> livro = livroRepository.findById(id);
        if(!livro.isEmpty() && livro != null){
            Livro livroEntity = livro.get();
            LivroDto livroDto = livroMapper.toDto(livroEntity);
            return livroDto;
        }else {
            // fazer tratamento de erro
            return null;
        }


    }




    @Override
    public void deletarCliente(Long id) {
        Optional<Livro> verificarLivro = livroRepository.findById(id);
        if(!verificarLivro.isEmpty() || verificarLivro.equals("")){
            livroRepository.deleteById(id);
        }
        //Lembra de fazer tratamento de erros aqui
        //tem que verificar se foi possivel deletar


    }
}
