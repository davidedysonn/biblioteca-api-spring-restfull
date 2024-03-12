package br.com.biblioteca.restfullwithspringcrudcompletopagination.controllers;

import br.com.biblioteca.restfullwithspringcrudcompletopagination.dtos.LivroDto;
import br.com.biblioteca.restfullwithspringcrudcompletopagination.services.LivroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private final Logger log = LoggerFactory.getLogger(LivroController.class);

    private LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping("")
    public ResponseEntity<LivroDto> cadastroLivro (@RequestBody LivroDto livroDto) throws URISyntaxException {
        LivroDto respostaLivroDto = livroService.cadastroLivro(livroDto);
        log.debug("Cadastro criado com sucesso");
        return ResponseEntity.created(new URI("/livro/cadastro")).body(respostaLivroDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LivroDto> atualizarCadastroLivro (@PathVariable Long id, @RequestBody LivroDto livroDto){
        LivroDto respostaLivroDto = livroService.atualizarLivro(id,livroDto);
        log.debug("Livro atualizado com sucesso");
        return ResponseEntity.ok(respostaLivroDto);
    }

    @PutMapping("/quantidade/{id}/")
    public ResponseEntity<LivroDto> adicionarQuantidade (@PathVariable Long id, @RequestParam int quantidade){
        LivroDto respostaLivroDto = livroService.adicionarQuantidade(id,quantidade);

        return ResponseEntity.ok(respostaLivroDto);
    }

    @GetMapping("")
    public ResponseEntity<List<LivroDto>> buscarTodosOsLivros (){
        List<LivroDto> respostaLivrosDto = livroService.buscarLivros();
        return ResponseEntity.ok(respostaLivrosDto);
    }
    @GetMapping("/{id}")
    public ResponseEntity<LivroDto> buscarLivro (@PathVariable Long id){
        LivroDto respostaLivrosDto = livroService.buscarLivroPorId(id);
        return ResponseEntity.ok(respostaLivrosDto);
    }
    @GetMapping("/nome")
    public ResponseEntity <Page<String>> buscarNomeLivro (@RequestParam String nomeLivro, Pageable pageable){
        Page<String> respostaLivrosDto = livroService.buscaPorNomeLivro(nomeLivro, pageable);
        return ResponseEntity.ok(respostaLivrosDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<LivroDto> removerLivro (@PathVariable Long id){
        livroService.deletarCliente(id);
        return ResponseEntity.noContent().build();
    }


}
