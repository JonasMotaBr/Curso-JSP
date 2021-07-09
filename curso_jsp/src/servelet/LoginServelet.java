package servelet;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BeansUsuario;
import dao.ValidarUsu;
import dao.daoUsuario;



@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServelet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		ValidarUsu vu = new ValidarUsu();
		
		String log= request.getParameter("login");
		String sen= request.getParameter("senha");

		
		if (vu.validar(log, sen)) {//acesso liberado
			RequestDispatcher rd = request.getRequestDispatcher("AcessoLiberado.jsp");
			 rd.forward(request, response);
		}else {//acesso negado
			RequestDispatcher rd = request.getRequestDispatcher("AcessoNegado.jsp");
			rd.forward(request, response);
		}
		
	}
	
	

}
