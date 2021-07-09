package servelet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.codec.binary.Base64;

import beans.BeansUsuario;
import dao.daoUsuario;

@WebServlet("/cadasUsuServelet")
@MultipartConfig
public class cadasUsuServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public cadasUsuServelet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String acao = request.getParameter("acao");
		String user = request.getParameter("user");
		daoUsuario daousuario = new daoUsuario();

		if (user != null) {

			if (acao.equalsIgnoreCase("delete")) {
				daousuario.delete(user);
				RequestDispatcher view = request.getRequestDispatcher("/cadastrarUsuario.jsp");
				request.setAttribute("usuario", daousuario.listarTodos());
				view.forward(request, response);
			}

			if (acao.equalsIgnoreCase("edit")) {

				// request.setAttribute("usuario", daousuario.listarTodos());
				// RequestDispatcher view= request.getRequestDispatcher("/editarUsuario.jsp");
				// view.forward(request, response);
				request.setAttribute("user", user);
				request.getRequestDispatcher("editarUsuario.jsp").forward(request, response);
			}
			
			if (acao.equalsIgnoreCase("download")) {
				
				BeansUsuario usuario = daousuario.consultarLoginObjeto(user);
				if (usuario != null){
					response.setHeader("Content-Disposition", "attachment;filename=arquivo."
				   + usuario.getContentType().split("\\/")[1]);
					
					/*Converte a base64 da imagem do banco para byte[]*/
					byte[] imageFotoBytes = new Base64().decodeBase64(usuario.getFotoBase64());
					
					/*Coloca os bytes em um objeto de entrada para processar*/
					InputStream is = new ByteArrayInputStream(imageFotoBytes);
					
					/*inicio da resposta para o navegador*/
					int read= 0;
					byte[] bytes = new byte[1024];
					OutputStream os = response.getOutputStream();
					
					
					while ((read = is.read(bytes)) != -1) {
						os.write(bytes, 0, read);
					}
					
					os.flush();
					os.close();
				}
			}

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		daoUsuario daousuario = new daoUsuario();

		String log = request.getParameter("login");
		String sen = request.getParameter("senha");
		String repeat_pass = request.getParameter("repeat_pass");
		String telefone = request.getParameter("telefone");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String rua = request.getParameter("rua");
		int Numero = Integer.parseInt(request.getParameter("Numero"));
		String Bairro = request.getParameter("Bairro");
		String Complemento = request.getParameter("Complemento");
		int Cep = Integer.parseInt(request.getParameter("cep"));
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("uf");

		// -----------------
		String msgLogin = "";
		String msgSenha = "";
		boolean cadastrar = true;

		if ((log == null) || (daousuario.consultarLogin(log) == true) || (log.isEmpty())) {
			msgLogin = "Login indisponível";
			cadastrar = false;

		} else if (sen.length() < 6) {
			msgSenha = "Senha deve conter 6 caracteres";
			cadastrar = false;
		}
		request.setAttribute("tel", telefone);
		request.setAttribute("nom", nome);
		request.setAttribute("user", log);
		request.setAttribute("senha", sen);
		request.setAttribute("msgLogin", msgLogin);
		request.setAttribute("msgSenha", msgSenha);
		request.setAttribute("email", email);
		RequestDispatcher view2 = request.getRequestDispatcher("/cadastrarUsuario.jsp");
		request.setAttribute("usuario", daousuario.listarTodos());
		view2.forward(request, response);

		// -------------------------------------

		if (log != null && daousuario.consultarLogin(log) == false && sen.length() >= 6) {

		

			
			try {
                   /* Inicio File upload de imagems e pdf */
				if (ServletFileUpload.isMultipartContent(request)) {

					Part imagemFoto = request.getPart("foto");
                    String contentType = imagemFoto.getContentType();
					String fotoBase64 = new Base64()
							.encodeBase64String(converteStremParabyte(imagemFoto.getInputStream()));
                    
					
					//Add no daoUsuario
					BeansUsuario usuario = new BeansUsuario(nome, email, log, sen, repeat_pass, telefone, rua,Numero, Bairro, Complemento, Cep,cidade,estado,fotoBase64,contentType);
					daousuario.AddUsuario(usuario);
					
					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

			// cadastrando
			 
			// RequestDispatcher view= request.getRequestDispatcher("/index.jsp");
			RequestDispatcher view = request.getRequestDispatcher("/cadastrarUsuario.jsp");
			request.setAttribute("usuario", daousuario.listarTodos());
			view.forward(request, response);
			System.out.println("testando 2");

		}
	}

	/* Converte a entrada de fluxo de dados da imagem para byte[] */
	private byte[] converteStremParabyte(InputStream imagem) throws Exception {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int reads = imagem.read();
		while (reads != -1) {
			baos.write(reads);
			reads = imagem.read();
		}

		return baos.toByteArray();

	}

}
