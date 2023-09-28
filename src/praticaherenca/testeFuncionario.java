package praticaherenca;

public class testeFuncionario {
	public static void main(String[] args) {
 		Gerente gerente = new Gerente("Renan", 15000.0, "Renan123", "senha123");
 		
 		
 		Telefonista telefonista = new Telefonista("Maria", 1500.0, "estacao");
 		
        Secretaria secretaria = new Secretaria("Juliana", 3000.0, "Ramal123");
        
        System.out.println("Dados do Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Login: " + gerente.getLogin());
        System.out.println("Senha: " + gerente.getSenha());

        System.out.println("\nDados da Telefonista:");
        System.out.println("Nome: " + telefonista.getNome());
        System.out.println("Salário: " + telefonista.getSalario());
        System.out.println("Código Estação: " + telefonista.getCodigoEstacao());

        System.out.println("\nDados da Secretaria:");
        System.out.println("Nome: " + secretaria.getNome());
        System.out.println("Salário: " + secretaria.getSalario());
        System.out.println("Número Ramal: " + secretaria.getNumeroRamal());
    }
}


