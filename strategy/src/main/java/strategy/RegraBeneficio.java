package strategy;

import java.math.BigDecimal;

public interface RegraBeneficio {
	
	BigDecimal calcular(BigDecimal valor, Contrato contratoValido);
	
}
