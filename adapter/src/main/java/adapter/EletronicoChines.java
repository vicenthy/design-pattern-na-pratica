package adapter;

import java.util.logging.Logger;

public class EletronicoChines {
	
	private static final Logger log = Logger.getLogger(EletronicoChines.class.getName());

	private AdaptadorDeTomada plug;
	private Tomada tomada;

	
	public EletronicoChines(Tomada tomada) {
		this.tomada = tomada;
	}
	

	public void ligar() {
			tomada.conectarETransmitir();
			log.info("LIGADO!");
	}
	

	public void desligar() {
		tomada.desconectar();
	}




	public AdaptadorDeTomada getPlug() {
		return plug;
	}
	public void setPlug(AdaptadorDeTomada plug) {
		this.plug = plug;
	}
	
	
	
	
}
