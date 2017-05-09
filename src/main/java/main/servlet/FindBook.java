package main.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FindBook {
	/**
	 * Servlet implementation class FindBooks
	 */
	@WebServlet("/book")
	public class FindBooks extends HttpServlet {
		private static final long serialVersionUID = 1L;
		/**
		 * @see HttpServlet#HttpServlet()
		 */
		public FindBooks() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
			List myShoppingCart = (ArrayList) session.getAttribute("shoppingCart");
			if(myShoppingCart == null) {
				myShoppingCart = new ArrayList();
			}

			Book book = new Book();
			book.setName(request.getParameter("bookTitle"));
			book.setPrice(Double.parseDouble(request.getParameter("price")));
			myShoppingCart.add(book);

			session.setAttribute("shoppingCart", myShoppingCart);

			PrintWriter out = response.getWriter();
			out.println("Hello from My first servlet");
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		}

	}

}
