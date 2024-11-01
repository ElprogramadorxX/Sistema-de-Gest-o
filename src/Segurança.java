public class Segurança extends Funcionario {
    int nivelRisco;
    int setor;

    public Segurança(String nome, int idade, int salario, int horastrabalhadas, String genero, int nivelRisco, int setor) {
        super(nome, idade, salario, horastrabalhadas, genero);
        this.nivelRisco = nivelRisco;
        this.setor = setor;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(int nivelRisco) {
        this.nivelRisco = nivelRisco;
    }

    public int getSetor() {
        return setor;
    }

    public void setSetor(int setor) {
        this.setor = setor;
    }

    public void VigiadoSetor() {
        System.out.println("O setor " + setor + ", cujo nível de risco é " + nivelRisco + ", está sendo vigiado pelo segurança " + getNome() + ".");
    }
    @Override
    public void ImprimirFicha(){
        System.out.println("Nome" + nome);
        System.out.println("idade" + idade);
        System.out.println("horas trabalhadas no mês: " + horastrabalhadas);
        System.out.println("genero: " + genero);
        System.out.println("Salário : " + salario + "Reais");
        System.out.println("Setor em que trabalha " + setor);
    }
}
