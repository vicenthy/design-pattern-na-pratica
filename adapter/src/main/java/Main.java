

import java.util.logging.Logger;

import adapter.ConectorDeTomadaBrasileiro;
import adapter.ConectorDeTomadaChines;
import adapter.EletronicoChines;
import adapter.Tomada;
import adapter.TomadaBrasileira;
import adapter.TomadaChinesa;

public class Main {

	private static final Logger log = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
			
			Tomada tomadaChinesa = new TomadaChinesa(new ConectorDeTomadaChines());
			EletronicoChines eletronico = new EletronicoChines(tomadaChinesa);
	
			eletronico.ligar();
			eletronico.desligar();
	

			Tomada tomadaBrasileira = new TomadaBrasileira(new ConectorDeTomadaBrasileiro());
			eletronico = new EletronicoChines(tomadaBrasileira);
			eletronico.ligar();
			eletronico.desligar();
			log.info("FIM");
			
			
			
	}
}
