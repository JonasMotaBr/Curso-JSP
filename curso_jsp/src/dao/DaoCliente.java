package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Connection.SingleConnection;
import beans.beansCliente;

public class DaoCliente {
	
	
	public void addCliente(beansCliente cliente) {
		
		Connection conexao = SingleConnection.getConexao();
		String sql="INSERT INTO tb_cliente (cnpj_cpf,descricaoCliente,razaoSocial,lagradouro,tel,cep,cidade,uf) values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, cliente.getCnpj_cpf());
			stmt.setString(2, cliente.getDescricaoCliente());
			stmt.setString(3, cliente.getRazaoSocial());
			stmt.setString(4, cliente.getLagradouro());
			stmt.setString(5, cliente.getTel());
			stmt.setInt(6, cliente.getCep());
			stmt.setString(7, cliente.getCidade());
			stmt.setString(8, cliente.getUf());
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void delete(long cnpj_cpf) {
		Connection conexao = SingleConnection.getConexao();
		String sql = "DELETE FROM tb_cliente WHERE cnpj_cpf = ?; ";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, cnpj_cpf);
			stmt.execute();
			conexao.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
