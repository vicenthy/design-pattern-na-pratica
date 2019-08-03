package strategy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GerarRateioSemStrategy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8924270184418318559L;
	private Pagamento pagamento;

	public List<Pagamento> gerarRateio(Pagamento pagamento, List<Titular> beneficiados) {
		this.pagamento = pagamento;
		List<Pagamento> pagamentosGerados = new ArrayList<Pagamento>();
		beneficiados.forEach(beneficiado -> {
			Pagamento p = new Pagamento();
			BigDecimal valor = this.pagamento.getValor().divide(new BigDecimal(beneficiados.size()));
			if (beneficiado.getTipobeneficio().equals(TipoBeneficio.CESSAO_DIREITO)) {
				if (vefificarValidade(beneficiado)) {
					p.setTitular(beneficiado);
					p.setValor(valor);
				}
			}
			if (beneficiado.getTipobeneficio().equals(TipoBeneficio.PROCURACAO)) {
				if (vefificarValidade(beneficiado)) {
					p.setTitular(beneficiado);
					p.setValor(calcularIR(valor));
				}
			}
			if (beneficiado.getTipobeneficio().equals(TipoBeneficio.HERDEIRO)) {
				p.setTitular(beneficiado);
				p.setValor(calcularIR(valor));
			}
			pagamentosGerados.add(p);
		});
		return pagamentosGerados;
	}

	private boolean vefificarValidade(Titular beneficiado) {
		return true;
	}

	private BigDecimal calcularIR(BigDecimal valor) {
		return valor;
	}
}
