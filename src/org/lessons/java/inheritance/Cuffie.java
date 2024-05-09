package org.lessons.java.inheritance;

public class Cuffie extends Prodotto {
	private String colore;
	private boolean connessione;
	
	public Cuffie (int codice, String nome, String marca, double prezzo, double iva, String colore, boolean connessione) {
		super(codice, nome, marca, prezzo, iva);
		this.setColore(colore);
		this.setConnessione(connessione);;
	}

	public String getColore() {
		return this.colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean getConnessione() {
		return this.connessione;
	}

	public void setConnessione(boolean connessione) {
		this.connessione = connessione;
	}
	
	public String convertBoolean() {
		if (connessione == true) {
			return "cavo AUX";
		} else {
			return "Wireless";
		}
	
	}
	
	public String toString() {
		return super.toString()
        + "\nColore: " + getColore()
        + "\nTipo di connessione: " + convertBoolean();
	}
}