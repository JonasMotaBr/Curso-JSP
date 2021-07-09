package beans;

public class beansCursoJSP {

	private String nome;
	private String ano;
	private String sexo;
	
	public int Soma(int... nums) {
		int total=0;
		for (int i = 0; i < nums.length; i++) {
			 total+= nums[i];
		}
		return total;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	
}
