public class Repositor extends Funcionario{
    public Repositor(String nome, int idade, int salario, int horastrabalhadas, String genero) {
        super(nome, idade, salario, horastrabalhadas, genero);
        
    }
    @Override
    public double CalculoSalario(int horasExtras) {
        double dinheiroPorHora = (double) salario / horastrabalhadas;
        double granafonal = horasExtras * dinheiroPorHora * 1.6; 
        return salario + granafonal; 
    }
  
}
