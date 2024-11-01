public class Manutenção extends Funcionario{
    String especialidade;
    int setor;
    public Manutenção(String nome, int idade, int salario, int horastrabalhadas, String genero, String especialidade,
            int setor) {
        super(nome, idade, salario, horastrabalhadas, genero);
        this.especialidade = especialidade;
        this.setor = setor;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public int getSetor() {
        return setor;
    }
    public void setSetor(int setor) {
        this.setor = setor;
    }
    @Override
    public void ImprimirFicha(){
        System.out.println("Nome" + nome);
        System.out.println("idade" + idade);
        System.out.println("horas trabalhadas no mês: " + horastrabalhadas);
        System.out.println("genero: " + genero);
        System.out.println("Salário : " + salario + "Reais");
    }
}