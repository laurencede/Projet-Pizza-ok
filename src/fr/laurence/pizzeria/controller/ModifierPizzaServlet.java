package fr.laurence.pizzeria.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.laurence.pizzeria.bean.Pizzeria;
import fr.laurence.pizzeria.business.impl.PizzeriaBusiness;
import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

/**
 * Servlet implementation class ModifierPizzaServlet
 */
@WebServlet(name = "modifier-pizza", urlPatterns = { "/modifier-pizza" })
public class ModifierPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzeriaBusiness pizz = new PizzeriaBusiness();       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		Pizzeria pizzModif = pizz.findOne(id);
		
		request.setAttribute("pizzeria", pizzModif);
		
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/modifier-pizza.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		String libelle = request.getParameter("libelle");
		String reference = request.getParameter("reference");
		
		String prixString = request.getParameter("prix");
		int prix = Integer.parseInt(prixString);
		
		String description = request.getParameter("description");
		String numeroString = request.getParameter("numero");
		int numero = Integer.parseInt(numeroString);
		
		String urlimage = request.getParameter("urlimage");
		
		boolean ok = pizz.modifierPizza(id, libelle, reference, prix, description, numero, urlimage);
		if(ok) {
			response.sendRedirect("infos-pizza?id=" + id);
		}else {
			response.sendRedirect("modifier-pizza?id=" + id);
		}
	}

}
