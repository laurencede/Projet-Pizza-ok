package fr.laurence.pizzeria.business.impl;

import java.util.ArrayList;

import fr.laurence.pizzeria.bean.Pizzeria;
import fr.laurence.pizzeria.business.IPizzeriaBusiness;
import fr.laurence.pizzeria.repository.impl.PizzeriaRepository;

public class PizzeriaBusiness implements IPizzeriaBusiness{
	PizzeriaRepository pr = new PizzeriaRepository();
	
	@Override
	public ArrayList<Pizzeria> findAll() {
		ArrayList<Pizzeria> toutesLesPizzas = pr.findAll();
		return toutesLesPizzas;
	}

	@Override
	public Pizzeria findOne(int id) {
		Pizzeria choixPiz = pr.findOne(id);
		return choixPiz;
	}

	@Override
	public boolean modifierPizza(int id, String libelle, String reference, int prix, String description, int numero,
			String urlimage) {
		boolean modifPiz = pr.modifierPizza(id, libelle, reference, prix, description, numero, urlimage);
		return modifPiz;
	}

	@Override
	public boolean ajouterPizza(String libelle, String reference, int prix, String description, int numero,
			String urlimage) {
		boolean ajoutPizz = pr.ajouterPizza(libelle, reference, prix, description, numero, urlimage);
		return ajoutPizz;
	}

	@Override
	public void supprimerPizza(int id) {
		pr.supprimerPizza(id);
		
	}




}
