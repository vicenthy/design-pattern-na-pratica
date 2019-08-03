package strategy;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pagamento implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6783341891232814034L;
	private Integer id;
	private Titular titular;
	private BigDecimal valor;



	public Pagamento() {
		// TODO Auto-generated constructor stub
	}

	
	
	


	public Pagamento(Titular titular, BigDecimal valor) {
		super();
		this.titular = titular;
		this.valor = valor;
	}






	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Titular getTitular() {
		return titular;
	}



	public void setTitular(Titular titular) {
		this.titular = titular;
	}



	public BigDecimal getValor() {
		return valor;
	}



	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	

}
