package br.com.biblioteca.restfullwithspringcrudcompletopagination.controllers;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.dtos.LivroDto;
import br.com.biblioteca.restfullwithspringcrudcompletopagination.services.LivroService;
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

    @PostMapping("/cadastro")
    public ResponseEntity<LivroDto> cadastroLivro (@RequestBody LivroDto livroDto) throws URISyntaxException {
        LivroDto respostaLivroDto = livroService.cadastroLivro(livroDto);
        return ResponseEntity.created(new URI("/livro/cadastro")).body(respostaLivroDto);
    }

    @PutMapping("/alterar-cadastro/{id}")
    public ResponseEntity<LivroDto> atualizarCadastroLivro (@PathVariable Long id, @RequestBody LivroDto livroDto){
        LivroDto respostaLivroDto = livroService.atualizarLivro(id,livroDto);
        return ResponseEntity.ok(respostaLivroDto);
    }

    @GetMapping("livros")
    public ResponseEntity<List<LivroDto>> livrosCadastrados (){
        List<LivroDto> respostaLivrosDto = livroService.buscarLivros();
        return ResponseEntity.ok(respostaLivrosDto);
    }

    @DeleteMapping("remover-livro")
    public ResponseEntity<LivroDto> removerLivro (@PathVariable Long id){
        livroService.deletarCliente(id);
        return ResponseEntity.noContent().build();
    }
}
