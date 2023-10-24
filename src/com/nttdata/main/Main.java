package com.nttdata.main;

import com.nttdata.interfaccia.Animale;
import com.nttdata.model.Cane;
import com.nttdata.model.Gatto;
import com.nttdata.model.Persona;

public class Main {

	public static void main(String[] args) {

		/*
		 * Interfaccia
		 */

		/*
		 * Dichiaro 3 istanze del tipo dell'interfaccia Animale. Questo significa che le
		 * 3 reference sono di tipo Animale e non, rispettivamente, di tipo Persona,
		 * Gatto, Cane. Pertanto su di esse potro' invocare solo i metodi definiti in
		 * tale interfaccia
		 */
		Animale persona = new Persona("Giulio", 21);
		Animale gatto = new Gatto("Tom", 5);
		Animale cane = new Cane("Bob", 8);

		// Implementazione di una Persona dei metodi di Animale
		persona.mangia();
		persona.verso();

		// Implementazione di un Gatto dei metodi di Animale
		gatto.mangia();
		gatto.verso();

		// Implementazione di un Cane dei metodi di Animale
		cane.mangia();
		cane.verso();

		/*
		 * Oltre a nascondere i dettagli implementativi delle mie componenti, un'altro
		 * dei vantaggi del programmare per interfaccia e non per classi concrete e'
		 * quello di avere un'omogeneita' di comportamenti all'interno delle collezioni
		 * di dati, quali ad esempio gli array
		 */
		Animale[] animali = new Animale[3];
		animali[0] = persona;
		animali[1] = gatto;
		animali[2] = cane;

		for (int i = 0; i < animali.length; i++) {
			animali[i].mangia();
		}

		/*
		 * Testo il comportamento sui metodi di default della classe Persona. Tale
		 * classe ha ridefinito il metodo "metodoDefault" e NON ha ridefinito il metodo
		 * "metodoDefault2"
		 */
		persona.metodoDefault();
		persona.metodoDefault2();
	}
}
