package fr.laurence.pizzeria.business;

import java.util.ArrayList;

import fr.laurence.pizzeria.bean.Pizzeria;

public interface IPizzeriaBusiness {

	public ArrayList<Pizzeria> findAll();
	
	public Pizzeria findOne(int id);
	
	public boolean modifierPizza (
			int id, String libelle, String reference, int prix, String description, int numero, String urlimage);
	
	public boolean ajouterPizza (String libelle, String reference, int prix, String description, int numero, String urlimage);
	
	public void supprimerPizza(int id);
	
}


