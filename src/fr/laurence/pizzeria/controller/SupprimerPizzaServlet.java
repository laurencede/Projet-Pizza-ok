package fr.laurence.pizzeria.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.laurence.pizzeria.business.impl.PizzeriaBusiness;

/**
 * Servlet implementation class SupprimerPizzaServlet
 */
@WebServlet(name = "supprimer-pizza", urlPatterns = { "/supprimer-pizza" })
public class SupprimerPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzeriaBusiness pizz = new PizzeriaBusiness();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		pizz.supprimerPizza(id);
		
		response.sendRedirect("pizzeria");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
