package adapter;

import java.util.logging.Logger;

public class TomadaBrasileira  implements Tomada{
	private static final Logger log = Logger.getLogger(TomadaBrasileira.class.getName());



	public TomadaBrasileira() {
	
	}
	
	
	public void conectarETransmitir(AdaptadorDeTomada plug) {
		log.info("TRANSMITINDO ENERGIA PELA TOMADA BRASILEIRA");
		plug.conectarETransmitir();
	}

	public void desconectar(AdaptadorDeTomada plug) {
		log.info("DESLIGADO!");
		plug.desconectar();
	}
	
}
