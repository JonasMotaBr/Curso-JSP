package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import Connection.SingleConnection;
import beans.beansVenda;

public class daoVenda {
	
	
	
	public void addvenda(beansVenda venda){
		Connection conexao = SingleConnection.getConexao();
		String sql = "INSERT INTO tb_venda (codigo_prod,id_usu,quant_prod) values(?,?,?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, venda.getCodigo_prod());
			stmt.setInt(2, venda.getId_usu());
			stmt.setInt(3, venda.getQuant_prod());
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
