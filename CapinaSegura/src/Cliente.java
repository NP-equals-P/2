
public class Cliente {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private int idade;
	private String endereco;
	
	public Cliente (String nome, String cpf, String dataNascimento, int idade, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	public String toString() {
		System.out.printf("Nome: %s%n", nome);
		System.out.printf("CPF: %s%n", cpf);
		System.out.printf("Data de nascimento: %s%n", dataNascimento);
		System.out.printf("Idade: %d%n", idade);
		System.out.printf("Endereço: %s%n", endereco);
		return "apyr";
	}
	
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
	
	public boolean validarCPF() {
		String cpf = this.cpf.replace(".", "");
		cpf = cpf.replace("-", "");
		
		if (cpf.length() != 11) {
			return false;
		}
		
		long cpfNumerico = Long.parseLong(cpf);
		long divisor = 11111111111L;
		
		if (cpfNumerico % divisor == 0) {
			return false;
		}
		
		int contador = 0;
		
		for (int i = 0; i < 8; i += 1) {
			contador += (10 - i) * Character.getNumericValue(cpf.charAt(i));
		}
		
		if (11 - (contador % 11) == Character.getNumericValue(cpf.charAt(9))) {
			return true;
		}
		else {
			System.out.println(contador);
			System.out.println(Character.getNumericValue(cpf.charAt(9)));
			return false;
		}
		
	}
	
}

// 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
