package one.matheussantos.gof;

import one.matheussantos.gof.facade.Facade;
import one.matheussantos.gof.singleton.SingletonEager;
import one.matheussantos.gof.singleton.SingletonLazy;
import one.matheussantos.gof.singleton.SingletonLazyHolder;
import one.matheussantos.gof.strategy.Comportamento;
import one.matheussantos.gof.strategy.ComportamentoAgressivo;
import one.matheussantos.gof.strategy.ComportamentoDefensivo;
import one.matheussantos.gof.strategy.ComportamentoNormal;
import one.matheussantos.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}
