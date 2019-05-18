package adapter;

import java.util.logging.Logger;

public class ConectorDeTomadaBrasileiro implements AdaptadorDeTomada{
	private static final Logger log = Logger.getLogger(ConectorDeTomadaBrasileiro.class.getName());


	public void conectarETransmitir() {
		log.info("TRANSMITINDO ENERGIA PELO CONECTOR BRASILEIRO");
	}

	public void desconectar() {
		log.info("DESLIGADO!");
	}
}
