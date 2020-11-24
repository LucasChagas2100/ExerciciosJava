package Aula19_POO;

public class Ex1Instanciando {
	public static void main(String[] args) {
		//instanciando
		Ex1Cliente cliente1 = new Ex1Cliente();
		cliente1.setNome("Mateus");
		cliente1.setIdade(23);
		cliente1.setEndereco("Rua Yuke 23, Jd Tutupom - Campinas");
		cliente1.setCpf("123.456.789-00");
		cliente1.setTelefone("19 12345-6789");
		
		System.out.println("Cliente 01: "+ cliente1.getNome()+ "\nIdade: "+ cliente1.getIdade()+ "\nCPF: "+ cliente1.getCpf());
		System.out.println("Endereço: "+ cliente1.getEndereco()+ "\nTelefone: "+ cliente1.getTelefone());
	}

}
