

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
			EletronicoChines eletronico1 = new EletronicoChines(tomadaChinesa);
			eletronico1.ligar();
			eletronico1.desligar();
	

			Tomada tomadaBrasileira = new TomadaBrasileira(new ConectorDeTomadaBrasileiro());
			EletronicoChines eletronico2 = new EletronicoChines(tomadaBrasileira);
			eletronico2.ligar();
			eletronico2.desligar();

			log.info("FIM");
			
			
			
	}
}
