package br.com.springboot.service;
/**
 * São classes que representam ações, comportamentos;
 * implementando toda a lógica da aplicação nesses comportamentos,
 * ao mesmo em que faz uso de DAOs,
 * Regras.
 */

import br.com.springboot.model.Pessoa;
import br.com.springboot.model.Telefone;
import br.com.springboot.repository.PessoaRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    //Cria um objeto PessoaRepository para salvar os dados no banco.
    PessoaRepository repository = new PessoaRepository();

    //Método para encontrar pessoa pelo ID que será usado na VendaService
    public Pessoa findById(Long id){
        return null;
    }

    public Pessoa save(Pessoa pessoaSave){

        //As regras são colocadas no PessoaService, exemplo básico.

        //Criar o objeto Pessoa
        Pessoa pessoa = new Pessoa();

        //Setar os parâmetros
        pessoa.setNome("Marilainny");
        pessoa.setIdade(37);
        pessoa.setAltura(BigDecimal.valueOf(1.74));

        //Criar o objeto Telefone
        Telefone telefoneCelular = new Telefone("Celular", "62 98641-0067");
        Telefone telefoneResidencial = new Telefone("Residencial", "62 3233-0000");
        Telefone telefoneComercial = new Telefone("Comercial", "0800-9000");

        //Criar uma lista de telefones
        List<Telefone> telefone = new ArrayList<>();
        telefone.add(telefoneCelular);
        telefone.add(telefoneResidencial);
        telefone.add(telefoneComercial);

        //Seta a lista de telefone em pessoa
        pessoa.setTelefone(telefone);

        //Imprimir
        System.out.println(pessoa.toString());

        //FOR ler a lista
        for(int i =0; i < pessoa.getTelefone().size(); i++){
            System.out.println("For >: "+pessoa.getTelefone().get(i).getTelefone());
        }

        //FOREACH
        for(Telefone item : pessoa.getTelefone()){
            System.out.println("Foreach : "+item.getTelefone());
        }

        //REMOVER
        pessoa.getTelefone().remove(1); //remover pelo index
        pessoa.getTelefone().remove(telefoneComercial);//remover pelo objeto

        //FOREACH
        for(Telefone item : pessoa.getTelefone()){
            System.out.println("Tipo: "+item.getTipoTelefone());
            System.out.println("Fone: "+item.getTelefone());
        }

        //salvar o objeto pessoa partir do repository
        return repository.save(pessoa);
    }
}
