package beans;

public class beansCliente {
	
	private int id_cli;
	private long cnpj_cpf;
	private String descricaoCliente;
	private String razaoSocial;
	private String lagradouro;
	private String tel;
	private int cep;
	private String cidade;
	private String uf;
	
	
	
	public beansCliente() {
		super();
	}
	public beansCliente(int id_cli, long cnpj_cpf, String descricaoCliente, String razaoSocial, String lagradouro,
			String tel, int cep, String cidade, String uf) {
		super();
		this.id_cli = id_cli;
		this.cnpj_cpf = cnpj_cpf;
		this.descricaoCliente = descricaoCliente;
		this.razaoSocial = razaoSocial;
		this.lagradouro = lagradouro;
		this.tel = tel;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}
	public beansCliente(long cnpj_cpf, String descricaoCliente, String razaoSocial, String lagradouro, String tel,
			int cep, String cidade, String uf) {
		super();
		this.cnpj_cpf = cnpj_cpf;
		this.descricaoCliente = descricaoCliente;
		this.razaoSocial = razaoSocial;
		this.lagradouro = lagradouro;
		this.tel = tel;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	
	public int getId_cli() {
		return id_cli;
	}
	public void setId_cli(int id_cli) {
		this.id_cli = id_cli;
	}
	public long getCnpj_cpf() {
		return cnpj_cpf;
	}
	public void setCnpj_cpf(long cnpj_cpf) {
		this.cnpj_cpf = cnpj_cpf;
	}
	public String getDescricaoCliente() {
		return descricaoCliente;
	}
	public void setDescricaoCliente(String descricaoCliente) {
		this.descricaoCliente = descricaoCliente;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getLagradouro() {
		return lagradouro;
	}
	public void setLagradouro(String lagradouro) {
		this.lagradouro = lagradouro;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
	
	
	
	
	
	
	
	

}
