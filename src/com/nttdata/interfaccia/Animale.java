package com.nttdata.interfaccia;

public interface Animale {

	/*
	 * Nell'interfaccia, tipicamente, e' presente un elenco di metodi. Questi metodi
	 * NON sono implementati, ma soltanto dichiarati. Tutti i metodi dichiarati
	 * all'interno di un'interfaccia sono sia public che abstract. Un metodo
	 * abstract e' un metodo che non presenta un'implementazione concreta (il corpo
	 * contenente le istruzioni), ma la delega a chi implementera' l'interfaccia. In
	 * quanto implicitamente public ed abstract, nell'interfaccia possiamo
	 * dichiarare i metodi omettendo questi elementi:
	 */

	void mangia();

	void verso();

	/*
	 * Inoltre, dalla versione 8 di Java in poi, nelle interfacce e' possibile anche
	 * dichiarare e IMPLEMENTARE dei metodi usando il modificatore "default". Come
	 * ci aspettiamo, l'implementazione di tali metodi e' ereditata dalle classi che
	 * implementano l'interfaccia. Tuttavia e' possibile ridefinire il comportamento
	 * facendone l'override
	 */

	default void metodoDefault() {
		System.out.println("Sono metodoDefault dell'interfaccia");
	}

	default void metodoDefault2() {
		System.out.println("Sono metodoDefault2 dell'interfaccia");
	}

}
