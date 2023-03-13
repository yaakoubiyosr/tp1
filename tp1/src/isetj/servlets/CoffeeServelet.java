package isetj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * Servlet implementation class CoffeeServelet
 */
@WebServlet("/CoffeeServelet")
public class CoffeeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoffeeServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opt= request.getParameter("opt");
		String text= request.getParameter("text");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Servlet de Bienvenue</title></head>");
		out.println("<body><<img src=\"C:/Users/LENOVO/Pictures/Saved Pictures/coffee.png\"><br>");
		out.println("Merci de nous avoir fait parvenir la remarque suivante concernant la qualité du service<br>Bonne");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
