package adapter;

import java.util.logging.Logger;

public class ConectorDeTomadaBrasileiro {
	private static final Logger log = Logger.getLogger(ConectorDeTomadaBrasileiro.class.getName());
	public void conectarETransmitir() {
		log.info("TRANSMITINDO DE : " + ConectorDeTomadaBrasileiro.class.getSimpleName());
	}
}
