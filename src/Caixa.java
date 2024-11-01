public class Caixa extends Funcionario{
    String turno;
    double totalvendas;
    public Caixa(String nome, int idade, int salario, int horastrabalhadas, String genero, String turno,
        double totalvendas) {
        super(nome, idade, salario, horastrabalhadas, genero);
        this.turno = turno;
        this.totalvendas = totalvendas;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public double getTotalvendas() {
        return totalvendas;
    }
    public void setTotalvendas(double totalvendas) {
        this.totalvendas = totalvendas;
    }
    public void registrarVenda(double valor) {
        totalvendas += valor;
        System.out.println("Caixa " + getNome() + " registrou uma venda de R$ " + valor + ". Total de vendas: R$ " + totalvendas);
    }
    @Override
    public void ImprimirFicha(){
        System.out.println("Nome" + nome);
        System.out.println("idade" + idade);
        System.out.println("horas trabalhadas no mês: " + horastrabalhadas);
        System.out.println("genero: " + genero);
        System.out.println("Salário : " + salario + "Reais");
        System.out.println("Turno: " + turno);
    }
}