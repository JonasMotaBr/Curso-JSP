package beans;

public class BeansProduto {
	
	private Long codigo;
	private String descri;
	private double valor;
	private int quant;
	private String tipo;
	private double custo;
	private String status;
	
	
	
	public BeansProduto(Long codigo,String descri,double valor,int quant,String tipo,String status,double custo) {
		super();
		this.codigo=codigo;
		this.descri = descri;
		this.valor = valor;
		this.quant = quant;
		this.tipo = tipo;
		this.custo = custo;
		this.status = status;
	}
	
	
	
	
	
	public BeansProduto(String descri, double valor, int quant, String tipo) {
		super();
		this.descri = descri;
		this.valor = valor;
		this.quant = quant;
		this.tipo = tipo;
	}





	public BeansProduto() {
		super();
	}
	
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "BeansProduto [codigo=" + codigo + ", descri=" + descri + ", valor=" + valor + ", quant=" + quant
				+ ", tipo=" + tipo + ", custo=" + custo + ", status=" + status + "]";
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	

}
