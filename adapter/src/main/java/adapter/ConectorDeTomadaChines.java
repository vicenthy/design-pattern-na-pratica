package adapter;

import java.util.logging.Logger;

public class ConectorDeTomadaChines implements AdaptadorDeTomada {
	private static final Logger log = Logger.getLogger(ConectorDeTomadaChines.class.getName());

	
	public void conectarETransmitir() {
		log.info("TRANSMITINDO ENERGIA PELO CONECTOR CHINES");
	}

	public void desconectar() {
		log.info("DESLIGADO!");
	}
	

}
