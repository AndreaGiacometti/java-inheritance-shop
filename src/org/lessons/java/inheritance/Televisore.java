package org.lessons.java.inheritance;

import java.util.Random;

public class Televisore extends Prodotto {
	private int dimensione;
	private boolean smartTv;
	
	public Televisore (int codice, String nome, String marca, double prezzo, double iva, int dimensione, boolean smartTv) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensione = generaDimensione();
		this.setSmartTv(smartTv);
	}

	public int getDimensione() {
		return this.dimensione;
	}

	public boolean getSmartTv() {
		return this.smartTv;
	}

	public void setSmartTv(boolean smartTv) {
		this.smartTv = smartTv;
	}
	
	private int generaDimensione() {
		Random rand = new Random();
		int min = 40;
		int max = 90;
		return rand.nextInt(max - min + 1) + min;
	}
	
	public String convertBoolean() {
		if (smartTv == true) {
			return "sì";
		} else {
			return "no";
		}
	
	}
	
	
	
	public void creaProdotto() {
		System.out.println("Codice: " + getCodice());
        System.out.println("Nome: " + getNome());
        System.out.println("Descrizione: " + getMarca());
        System.out.println("Prezzo: " + getPrezzo() + "€");
        System.out.println("IVA: " + getIva());     
        System.out.println("Prezzo Ivato: " + getPrezzoIvato() + "€");
        System.out.println("Dimensione: " + getDimensione());
        System.out.println("Smart TV: " + convertBoolean());
	}
}