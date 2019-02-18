package fr.laurence.pizzeria.bean;

public class Pizzeria {
	private int id;
	private String libelle;
	private String reference;
	private int prix;
	private String description;
	private int numero;
	private String urlimage;
	
	public Pizzeria(int id, String libelle, String reference, int prix, String description, int numero,
			String urlimage) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.reference = reference;
		this.prix = prix;
		this.description = description;
		this.numero = numero;
		this.urlimage = urlimage;
	}

	public Pizzeria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getUrlimage() {
		return urlimage;
	}

	public void setUrlimage(String urlimage) {
		this.urlimage = urlimage;
	}

	
	
	
}
