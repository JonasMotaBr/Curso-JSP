package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.SingleConnection;
import beans.BeansUsuario;

public class daoUsuario {

	
	
	    //-------metodo Consultar-----------------------------------------
	    public  boolean consultar(String login,String senha) {
		
		BeansUsuario usuariobusca =new BeansUsuario(login,senha);
		
		Connection conexao = SingleConnection.getConexao();
		String sql ="select * from tb_usuario where login = ? ";
		PreparedStatement stmt;
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, login);
		    ResultSet resultado= stmt.executeQuery();
		
			ArrayList<BeansUsuario> listBuscarUsuario = new ArrayList<>();
		
		while(resultado.next()) {
			
			String log = resultado.getString(4);
			String sen = resultado.getString(5);
			listBuscarUsuario.add(new BeansUsuario(log,sen));
		}
		
		
		//fazer condicao para nulo
		for(BeansUsuario u : listBuscarUsuario) {
		    if ((u.getLogin().equals(usuariobusca.getLogin())) && (u.getSenha().equals(usuariobusca.getSenha())) ) {
				return true;
			}
		}
		
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
			e.printStackTrace();
		}
		return false;
	    }
	
	   //-------metodo add-----------------------------------------
		public  void AddUsuario(BeansUsuario usuario){
			try {	
				
				
		Connection conexao = SingleConnection.getConexao();
		String sql="INSERT INTO tb_usuario (nome,email,login,senha,repSenha,tel,rua,numero,bairro,comp,cep,cidade,estado,fotoBase64,contentType) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail());
		stmt.setString(3, usuario.getLogin());
		stmt.setString(4, usuario.getSenha());
		stmt.setString(5, usuario.getRepeat_pass());
		stmt.setString(6, usuario.getTelefone());
		stmt.setString(7, usuario.getRua());
		stmt.setInt(8, usuario.getNumero()); 
		stmt.setString(9, usuario.getBairro());
		stmt.setString(10, usuario.getComplemento());
		stmt.setInt(11, usuario.getCep());
		stmt.setString(12, usuario.getCidade());
		stmt.setString(13, usuario.getEstado());
		stmt.setString(14, usuario.getFotoBase64());
		stmt.setString(15, usuario.getContentType());
		stmt.execute();
		stmt.close();
		
		} catch (SQLException e) {
			e.getErrorCode();
			e.printStackTrace();
		}
		}
		
		
		//-------metodo Consultar-----------------------------------------
		public List<BeansUsuario> listarTodos(){
			
			Connection conexao = SingleConnection.getConexao();
			String sql ="SELECT * FROM tb_usuario";
			ArrayList<BeansUsuario> lista = new ArrayList<>();
			PreparedStatement stmt;
			try {
				stmt = conexao.prepareStatement(sql);
				ResultSet resultado = stmt.executeQuery();
				while(resultado.next()) {
					int id = resultado.getInt(1);
					String login = resultado.getString(4);
					String senha = resultado.getString(5);
					String fotoBase64 = resultado.getString(15);
					String contentType =resultado.getString(16);
					lista.add(new BeansUsuario(id,login,senha,fotoBase64,contentType));
					
				}
			
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return lista;
			
		}
		
		
		
		//-------metodo delete-----------------------------------------
		public void delete(String user) {
			Connection conexao = SingleConnection.getConexao();
			String sql = "DELETE FROM tb_usuario WHERE login = ?; ";
			try {
				PreparedStatement stmt = conexao.prepareStatement(sql);
				stmt.setString(1, user);
				stmt.execute();
				
				conexao.commit();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//-------metodo editar-----------------------------------------
		public void editar(String login,String novoLogin,String novaSenha) {
			
			Connection conexao = SingleConnection.getConexao();
			
			try {
				
				//Buscar o getId do usuario-----------------------------------------
				String busca="select * from tb_usuario where login = ?";
				PreparedStatement stmt = conexao.prepareStatement(busca);
				stmt.setString(1, login);
				ResultSet resultado = stmt.executeQuery();
				while(resultado.next()) {
					
					int getid = resultado.getInt(1);
					
			  //Update-----------------------------------------
			   String update = "UPDATE tb_usuario SET login =?, senha =? WHERE id =? ; ";
			   PreparedStatement stmt2 = conexao.prepareStatement(update);
			  
			   stmt2.setString(1, novoLogin);	
			   stmt2.setString(2, novaSenha);
			   stmt2.setInt(3, getid);	
			   stmt2.execute();		
					
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}//-------metodo Consultar Login / booleano-----------------------------------------
		public  boolean consultarLogin(String loginBusca) {
			
			
			Connection conexao = SingleConnection.getConexao();
			String sql ="select * from tb_usuario where login = ? ";
			PreparedStatement stmt;
			try {
				stmt = conexao.prepareStatement(sql);
				stmt.setString(1, loginBusca);
			    ResultSet resultado= stmt.executeQuery();
			
				ArrayList<BeansUsuario> listBuscarUsuario = new ArrayList<>();
			
			while(resultado.next()) {
				int id = resultado.getInt(1);
				String login = resultado.getString(4);
				String senha = resultado.getString(5);
				String fotoBase64 = resultado.getString(15);
				String contentType =resultado.getString(16);
				listBuscarUsuario.add(new BeansUsuario(id,login,senha,fotoBase64,contentType));
			}
			
			for(BeansUsuario u : listBuscarUsuario) {
			    if (u.getLogin().equals(loginBusca)) {
					return true;
				}
			}
			
			} catch (SQLException e) {
				System.out.println(e.getErrorCode());
				e.printStackTrace();
			}
			return false;
		    }
		
		
		
		
		  //-------metodo Consultar Login / retorna objeto------------------------
           public  BeansUsuario consultarLoginObjeto(String loginBusca) {
        	   
        	BeansUsuario usuario = new BeansUsuario();
			Connection conexao = SingleConnection.getConexao();
			String sql ="select * from tb_usuario where login = ? ";
			PreparedStatement stmt;
			try {
				stmt = conexao.prepareStatement(sql);
				stmt.setString(1, loginBusca);
			    ResultSet resultado= stmt.executeQuery();
			
				ArrayList<BeansUsuario> listBuscarUsuario = new ArrayList<>();
			
			while(resultado.next()) {
				int id = resultado.getInt(1);
				String login = resultado.getString(4);
				String senha = resultado.getString(5);
				String fotoBase64 = resultado.getString(15);
				String contentType =resultado.getString(16);
				usuario.setLogin(login);
				usuario.setSenha(senha);
				usuario.setFotoBase64(fotoBase64);
				usuario.setContentType(contentType);
				//listBuscarUsuario.add(new BeansUsuario(id,login,senha,fotoBase64,contentType));
			}
			
			for(BeansUsuario u : listBuscarUsuario) {
			    if (u.getLogin().equals(loginBusca)) {
			    	
				}
			}
			
			listBuscarUsuario.clear();
			} catch (SQLException e) {
				System.out.println(e.getErrorCode());
				e.printStackTrace();
			}
			return usuario;
			
		    }
		

}


