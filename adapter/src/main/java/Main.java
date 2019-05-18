

import java.util.logging.Logger;

import adapter.EletronicoChines;
import adapter.TomadaBrasileira;
import adapter.TomadaChinesa;

public class Main {

	private static final Logger log = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
			
		TomadaChinesa tomadaChinesa = new TomadaChinesa();
			EletronicoChines eletronico1 = new EletronicoChines(tomadaChinesa);
			eletronico1.ligar();
			eletronico1.desligar();
	

		TomadaBrasileira tomadaBrasileira = new TomadaBrasileira();
			EletronicoChines eletronico2 = new EletronicoChines(tomadaBrasileira);
			eletronico2.ligar();
			eletronico2.desligar();

			log.info("FIM");
			
			
			
	}
}
