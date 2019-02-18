package fr.laurence.pizzeria.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.laurence.pizzeria.bean.Pizzeria;
import fr.laurence.pizzeria.repository.IPizzeriaRepository;

public class PizzeriaRepository implements IPizzeriaRepository {
	
	@Override
	public ArrayList<Pizzeria> findAll() {
		ArrayList<Pizzeria> toutesLesPizzas = new ArrayList<Pizzeria>();
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			Statement sm = cnx.createStatement();
			ResultSet resultat = sm.executeQuery("SELECT id, libelle, reference, prix, description, numero, urlImage FROM pizza");
			while (resultat.next()) {
				int id = resultat.getInt("id");
				String libelle = resultat.getString("libelle");
				String reference = resultat.getString("reference");
				int prix = resultat.getInt("prix");
				String description = resultat.getString("description");
				int numero =resultat.getInt("numero");
				String urlimage = resultat.getString("urlimage");
				
				Pizzeria pizAll = new Pizzeria(id, libelle, reference, prix, description, numero, urlimage);
				toutesLesPizzas.add(pizAll);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toutesLesPizzas;
	}

	@Override
	public Pizzeria findOne(int id) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			Statement sm = cnx.createStatement();
			ResultSet resultat = sm.executeQuery("SELECT id, libelle, reference, prix, description, numero, urlImage FROM pizza WHERE id=" + id);
			while (resultat.next()) {
				int idPizza = resultat.getInt("id");
				String libellePizza = resultat.getString("libelle");
				String referencePizza = resultat.getString("reference");
				int prixPizza = resultat.getInt("prix");
				String descriptionPizza = resultat.getString("description");
				int numeroPizza =resultat.getInt("numero");
				String urlimagePizza = resultat.getString("urlimage");
				
				Pizzeria pizza = new Pizzeria(idPizza, libellePizza, referencePizza, prixPizza, descriptionPizza, numeroPizza, urlimagePizza);
				return pizza;
			}	
			} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean modifierPizza(int id, String libelle, String reference, int prix, String description, int numero,
			String urlimage) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			PreparedStatement ps = cnx.prepareStatement("UPDATE pizza SET libelle = ?, reference = ?, prix = ?, description = ?, numero = ?, urlImage = ? WHERE id = ?");
			ps.setString(1, libelle);
			ps.setString(2, reference);
			ps.setInt(3, prix);
			ps.setString(4, description);
			ps.setInt(5, numero);
			ps.setString(6, urlimage);
			ps.setInt(7, id);
			
			ps.executeUpdate();
			return true;		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean ajouterPizza(String libelle, String reference, int prix, String description, int numero,
			String urlimage) {


		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			PreparedStatement ps = cnx.prepareStatement("INSERT INTO pizza (libelle, reference, prix, description, numero, urlimage) VALUES (?, ?, ?, ?, ?, ?)");
			ps.setString(1, libelle);
			ps.setString(2, reference);
			ps.setInt(3, prix);
			ps.setString(4, description);
			ps.setInt(5, numero);
			ps.setString(6, urlimage);
			
			ps.executeUpdate();
			return true;		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void supprimerPizza(int id) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "");
			Statement sm = cnx.createStatement();
			sm.executeQuery("DELETE FROM pizza WHERE id = " + id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
