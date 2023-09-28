package praticaherenca;

public class Funcionario {
   private String nome;
   private double salario;
   
   public String getNome() {
	   return nome;
   }
   
   
   public void steNome(String nome) {
	   this.nome = nome;
   }
   
   
   public double getSalario() {
	   return salario;
	   
   }
   
   public void setSalario(double salario) {
	   this.salario = salario;
   }
   
   public Funcionario (String nome,double salario) {
	   super();
	   this.nome = nome;
	   this.salario = salario;
   }
  
}
