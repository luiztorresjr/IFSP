package cadastro;

public class CadastroCliente1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Cliente c1 = new Cliente();
			c1.setNome("Jacqueline");
			c1.setEndereco("Boulevard Broken Dream, Numero 6, Bairro Quincas, Cidade San Siro ");
			c1.setTelefone("+15560809030");
			c1.setEmail("ant@fake.com");
			Cliente c2 = new Cliente();
			c2.setNome("Bebeto");
			c2.setEndereco("Rua Sesame, numero 11, Bairro las Casas, Cidade Nova Trabalhador");
			c2.setTelefone("+123250806020");
			c2.setEmail("bebe@you.com");
			Cliente c3 = new Cliente();
			c3.setNome("Catherine");
			c3.setEndereco("Rua Glicerio, numero 88, Bairro Leste Europeu, Cidade Du Has");
			c3.setTelefone("+44159963225");
			c3.setEmail("Kate@langeweile.com");		
			System.out.println("Cliente 1\nNome: "+c1.getNome()+"\nEndereço: "+c1.getEndereco()+"\nTelefone: "+c1.getTelefone()+"\nEmail: "+c1.getEmail());
			System.out.println("Cliente 2\nNome: "+c2.getNome()+"\nEndereço: "+c2.getEndereco()+"\nTelefone: "+c2.getTelefone()+"\nEmail: "+c2.getEmail());
			System.out.println("Cliente 3\nNome: "+c3.getNome()+"\nEndereço: "+c3.getEndereco()+"\nTelefone: "+c3.getTelefone()+"\nEmail: "+c3.getEmail());
			}
}
