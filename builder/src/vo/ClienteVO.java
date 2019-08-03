package vo;

import java.time.LocalDate;

public class ClienteVO {

	
	
	private Integer id;
	private String nome;
	private LocalDate nascimento;
	private boolean ativo;
	private TipoPessoa tipopessoa;
	
	
	public ClienteVO() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public LocalDate getNascimento() {
		return nascimento;
	}


	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	public TipoPessoa getTipopessoa() {
		return tipopessoa;
	}


	public void setTipopessoa(TipoPessoa tipopessoa) {
		this.tipopessoa = tipopessoa;
	}


	@Override
	public String toString() {
		return "ClienteVO [id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + ", ativo=" + ativo
				+ ", tipopessoa=" + tipopessoa + "]";
	}
	
	
	
	
	
	
}
