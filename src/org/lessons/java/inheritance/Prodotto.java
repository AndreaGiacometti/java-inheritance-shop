package org.lessons.java.inheritance;

import java.util.Random;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;
	
	public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
		this.codice = generaCodice();
		this.setNome(nome);
		this.setMarca(marca);
		this.setPrezzo(prezzo);
		this.setIva(iva);
	}
	
	private int generaCodice() {
		Random rand = new Random();
		return rand.nextInt(100000);
	}

	public int getCodice() {
		return this.codice;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return this.prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return this.iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	
	private double calcoloIva() {
		return this.prezzo + (this.prezzo * this.iva);
	}
	
	public double getPrezzoIvato() {
		BigDecimal bigDecimal = BigDecimal.valueOf(calcoloIva());
	    BigDecimal rounded = bigDecimal.setScale(2, RoundingMode.HALF_UP);
		return rounded.doubleValue();
	}
	
	public String toString() {
		return "Codice: " + getCodice()
		+ "\nNome: " + getNome()
		+ "\nDescrizione: " + getMarca()
		+ "\nPrezzo: " + getPrezzo() + "€"
		+ "\nIVA: " + getIva()
        + "\nPrezzo Ivato: " + getPrezzoIvato() + "€";
	}
}
