package com.liu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MvcServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name =req.getParameter("name") ;
		String path;
		CheckBean mc =new CheckBean() ;
		mc.setname(name) ;
		if(mc.isvalidata()){
			req.setAttribute(name, mc.getnmae(name)) ;
			path ="mvcsuccess.jsp" ;
		}
		else
			path ="mvcfail.jsp" ;
		//½øÐÐÌø×ª
		req.getRequestDispatcher(path).forward(req, resp) ;
		super.doPost(req, resp) ;
	}

}
