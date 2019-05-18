package adapter;

import java.util.logging.Logger;

public class TomadaChinesa implements Tomada{

	private static final Logger log = Logger.getLogger(TomadaChinesa.class.getName());
	private AdaptadorDeTomada plug;


	public TomadaChinesa(AdaptadorDeTomada plug) {
		this.plug = plug;
	
	}
	
	
	
	public void conectarETransmitir() {
		log.info("TRANSMITINDO ENERGIA PELA TOMADA CHINESA");
		plug.conectarETransmitir();
	}

	public void desconectar() {
		log.info("DESLIGADO!");
		plug.desconectar();
	}

	
}
