public class Atendente extends Funcionario {
    String setorAtendimento;

    public Atendente(String nome, int idade, int salario, int horastrabalhadas, String genero, String setorAtendimento) {
        super(nome, idade, salario, horastrabalhadas, genero);
        this.setorAtendimento = setorAtendimento;
    }

    public String getSetorAtendimento() {
        return setorAtendimento;
    }

    public void setSetorAtendimento(String setorAtendimento) {
        this.setorAtendimento = setorAtendimento;
    }

    public void atenderCliente() {
        System.out.println("Atendente " + getNome() + " está atendendo um cliente no setor: " + setorAtendimento + ".");
    }

    @Override
    public void ImprimirFicha() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Horas trabalhadas no mês: " + getHorastrabalhadas());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Salário: R$ " + getSalario());
        System.out.println("Setor de Atendimento: " + setorAtendimento);
    }
}
