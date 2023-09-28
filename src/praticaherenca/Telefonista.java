package praticaherenca;

public class Telefonista extends Funcionario {
	private String codigoEstacao;
	
	public String getCodigoEstacao() {
		return codigoEstacao;
		
	}
	
	
 public void setCodigoEstacao(String codigoEstacao) {
	this.codigoEstacao = codigoEstacao;
	}
 public Telefonista(String nome, double salario, String codigoEstacao) {
	 super(nome, salario);
	 this.codigoEstacao = codigoEstacao;
 }
}
