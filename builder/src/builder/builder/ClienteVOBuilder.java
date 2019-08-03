package builder.builder;

import java.time.LocalDate;

import vo.ClienteVO;
import vo.TipoPessoa;

public class ClienteVOBuilder implements Builder<ClienteVO>{

	
	private ClienteVO instance;
	
	
	public ClienteVOBuilder() {
		this.instance = new ClienteVO();
	}
	
	public ClienteVOBuilder nome(String nome) {
		this.instance.setNome(nome);
		return this;
	}

	public ClienteVOBuilder nascimento(LocalDate nascimento) {
		this.instance.setNascimento(nascimento);
		return this;
	}
	public ClienteVOBuilder ativo(boolean ativo) {
		this.instance.setAtivo(ativo);
		return this;
	}
	public ClienteVOBuilder tipopessoae(TipoPessoa tipopessoa) {
		this.instance.setTipopessoa(tipopessoa);
		return this;
	}
	public ClienteVOBuilder id(Integer id) {
		this.instance.setId(id);
		return this;
	}
		
	@Override
	public ClienteVO build() {
		return this.instance;
	}

}
