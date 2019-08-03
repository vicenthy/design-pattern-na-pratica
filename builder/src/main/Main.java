package main;

import java.time.LocalDate;

import builder.builder.ClienteVOBuilder;
import vo.ClienteVO;
import vo.TipoPessoa;

public class Main {

	public static void main(String[] args) {
		ClienteVO vo = new ClienteVOBuilder()
							.id(1)
							.ativo(true)
							.nascimento(LocalDate.of(1989, 3, 3))
							.nome("Atila Augusto dos santos")
							.tipopessoae(TipoPessoa.FISICA)
							.build();
		
	System.out.println(vo);
	
	}
}
