package fr.laurence.pizzeria.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.laurence.pizzeria.bean.Pizzeria;
import fr.laurence.pizzeria.business.impl.PizzeriaBusiness;

/**
 * Servlet implementation class PizzeriaServlet
 */
@WebServlet(name = "pizzeria", urlPatterns = { "/pizzeria" })
public class PizzeriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PizzeriaBusiness pizz = new PizzeriaBusiness();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PizzeriaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Pizzeria> pizzeria = pizz.findAll();
		
		request.setAttribute("toutesLesPizzas", pizzeria);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/pizzeria.jsp")
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
