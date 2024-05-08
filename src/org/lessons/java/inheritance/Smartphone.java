package org.lessons.java.inheritance;

import java.util.Random;

public class Smartphone extends Prodotto {
	private int codiceIMEI;
	private int spazioMemoria;
	
	public Smartphone (int codice, String nome, String marca, double prezzo, double iva, int codiceIMEI, int spazioMemoria) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceIMEI = generaIMEI();
		this.setSpazioMemoria(spazioMemoria);
	}

	public int getCodiceIMEI() {
		return this.codiceIMEI;
	}

	public int getSpazioMemoria() {
		return this.spazioMemoria;
	}

	public void setSpazioMemoria(int spazioMemoria) {
		this.spazioMemoria = spazioMemoria;
	}
	
	private int generaIMEI() {
		Random rand = new Random();
		return rand.nextInt(10000000);
	}
	
	public void creaProdotto() {
		System.out.println("Codice: " + getCodice());
        System.out.println("Nome: " + getNome());
        System.out.println("Descrizione: " + getMarca());
        System.out.println("Prezzo: " + getPrezzo() + "€");
        System.out.println("IVA: " + getIva());     
        System.out.println("Prezzo Ivato: " + getPrezzoIvato() + "€");
        System.out.println("Codice Imei: " + getCodiceIMEI());
        System.out.println("Quantità di memoria: " + getSpazioMemoria() + "GB");
	}
}
