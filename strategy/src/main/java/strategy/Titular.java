package strategy;

import java.io.Serializable;

public class Titular implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1976702178995465721L;
	private Integer id;
	private String nome;
	private TipoBeneficio tipobeneficio;
	private Contrato contrato;
	
	
	
	public Titular() {

	}
	
	
	
	public Titular(String nome, TipoBeneficio tipobeneficio) {
		this.nome = nome;
		this.tipobeneficio = tipobeneficio;
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
	public TipoBeneficio getTipobeneficio() {
		return tipobeneficio;
	}
	public void setTipobeneficio(TipoBeneficio tipobeneficio) {
		this.tipobeneficio = tipobeneficio;
	}
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	
	
	
	
}
