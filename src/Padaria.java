public class Padaria extends Funcionario {
    String especialidade;

    public Padaria(String nome, int idade, int salario, int horastrabalhadas, String genero, String especialidade) {
        super(nome, idade, salario, horastrabalhadas, genero);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void PrepararProduto(String especialidade) {
        switch (especialidade.toLowerCase()) {
            case "pão":
                System.out.println("Preparando pão fresco.");
                break;
            case "bolo":
                System.out.println("Preparando um bolo delicioso.");
                break;
            case "croissant":
                System.out.println("Preparando croissants amanteigados.");
                break;
            case "biscoito":
                System.out.println("Preparando biscoitos crocantes.");
                break;
            case "pão de queijo":
                System.out.println("Preparando pão de queijo quentinho.");
                break;
            default:
                System.out.println("Especialidade desconhecida. Por favor, escolha um produto válido.");
                break;
        }
    }

    @Override
    public void ImprimirFicha() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Horas trabalhadas no mês: " + getHorastrabalhadas());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Salário: R$ " + getSalario());
        System.out.println("Especialidade: " + especialidade);
    }
}
