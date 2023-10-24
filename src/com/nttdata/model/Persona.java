package com.nttdata.model;

import com.nttdata.interfaccia.Animale;

// Per implementare un'interfaccia, la sintassi e' la seguente
public class Persona implements Animale {

	private String nome;
	private int age;

	public Persona(String nome, int age) {
		this.nome = nome;
		this.age = age;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", age=" + age + "]";
	}

	public void metodoEsclusivoDiPersona() {
		System.out.println("Metodo esclusivo di Persona");
	}

	// L'override dei metodi ereditati dall'implementazione dell'interfaccia Animale

	@Override
	public void mangia() {
		System.out.println("La persona mangia");
	}

	@Override
	public void verso() {
		System.out.println("Bla bla bla");
	}

	@Override
	public void metodoDefault() {
		System.out.println("Sono metodoDefault ridefinito da Persona");
	}

}
