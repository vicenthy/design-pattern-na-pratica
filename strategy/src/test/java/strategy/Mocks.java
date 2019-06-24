package strategy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Mocks implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4899383518153065595L;
	private List<Pagamento> pagamentos;
	private List<Titular> titulares;
	
	
	public Mocks() {
		criarTitulares();
		criarPagamentos();
	}
	
	
	private void criarPagamentos(){
		pagamentos = new ArrayList<Pagamento>();
		pagamentos.add(new Pagamento(titulares.get(0), new BigDecimal(2580)));
		pagamentos.add(new Pagamento(titulares.get(5), new BigDecimal(254)));
		pagamentos.add(new Pagamento(titulares.get(7), new BigDecimal(2000)));
		
	}

	private void criarTitulares() {
		titulares = new ArrayList<Titular>();
		titulares.add(new Titular("Nome test 0", TipoBeneficio.SEM_BENEFICIO));
		titulares.add(new Titular("Nome test 1", TipoBeneficio.HERDEIRO));
		titulares.add(new Titular("Nome test 2", TipoBeneficio.HERDEIRO));
		titulares.add(new Titular("Nome test 3", TipoBeneficio.HERDEIRO));
	
		titulares.add(new Titular("Nome test 4", TipoBeneficio.CESSAO_DIREITO));
		titulares.add(new Titular("Nome test 5", TipoBeneficio.SEM_BENEFICIO));
		
		titulares.add(new Titular("Nome test 6", TipoBeneficio.PROCURACAO));
		titulares.add(new Titular("Nome test 7", TipoBeneficio.SEM_BENEFICIO));
	}


	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}


	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}


	public List<Titular> getTitulares() {
		return titulares;
	}


	public void setTitulares(List<Titular> titulares) {
		this.titulares = titulares;
	}
	
	
	
	
}
