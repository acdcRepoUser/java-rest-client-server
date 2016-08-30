package com.vogella.jersey.first;

import java.util.ArrayList;
import java.util.List;

import com.airbus.rest.model.Fahrer;

public class Storage {
	
	private static final Storage instance = new Storage();
	
	private Storage() {
		add(new Fahrer("Jürgern", "Blub"));
		add(new Fahrer("Max", "Mustermann"));
	}

	private List<Fahrer> fahrerListe = new ArrayList<>();
	
	public void add(Fahrer fahrer) {
		fahrerListe.add(fahrer);
	}
	
	public List<Fahrer> getFahrerListe() {
		return fahrerListe;
	}
	
	public static Storage getInstance() {
		return instance;
	}
	
}
