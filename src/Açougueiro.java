public class Açougueiro extends Funcionario{
    String qualificacao, tipoCorte;
    public Açougueiro(String nome, int idade, int salario, int horastrabalhadas, String genero, String qualificacao) {
        super(nome, idade, salario, horastrabalhadas, genero);
        this.qualificacao = qualificacao;
    }
    public String getQualificacao() {
        return qualificacao;
    }
    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }
    public void TipoCorte(String tipoCorte){
        System.out.println("Digite um dos tipos de corte a seguir: Filé, Picanha, Alcatra e Costela");
        
        switch (tipoCorte.toLowerCase()) {
            case "filé":
                System.out.println("Preparando um corte tipo: Filé");
                break;
            case "picanha":
                System.out.println("Preparando um corte tipo: Picanha");
                break;
            case "alcatra":
                System.out.println("Preparando um corte tipo: Alcatra");
                break;
            case "costela":
                System.out.println("Preparando um corte tipo: Costela");
                break;
            default:
                System.out.println("Tipo de corte desconhecido. Por favor, escolha um corte válido.");
                break;
        }
    }
    @Override
    public void ImprimirFicha(){
        System.out.println("Nome" + nome);
        System.out.println("idade" + idade);
        System.out.println("horas trabalhadas no mês: " + horastrabalhadas);
        System.out.println("genero: " + genero);
        System.out.println("Salário : " + salario + "Reais");
        System.out.println("Qualificação: " + qualificacao);
    }
}