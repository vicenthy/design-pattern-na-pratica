package adapter;

import java.util.logging.Logger;

public class EletronicoChines {
	
	private static final Logger log = Logger.getLogger(EletronicoChines.class.getName());

	private AdaptadorDeTomada plug;

	private Tomada tomada;
	
	public EletronicoChines(Tomada tomada) {
		this.tomada = tomada;
		setPlug(new ConectorDeTomadaChines());
	}
	

	public void ligar() {
			tomada.conectarETransmitir(getPlug());
			log.info("LIGADO!");
	}
	

	public void desligar() {
		tomada.desconectar(getPlug());
	}




	public AdaptadorDeTomada getPlug() {
		return plug;
	}
	public void setPlug(AdaptadorDeTomada plug) {
		this.plug = plug;
	}
	
	
	
	
}
