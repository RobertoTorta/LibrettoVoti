package it.polito.tdp.libretto.model;

import java.util.*;

/**
 * Memorizza e gestisce insieme di voti superati
 * @author rober
 *
 */

public class Libretto {
	
	private List<Voto> voti=new ArrayList<Voto>();
	/**
	 * Aggiunge un nuovo voto al libretto
	 * @param v Voto da aggiungere al libretto
	 */
	public void add(Voto v) {
		this.voti.add(v); 
	}
	
	public String toString() {
		String s="";
		for(Voto v: this.voti) {
			s+=v.toString()+"\n";
		}
		return s;
	}
	/**
	 * Dato un libretto, restituisce una stringa nella quale vi sono solamente i voti pari al valore specificato
	 * @param voto  valore specificato
	 * @return string formattata per visualizzare il sottolibretto
	 */
	public String stampaVotiUguali(int voto) {
		String s="";
		for(Voto v: this.voti) {
			if(v.getVoto()==voto)
			s+=v.toString()+"\n";
		}
		return s;
	}
	/**
	 * Genera un nuovo libretto a partire da quello esistente che conterrà esclusivamente i voti con votazione pari a quella specificata
	 * @param voto votazione specificata
	 * @return nuovo Libretto "ridotto"
	 */
	public Libretto estraiVotiUguali(int voto) {
		Libretto nuovo = new Libretto();
		for(Voto v: this.voti)
		{
			if(v.getVoto()==voto)
				nuovo.add(v);
		}
		return nuovo;
	}

}
