package programacaoestruturada;

import br.com.springboot.model.Pessoa;
import br.com.springboot.model.Telefone;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //Declarar as variaveis
        String nome = "Marilainny";
        char inicial = 'M';
        int idade = 37;
        float altura = (float) 1.57;

        //PROGRAMAÇÃO ESTRUTURADA

        //imprimir no console
        System.out.println("Nome :"+nome);
        System.out.println("Nome :"+idade);
        System.out.println("Nome :"+altura);
        System.out.println("Nome :"+inicial);

        //IF - ESTRUTURA DE DECISÃO
        if(idade > 18){
            System.out.println(nome+" é maior de idade.");
        }else{
            System.out.println(nome+" é menor de idade.");
        }

        //NEGAÇÃO
        if(!nome.equals("Marilainny Martins")){
            System.out.println("Não é o aluno!");
        }

        //WHILE - ESTRUTURA DE REPETIÇÃO - usado mais JBDC
        int contador = idade + 1;

        while (contador <= 40){
            System.out.println("Aniversário de "+contador);
            contador++;
        }

        //FOR - ESTRUTURA DE REPETIÇÃO
        for (int i =0; i < idade/2; i++){
            System.out.println("FOR contador..:"+i);
        }

        //PROGRAMAÇÃO ORIENTADA A OBJETO

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

    }
}
