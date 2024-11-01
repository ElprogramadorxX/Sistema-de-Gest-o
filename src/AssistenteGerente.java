public class AssistenteGerente extends Funcionario{
    String departamento;

    public AssistenteGerente(String nome, int idade, int salario, int horastrabalhadas, String genero,
        String departamento) {
        super(nome, idade, salario, horastrabalhadas, genero);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void Supervisionamento(){
        System.out.println("O assistente" + getNome() + "Será responsável pelo departamento: " + departamento);
    }
    @Override
    public void ImprimirFicha(){
        System.out.println("Nome" + nome);
        System.out.println("idade" + idade);
        System.out.println("horas trabalhadas no mês: " + horastrabalhadas);
        System.out.println("genero: " + genero);
        System.out.println("Salário : " + salario + "Reais");
        System.out.println("Departamento designado: " + departamento);
    }
}