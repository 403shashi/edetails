package com.sathya.servletex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Book")
public class BookRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Bookisbn = request.getParameter("isbn");
		String Bookname = request.getParameter("name");
		String BookAuthor = request.getParameter("author");
		String Bookprice = request.getParameter("price");
		 BookDao bookDao = new BookDao();
		 int result = bookDao.savebook(Bookisbn, Bookname, BookAuthor, Bookprice);
		 request.setAttribute("result", result);
		 RequestDispatcher dispatcher=request.getRequestDispatcher("registerstatus.jsp");
		 dispatcher.forward(request, response);
		
		
	}

}
