package strategy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class GerarRateioComStrategyTest extends TestCase{
	
	
	private GerarRateioComStrategy rateio;
	private Mocks mocks;
	
	
	@Override
	protected void setUp() throws Exception {
		mocks = new Mocks();
		rateio = new GerarRateioComStrategy();
	}
	


	public void testsetup() {
		assertTrue(mocks.getTitulares().size() > 0);
		assertTrue(mocks.getPagamentos().size() > 0);
	}

	
	

	public void testgerarRateioHerdeiro() {
		List<Titular> subList = mocks.getTitulares().subList(1, 4);
		List<Pagamento> pagamentosResult = rateio.gerarRateio(mocks.getPagamentos().get(0), subList);
		assertEquals(subList.size(), pagamentosResult.size());
		assertEquals(mocks.getPagamentos().get(0).getValor(), pagamentosResult.stream().map(a -> a.getValor()).reduce(BigDecimal::add).get() );
		pagamentosResult.forEach(a -> {
			System.out.println(a.getTitular().getNome() + "   -> " + a.getValor());
		});
	}
	
	
	public void testgerarRateioCessaoDireito() {
		List<Titular> subList = Arrays.asList(mocks.getTitulares().get(4));
		List<Pagamento> pagamentosResult = rateio.gerarRateio(mocks.getPagamentos().get(1), subList);
		assertEquals(subList.size(), pagamentosResult.size());
		assertEquals(mocks.getPagamentos().get(1).getValor(), pagamentosResult.stream().map(a -> a.getValor()).reduce(BigDecimal::add).get() );
		pagamentosResult.forEach(a -> {
			System.out.println(a.getTitular().getNome() + "   -> " + a.getValor());
		});
		
	}
	
	
	public void testgerarRateioCessaoProcuracao() {
		List<Titular> subList = Arrays.asList(mocks.getTitulares().get(6));
		List<Pagamento> pagamentosResult = rateio.gerarRateio(mocks.getPagamentos().get(2), subList);
		assertEquals(subList.size(), pagamentosResult.size());
		assertEquals(mocks.getPagamentos().get(2).getValor(), pagamentosResult.stream().map(a -> a.getValor()).reduce(BigDecimal::add).get() );
		pagamentosResult.forEach(a -> {
			System.out.println(a.getTitular().getNome() + "   -> " + a.getValor());
		});
	}
}
