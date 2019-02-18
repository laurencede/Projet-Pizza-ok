package fr.laurence.pizzeria.repository;

import java.util.ArrayList;

import fr.laurence.pizzeria.bean.Pizzeria;

public interface IPizzeriaRepository {
	
	public ArrayList<Pizzeria> findAll();
	
	public Pizzeria findOne(int id);
	
	public boolean modifierPizza (
			int id, String libelle, String reference, int prix, String description, int numero, String urlimage);
	
	public boolean ajouterPizza (String libelle, String reference, int prix, String description, int numero, String urlimage);
	
	public void supprimerPizza(int id);
	
}
