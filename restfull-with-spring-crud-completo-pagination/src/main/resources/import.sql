--Cadastro de livro
insert into livro(id_livro, nome_livro, autor, generos, data_lancamento, quantidade)
values(1, 'O MORRO DOS VENTOS UIVANTES', 'EMILY BRONTË', ARRAY ['ROMANCE', 'TRAGEDIA'], '2024-12-01', 5)

--Cadastro de pessoa
insert into pessoa(id, nome, sexo, endereco, tipo_autorizacao, banido)
values(1, 'CARLOS', 'MASCULINO', 'RUA 25 QUADRA 10', 'ALUNO', FALSE)

--Tabela Referencia
insert into livros_pessoas(id_livros, id_pessoa) values(1,1)