package beans;

public class BeansUsuario {

	private int id;
	private String nome;
	private String email;
	private String login;
	private String senha;
	private String repeat_pass;
	private String telefone;
	private String rua;
	private int Numero;
	private String Bairro;
	private String Complemento;
	private int Cep;
	private String cidade;
	private String estado ;
	private String fotoBase64;
	private String contentType;
	private String tempFotouser;



    //Construtores=========================================
	public BeansUsuario(String nome, String email, String login, String senha, String repeat_pass,
			String telefone, String rua, int numero, String bairro, String complemento, int cep, String cidade,
			String estado, String fotoBase64, String contentType) {
		super();
		this.nome = nome;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.repeat_pass = repeat_pass;
		this.telefone = telefone;
		this.rua = rua;
		Numero = numero;
		Bairro = bairro;
		Complemento = complemento;
		Cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.fotoBase64 = fotoBase64;
		this.contentType = contentType;
	}
	

	public BeansUsuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public BeansUsuario(int id, String nome, String login) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
	}
	public BeansUsuario() {
		super();
	}
	public BeansUsuario(int id, String login, String senha, String fotoBase64, String contentType) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.fotoBase64 = fotoBase64;
		this.contentType = contentType;
	}
	
	
    //metodos=========================================================
//	public String concatenarStringBase64(){
//		String tempFotouser = "data:" + contentType+";base64," + fotoBase64;
//		return tempFotouser;
//	}
	
	
	public boolean validar(String log, String sen) {
		if((log.equals("admin"))&& (sen.equals("admin"))) {
			 return true;
		}else
		    return false;
	}

	
	//metodos gets e sets
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getRepeat_pass() {
		return repeat_pass;
	}


	public void setRepeat_pass(String repeat_pass) {
		this.repeat_pass = repeat_pass;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public int getNumero() {
		return Numero;
	}


	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}


	public String getComplemento() {
		return Complemento;
	}


	public void setComplemento(String complemento) {
		Complemento = complemento;
	}


	public int getCep() {
		return Cep;
	}


	public void setCep(int cep) {
		Cep = cep;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getFotoBase64() {
		return fotoBase64;
	}


	public void setFotoBase64(String fotoBase64) {
		this.fotoBase64 = fotoBase64;
	}


	public String getContentType() {
		return contentType;
	}


	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	

	


	


	public String getTempFotouser() {
		tempFotouser = "data:" + contentType+";base64," + fotoBase64;
		return tempFotouser;
	}


	public void setTempFotouser(String tempFotouser) {
		this.tempFotouser = tempFotouser;
	}


	@Override
	public String toString() {
		return "BeansUsuario [id=" + id + ", nome=" + nome + ", email=" + email + ", login=" + login + ", telefone="
				+ telefone + ", rua=" + rua + ", Numero=" + Numero + ", Bairro=" + Bairro + ", Complemento="
				+ Complemento + ", Cep=" + Cep + ", cidade=" + cidade + ", estado=" + estado + ", fotoBase64="
				+ fotoBase64 + ", contentType=" + contentType + "]";
	}






	
	


	



	
	
	
	
	
	
	
}
