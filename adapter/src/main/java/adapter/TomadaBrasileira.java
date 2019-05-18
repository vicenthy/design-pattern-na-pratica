package adapter;

import java.util.logging.Logger;

public class TomadaBrasileira  implements Tomada{
	private static final Logger log = Logger.getLogger(TomadaBrasileira.class.getName());
	private AdaptadorDeTomada plug;



	public TomadaBrasileira(AdaptadorDeTomada plug) {
		this.plug = plug;
	
	}
	
	
	public void conectarETransmitir() {
		log.info("TRANSMITINDO ENERGIA PELA TOMADA BRASILEIRA");
		plug.conectarETransmitir();
	}

	public void desconectar() {
		log.info("DESLIGADO!");
		plug.desconectar();
	}
	
}
