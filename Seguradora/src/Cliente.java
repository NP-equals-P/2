
public class Cliente {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private int idade;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public boolean validarCPF(String cpf) {
		cpf = cpf.replaceAll(".", "");
		cpf = cpf.replaceAll("-", "");
		if (cpf.length() != 11) {
			return false;
		}
		
		int cpfNumerico = Integer.parseInt(cpf);
		long divisor = 11111111111;
		
		if (cpfNumerico % divisor == 0) {
			return false;
		}
		
		int contador = 0;
		
		for (int i = 0; i < 8; i += 1) {
			contador += (10 - i) * Character.getNumericValue(cpf.charAt(i));
		}
		
		if (contador % 11 == Character.getNumericValue(cpf.charAt(9)))
		
		
		return true;
	}
	
}
