package com.nttdata.model;

import com.nttdata.interfaccia.Animale;

//Per implementare un'interfaccia, la sintassi e' la seguente
public class Cane implements Animale {

	private String nome;
	private int age;

	public Cane(String nome, int age) {
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
		return "Cane [nome=" + nome + ", age=" + age + "]";
	}

	// L'override dei metodi ereditati dall'implementazione dell'interfaccia Animale

	@Override
	public void mangia() {
		System.out.println("Crunch crunch");
	}

	@Override
	public void verso() {
		System.out.println("woof woof");
	}

}
