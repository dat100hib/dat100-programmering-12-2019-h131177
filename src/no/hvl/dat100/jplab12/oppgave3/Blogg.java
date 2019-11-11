package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggtabell;
	private int nesteLedig;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteLedig = 0;
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteLedig = 0;
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		return this.nesteLedig;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		return this.innleggtabell;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int i = -1;
		int teller = 0;
		while(teller < nesteLedig) {
			if(innleggtabell[teller].erLik(innlegg)) {
				return teller;
			}
			teller++;
		}
		return i;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		int teller = 0;
		while(teller < nesteLedig) {
			if(innleggtabell[teller].erLik(innlegg)) {
				return true;
			}
			teller++;
		}
		return funnet;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		if(nesteLedig < innleggtabell.length) {
			return true;
		}
		return false;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(!finnes(innlegg)) {
			innleggtabell[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		}
		return false;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		String streng = (nesteLedig) + "\n";
		for(int i = 0; i < innleggtabell.length; i++) {
			/*
			if(innleggtabell[i] instanceof Tekst) {
				streng += innleggtabell[i].toString();
			} else if(innleggtabell[i] instanceof Bilde) {
				
			}*/
			streng += innleggtabell[i].toString();
		}
		return streng;
		//throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}