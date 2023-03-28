
public class Main {
	public static void main(String[] args) {
		
		Cliente Matheus = new Cliente("Matheus", "268.438.358-80", "15/07/2004", 18, "Rua 90");
		Matheus.toString();
		System.out.println();
		
		System.out.println(Matheus.getNome());
		System.out.println(Matheus.getCpf());
		System.out.println(Matheus.getDataNascimento());
		System.out.println(Matheus.getIdade());
		System.out.println(Matheus.getEndereco());
		System.out.println();
		
		Matheus.setNome("Matheus 2");
		Matheus.setCpf("333.333.333-33");
		Matheus.setDataNascimento("14/07/2004");
		Matheus.setIdade(19);
		Matheus.setEndereco("Rua 91");
		
		Matheus.toString();
	}
}
