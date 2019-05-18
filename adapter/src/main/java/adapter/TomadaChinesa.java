package adapter;

import java.util.logging.Logger;

public class TomadaChinesa implements Tomada{

	private static final Logger log = Logger.getLogger(TomadaChinesa.class.getName());


	public TomadaChinesa() {
	
	}
	
	
	
	public void conectarETransmitir(AdaptadorDeTomada plug ) {
		log.info("CONECTADO!");
		plug.conectarETransmitir();
	}
	public void desconectar(AdaptadorDeTomada plug ) {
		log.info("DESCONECTANDO...");
		plug.desconectar();
	}
	
	
}
