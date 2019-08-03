package strategy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GerarRateioComStrategy implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6408584019702861106L;
	private Pagamento pagamento;

	
	public List<Pagamento> gerarRateio(Pagamento pagamento, List<Titular> beneficiados) {
		this.pagamento = pagamento;
		List<Pagamento> pagamentosGerados = new ArrayList<Pagamento>();
		beneficiados.forEach(beneficiado -> {
			Pagamento p = new Pagamento();
			BigDecimal valor = this.pagamento.getValor().divide(new BigDecimal(beneficiados.size()));
					p.setTitular(beneficiado);
					p.setValor(beneficiado.getTipobeneficio().calcular(valor, beneficiado.getContrato()));
			pagamentosGerados.add(p);
		});
		return pagamentosGerados;
	}



}
