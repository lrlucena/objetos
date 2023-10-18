package aulas.aula04.poo;

import aulas.aula04.poo.escolar.Pessoa;
//import aulas.aula04.poo.escolar.Endereco;

public class Principal {
  //aulas.aula04.poo.escolar.Pessoa p;
  
  public static void main(String[] args) {
    Pessoa p = new Pessoa("Joao");
    var end = p.getEndereco();
    p.getEndereco().setCidade("Natal");
    System.out.println(end);
    end.getCidade();
  }
}
