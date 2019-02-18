package fr.laurence.pizzeria.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.laurence.pizzeria.business.impl.PizzeriaBusiness;

/**
 * Servlet implementation class AjouterPizzaServlet
 */
@WebServlet(name = "ajouter-pizza", urlPatterns = { "/ajouter-pizza" })
public class AjouterPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzeriaBusiness pizz = new PizzeriaBusiness();     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/ajouter-pizza.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String libelle = request.getParameter("libelle");
		String reference = request.getParameter("reference");
		
		String prixString = request.getParameter("prix");
		int prix = Integer.parseInt(prixString);
		
		String description = request.getParameter("description");
		
		String numeroString = request.getParameter("numero");
		int numero = 0;
		try {
			numero = Integer.parseInt(numeroString);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		String urlimage = request.getParameter("urlimage");
		
		if(
				libelle.equals("") ||
				reference.equals("") ||
				prixString.equals("") ||
				description.equals("") ||
				numeroString.equals("") ||
				urlimage.contentEquals("")
				) {
			response.sendRedirect("ajouter-pizza");
			return;
		} 
			
		boolean ok = pizz.ajouterPizza(libelle, reference, prix, description, numero, urlimage);
		if (ok){
			response.sendRedirect("pizzeria");
		}else {
			response.sendRedirect("ajouter-pizza");
		}
		

		
	
	}

}
