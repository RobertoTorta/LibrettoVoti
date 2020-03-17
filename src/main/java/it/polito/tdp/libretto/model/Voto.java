package it.polito.tdp.libretto.model;

import java.time.LocalDate;

/**
 *Classe voto, contiene le informazioni su unn esame superato 
 * @author rober
 */


public class Voto {

	private String corso;
	private int voto;
	private LocalDate data;
	
	/**
	 * Cotruisce n nuovo Voto.
	 * @param corso nome del corso superato
	 * @param voto valore del vito acquisito
	 * @param data data di superamento dell'esame
	 */
	
	public Voto(String corso, int voto, LocalDate data) {
		super();
		this.corso = corso;
		this.voto = voto;
		this.data = data;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return corso + ": " + voto + "   ("+ data+");";
	}
	
	
	
	
}
