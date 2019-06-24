package strategy;

import java.math.BigDecimal;

public enum TipoBeneficio implements RegraBeneficio {

	SEM_BENEFICIO {
		@Override
		public BigDecimal calcular(BigDecimal valor, Contrato contrato) {
			return calcularIR(valor);
		}
	},
	HERDEIRO {
		@Override
		public BigDecimal calcular(BigDecimal valor, Contrato contrato) {
			if (isValid(contrato))
				return calcularIR(valor);
			else
				return BigDecimal.ZERO;

		}

	},
	CESSAO_DIREITO {
		@Override
		public BigDecimal calcular(BigDecimal valor, Contrato contrato) {
			if (isValid(contrato))
				return valor;
			else
				return BigDecimal.ZERO;

		}

	},
	PROCURACAO {
		@Override
		public BigDecimal calcular(BigDecimal valor, Contrato contrato) {
			if (isValid(contrato))
				return calcularIR(valor);
			else
				return BigDecimal.ZERO;
		}
	};

	public static boolean isValid(Contrato beneficiado) {
		return true;
	}

	private static BigDecimal calcularIR(BigDecimal valor) {
		return valor;
	}

}
