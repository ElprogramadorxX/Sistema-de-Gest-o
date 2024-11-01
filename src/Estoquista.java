public class Estoquista extends Funcionario {
    int tamanhoEstoque;

    public Estoquista(String nome, int idade, int salario, int horastrabalhadas, String genero, int tamanhoEstoque) {
        super(nome, idade, salario, horastrabalhadas, genero);
        this.tamanhoEstoque = tamanhoEstoque;
    }

    public int getTamanhoEstoque() {
        return tamanhoEstoque;
    }

    public void setTamanhoEstoque(int tamanhoEstoque) {
        this.tamanhoEstoque = tamanhoEstoque;
    }

    public void Estoque() {
        System.out.println("O tamanho do estoque é: " + tamanhoEstoque + " unidades.");
    }

    @Override
    public void ImprimirFicha() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Horas trabalhadas no mês: " + getHorastrabalhadas());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Salário: R$ " + getSalario());
        System.out.println("Tamanho do estoque: " + tamanhoEstoque + " unidades.");
    }
}
