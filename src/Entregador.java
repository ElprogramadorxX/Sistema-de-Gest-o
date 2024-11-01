public class Entregador extends Funcionario {
    int nentregas;
    String transporte;
    int avaliacoes;
    public Entregador(String nome, int idade, int salario, int horastrabalhadas, String genero, int nentregas,
            String transporte, int avaliacoes) {
        super(nome, idade, salario, horastrabalhadas, genero);
        this.nentregas = nentregas;
        this.transporte = transporte;
        this.avaliacoes = avaliacoes;
    }
    public int getNentregas() {
        return nentregas;
    }
    public void setNentregas(int nentregas) {
        this.nentregas = nentregas;
    }
    public String getTransporte() {
        return transporte;
    }
    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }
    public int getAvaliacoes() {
        return avaliacoes;
    }
    public void setAvaliacoes(int avaliacoes) {
        this.avaliacoes = avaliacoes;
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
