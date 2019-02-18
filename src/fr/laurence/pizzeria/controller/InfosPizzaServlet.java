package fr.laurence.pizzeria.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.laurence.pizzeria.bean.Pizzeria;
import fr.laurence.pizzeria.business.impl.PizzeriaBusiness;

/**
 * Servlet implementation class InfosPizzaServlet
 */
@WebServlet(name = "infos-pizza", urlPatterns = { "/infos-pizza" })
public class InfosPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzeriaBusiness pizz = new PizzeriaBusiness();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfosPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		Pizzeria infoPizza = pizz.findOne(id);	
		request.setAttribute("choixPizza", infoPizza);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/infos-pizza.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
