public class Gerente extends Funcionario{
    int status;

    public Gerente(String nome, int idade, int salario, int horastrabalhadas, String genero, int status) {
        super(nome, idade, salario, horastrabalhadas, genero);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        if (status >= 1 && status <= 5) {
            this.status = status;
        } else {
            System.out.println("Infelismente não poderá ser contabilizado esta nota, digite uma nota de 1 a 5 para poder validar");
        }
    }
    
    public void relatorio(){
      switch (status) {
        case 1:
            System.out.println("Lamentamos pela nota, iremos melhorar");
            break;
        case 2: 
            System.out.println("Obrigado pela nota, estamos em melhorias constantes");
            break;
        case 3: 
            System.out.println("Agradeçemos pela nota, estamos em atualizações");
            break;
        case 4: 
            System.out.println("Agradeçemos pela sua nota, ficamos felizes em lhe deixar feliz");
            break;
        case 5: 
            System.out.println("Muito Obrigado!");
            break;
        default:
            break;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Gerente [status=" + status + "]";
    }
    
}