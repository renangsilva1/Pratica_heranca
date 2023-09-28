package praticaherenca;
 
public class Gerente extends Funcionario {
	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
		
	}

	public void steLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Gerente (String nome, double salario, String login, String senha) {
		super(nome, salario);
		this.login = login;
		this.senha = senha;
		
	}
}
