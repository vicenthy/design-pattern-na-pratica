package strategy;


public class App 
{
    public static void main( String[] args )
    {
    	Titular titular = new Titular();
    	titular.setId(1);
    	titular.setNome("Nome Teste 01");
    	titular.setTipobeneficio(TipoBeneficio.SEM_BENEFICIO);
    }
}
