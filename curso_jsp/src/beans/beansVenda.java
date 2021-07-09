package beans;

import java.util.Date;

public class beansVenda {

	private int id_venda;
	private int codigo_prod;
	private int id_usu;
	private int quant_prod;
	private Date data_vend;
	public beansVenda(int id_venda, int codigo_prod, int id_usu, int quant_prod, Date data_vend) {
		super();
		this.id_venda = id_venda;
		this.codigo_prod = codigo_prod;
		this.id_usu = id_usu;
		this.quant_prod = quant_prod;
		this.data_vend = data_vend;
	}
	public beansVenda(int codigo_prod, int id_usu, int quant_prod, Date data_vend) {
		super();
		this.codigo_prod = codigo_prod;
		this.id_usu = id_usu;
		this.quant_prod = quant_prod;
		this.data_vend = data_vend;
	}
	public beansVenda() {
		super();
	}
	public int getId_venda() {
		return id_venda;
	}
	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}
	public int getCodigo_prod() {
		return codigo_prod;
	}
	public void setCodigo_prod(int codigo_prod) {
		this.codigo_prod = codigo_prod;
	}
	public int getId_usu() {
		return id_usu;
	}
	public void setId_usu(int id_usu) {
		this.id_usu = id_usu;
	}
	public int getQuant_prod() {
		return quant_prod;
	}
	public void setQuant_prod(int quant_prod) {
		this.quant_prod = quant_prod;
	}
	public Date getData_vend() {
		return data_vend;
	}
	public void setData_vend(Date data_vend) {
		this.data_vend = data_vend;
	}
	
	
	
	
	
}
