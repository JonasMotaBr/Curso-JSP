package servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daoProduto;


@WebServlet("/cadasProduServelet")
public class cadasProduServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public cadasProduServelet() {
        super();
    }

    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String desc = request.getParameter("Descrição");
		double valor_custo = Double.parseDouble(request.getParameter("valor_custo"));
		double Preço = Double.parseDouble(request.getParameter("Preço"));
		int Quantidade = Integer.parseInt(request.getParameter("Quantidade"));
		String Tipo = request.getParameter("Tipo");
		String status = request.getParameter("status");  
		
		daoProduto dao = new daoProduto();
		dao.addProduto(desc, Preço, Quantidade, Tipo, status, valor_custo);
		
		RequestDispatcher view = request.getRequestDispatcher("/estoque.jsp");
		request.setAttribute("produto", dao.ListarProdutos());
		view.forward(request, response);
	
		
	}

}
