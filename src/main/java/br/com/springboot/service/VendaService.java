package br.com.springboot.service;
/**
 * Service se comunicar com service.
 * VendaService comunica com VendaRepository;
 * mas não comunica com PessoaRepository;
 * Service classe de negócio;
 * Repository classe comunica com o banco;
 */

import br.com.springboot.model.Pessoa;

public class VendaService {

    private PessoaService pessoaService;

    //VendaService vai fazer uma ponte com a PessoaService pelo ID.
    public void save(){
        Pessoa pessoa = pessoaService.findById(1L);
    }

}
