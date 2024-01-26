package br.com.biblioteca.restfullwithspringcrudcompletopagination.controllers;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.dtos.LivroDto;
import br.com.biblioteca.restfullwithspringcrudcompletopagination.models.Livro;
import br.com.biblioteca.restfullwithspringcrudcompletopagination.services.LivroService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    private LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<LivroDto> cadastroLivro (@RequestBody LivroDto livroDto) throws URISyntaxException {
        LivroDto respostaLivroDto = livroService.cadastroLivro(livroDto);
        return ResponseEntity.created(new URI("/livro/cadastro")).body(respostaLivroDto);
    }

    @PutMapping("/alterar-cadastro/{id}")
    public ResponseEntity<LivroDto> atualizarCadastroLivro (@PathVariable Long id, @RequestBody LivroDto livroDto){
        LivroDto respostaLivroDto = livroService.atualizarLivro(id,livroDto);
        return ResponseEntity.ok(respostaLivroDto);
    }

    @PutMapping("/adicionar-quantidade/{id}/")
    public ResponseEntity<LivroDto> adicionarQuantidade (@PathVariable Long id, @RequestParam int quantidade){
        LivroDto respostaLivroDto = livroService.adicionarQuantidade(id,quantidade);
        return ResponseEntity.ok(respostaLivroDto);
    }

    @GetMapping("/buscar-livros")
    public ResponseEntity<List<LivroDto>> buscarLivros (){
        List<LivroDto> respostaLivrosDto = livroService.buscarLivros();
        return ResponseEntity.ok(respostaLivrosDto);
    }
    @GetMapping("/buscar-livro/{id}")
    public ResponseEntity<LivroDto> buscarLivro (@PathVariable Long id){
        LivroDto respostaLivrosDto = livroService.buscarLivroPorId(id);
        return ResponseEntity.ok(respostaLivrosDto);
    }
    @GetMapping("/buscar-livro/nome")
    public ResponseEntity <Page<String>> buscarNomeLivro (@RequestParam String nomeLivro, Pageable pageable){
        Page<String> respostaLivrosDto = livroService.buscaPorNomeLivro(nomeLivro, pageable);
        return ResponseEntity.ok(respostaLivrosDto);
    }

    @DeleteMapping("/remover-livro/{id}")
    public ResponseEntity<LivroDto> removerLivro (@PathVariable Long id){
        livroService.deletarCliente(id);
        return ResponseEntity.noContent().build();
    }


}
