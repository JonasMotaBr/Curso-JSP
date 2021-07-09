package dao;

import beans.BeansUsuario;
import beans.beansCliente;
import servelet.editarUsuServelet;

public class testeDao {

	public static void main(String[] args) {
		
		
//		String log = "login000000";
//		String sen = "senha123";
//		String repeat_pass ="senha123";
//		String telefone = "telefone";
//		String nome = "nome";
//		String email = "email";
//		String rua = "rua";
//		int Numero = 01;
//		String Bairro = "Bairro";
//		String Complemento ="Complemento";
//		int Cep = 48760000;
//		String cidade = "cidade";
//		String estado = "uf";
//		String fotoBase64= "fotoBase64";
//		String contentType = "contentType";
//		
//		BeansUsuario usuario = new BeansUsuario(nome, email, log, sen, repeat_pass, telefone, rua,Numero, Bairro, Complemento, Cep,cidade,estado,fotoBase64,contentType);
//		 daoUsuario daousuario = new daoUsuario();
//		 daousuario.AddUsuario(usuario);
		 //System.out.println("teste");
		 //System.out.println(daousuario.listarTodos());
		// System.out.println(daousuario.consultar("jonas", "123456"));
		// System.out.println("Consulta login: "+daousuario.consultarLoginObjeto("jonas").getSenha());
		
		
		//-----------------------------------------------------------
		
		//daoProduto daoProduto = new daoProduto();
//		daoProduto.addProduto("Gabinete Corsair", 499.0, 40, "Perifericos", "ativo",200.0);
//		daoProduto.addProduto("Cooler RGB", 40.0, 40, "Perifericos", "ativo",20.0);
//		daoProduto.addProduto("Placa Mãe", 650.0, 40, "Hardware", "ativo",300.0);
//		daoProduto.addProduto("Memoria Ram 4GB", 320.0, 40, "Hardware", "ativo",150.0);
//		System.out.println(daoProduto.ListarProdutos());
		//daoProduto.removerProduto("Gabinete Corsair");
		
		
		
		
		//############################### Clientes #####################################
		//----------------------------------------------------------- 
		
		
		 long cnpj_cpf=34016325498432L;
		 String descricaoCliente="Descricao Cliente ";
		 String razaoSocial="Razao Social";
		 String lagradouro= "Lagradouro";
		 String tel="Telefone";
		 int cep= 40170-010;
		 String cidade="Cidade";
		 String uf="Uf";
		beansCliente cliente = new beansCliente(cnpj_cpf,descricaoCliente,razaoSocial,lagradouro,tel,cep,cidade,uf);
		DaoCliente dao = new DaoCliente();
		dao.addCliente(cliente);
		//dao.delete(34016325498432L);
		
	
	
	}

}
