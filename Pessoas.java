package entities;

public abstract class Pessoas {
	
	public String nome;
	
	public String Genero;
	
	public String Cpf;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return Genero;
	}

	public String getCpf() {
		return Cpf;
	}
	
}
