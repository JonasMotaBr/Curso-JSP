package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection.SingleConnection;
import beans.BeansProduto;

public class daoProduto {
	
	

	//addProduto ---------------------------------------------------
	public void addProduto(String desc,double valor,int quant,String tipo,String Status,double valorcusto) {
		String sql ="INSERT INTO tb_produto (desc_prod,valor_prod,quant_prod,tipo_prod,status_prod,valorCusto_Prod)"
				+ " values(?,?,?,?,?,?);";
		Connection conexao = SingleConnection.getConexao();
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, desc);
			stmt.setDouble(2, valor);
			stmt.setInt(3, quant);
			stmt.setString(4, tipo);
			stmt.setString(5, Status);
			stmt.setDouble(6, valorcusto);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//ListarProduto---------------------------------------------------
	public List<BeansProduto> ListarProdutos(){
		Connection conexao = SingleConnection.getConexao();
		String sql="select codigo_prod,desc_prod,valor_prod,quant_prod,tipo_prod,status_prod,valorCusto_Prod from tb_produto;";
		ArrayList<BeansProduto> lista = new ArrayList<>(); 
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet resultado = stmt.executeQuery();
			while(resultado.next()) {
				long codigo = resultado.getInt(1);
				String desc = resultado.getString(2);
				double valor= resultado.getDouble(3);
				int quant =resultado.getInt(4);
				String tipo= resultado.getString(5);
				String status=resultado.getString(6);
				double valorcusto =resultado.getDouble(7);
				lista.add(new BeansProduto(codigo,desc,valor,quant,tipo,status,valorcusto));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	
	//RemoverProduto ---------------------------------------------------
	 public void removerProduto(String desc) {
		 Connection conexao = SingleConnection.getConexao();
		 String sql="DELETE FROM tb_produto WHERE desc_prod = ?; ";
		 try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, desc);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	 
	

}
