public class Funcionario {
    String nome;
    int idade;
    int salario;
    int horastrabalhadas;
    String genero;
    public Funcionario(String nome, int idade, int salario, int horastrabalhadas, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.horastrabalhadas = horastrabalhadas;
        this.genero = genero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getHorastrabalhadas() {
        return horastrabalhadas;
    }
    public void setHorastrabalhadas(int horastrabalhadas) {
        this.horastrabalhadas = horastrabalhadas;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    } 
    public double CalculoSalario(int horasExtras) {
        double dinheiroPorHora = (double) salario / horastrabalhadas;
        double granafonal = horasExtras * dinheiroPorHora * 1.5; 
        return salario + granafonal; 
    }
    public void ImprimirFicha(){
        System.out.println("Nome" + nome);
        System.out.println("idade" + idade);
        System.out.println("horas trabalhadas no mês: " + horastrabalhadas);
        System.out.println("genero: " + genero);
        System.out.println("Salário : " + salario + "Reais");
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", horastrabalhadas="
                + horastrabalhadas + ", genero=" + genero + "]";
    }
    
}