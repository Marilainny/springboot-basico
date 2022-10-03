package br.com.springboot.controller;

import br.com.springboot.model.Pessoa;
import br.com.springboot.service.PessoaService;

/**
 * Controle é o componente faz a mediação da entrada e saída,
 * comandando a visão, o service e o model.
 */

public class PessoaController {

    // Faz uma ponte com o PessoaService para salvar os dados da Views.
    public void save(Pessoa pessoa){
        PessoaService pessoaService = new PessoaService();
        pessoaService.save(pessoa);
    }
}
