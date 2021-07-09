package servelet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daoUsuario;

@WebServlet("/editarUsuServelet")
public class editarUsuServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public editarUsuServelet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

		String getlogin = request.getParameter("getlogin");
		String novoLogin = request.getParameter("login");
		String novaSenha = request.getParameter("senha");
		daoUsuario daoUsuario = new daoUsuario();


		if (/* condition email */ daoUsuario.consultarLogin(getlogin)) {

			if ((getlogin != null) && (novoLogin != null) && (daoUsuario.consultarLogin(novoLogin) == false)) {
				daoUsuario.editar(getlogin, novoLogin, novaSenha);
				RequestDispatcher view = request.getRequestDispatcher("/cadastrarUsuario.jsp");
				request.setAttribute("usuario", daoUsuario.listarTodos());
				view.forward(request, response);
			}

		} // ---------------------------------------------

		if (/* condition email */ daoUsuario.consultarLogin(getlogin) == false) {

			String loginnaoexite = "Insira loguin atual";
			request.setAttribute("loginnaoexite", loginnaoexite);
			RequestDispatcher view = request.getRequestDispatcher("/editarUsuario.jsp");
			view.forward(request, response);

		} // ---------------------------------------------

		if ((novoLogin == null) || (daoUsuario.consultarLogin(novoLogin) == true)) {
			String msgLoginIndisEdit = "Login indisponível";
			request.setAttribute("msgLoginIndisEdit", msgLoginIndisEdit);
			RequestDispatcher view = request.getRequestDispatcher("/editarUsuario.jsp");
			view.forward(request, response);
		}

	}

}
