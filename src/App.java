import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Segurança s1 = new Segurança("Ronaldo", 30, 2000, 60, "Masculino", 3, 1);
        Gerente g1 = new Gerente("Carla", 29, 2700, 70, "Feminino", 0);
        Estoquista e1 = new Estoquista("Henrique", 30, 2100, 60, "Masculino", 700);
        Padaria p1 = new Padaria("Giovana", 21, 1900, 65, "Feminino", "Bolos");
        Repositor r1 = new Repositor("Renato", 27, 2200, 50, "Não-binário");
        Atendente a1 = new Atendente("Douglas", 31, 1400, 70, "Masculino", "Suporte");
        Segurança s2 = new Segurança("Henrico", 48, 2200, 60, "Masculino", 5, 7);
        Repositor r2 = new Repositor("Ilualberto", 35, 2000, 70, "Não-Binário");
        Estoquista e2 = new Estoquista("Alberto", 20, 1300, 40, "Masculino", 500);
        Gerente g2 = new Gerente("Otto", 21, 3700, 80, "Masculino", 2);
        Manutenção m1 = new Manutenção("Marcela", 29, 1900, 40, "Feminino", "Manutenção de computadores", 3);
        Manutenção m2 = new Manutenção("Marcelo", 35, 1900, 50, "Masculino", "manutenção de Softwares", 3);
        Entregador dv1 = new Entregador("Edivaldo", 40, 2000, 50, "Mascilino", 300, "Moto", 5);
        Entregador dv2 = new Entregador("Edvalda", 33, 2000, 50, "Feminino", 450, "Moto", 9);
        Entregador dv3 = new Entregador("Ednaldo", 34, 2100, 60, "Masculino", 200, "bicicleta", 8);
        Entregador dv4 = new Entregador("Gabriela", 39, 2000, 50, "Feminino", 300, "Moto", 7);
        Produto produto = new Produto(14.99, "Latcinios", "Queijo");
        Produto produto2 = new Produto(29.99, "Congelados", "Frango");
        Produto produto3 = new Produto(9.99, "Condimentos", "Adolçante");
        Produto produto4 = new Produto(50.00, "Congelados", "Peito de Peru");
        Produto produto5 = new Produto(3.99, "Chocolates", "Chocolate de marcaX");


        ArrayList<Funcionario> Lista = new ArrayList<>();
        Lista.add(a1);
        Lista.add(s1);
        Lista.add(g1);
        Lista.add(e1);
        Lista.add(p1);
        Lista.add(r1);
        Lista.add(e2);
        Lista.add(s2);
        Lista.add(g2);
        Lista.add(r2);
        Lista.add(m1);
        Lista.add(m2);
        Lista.add(dv1);
        Lista.add(dv2);
        Lista.add(dv3);
        Lista.add(dv4);

        ArrayList<Produto> ListaProd = new ArrayList<>();
        ListaProd.add(produto);
        ListaProd.add(produto2);
        ListaProd.add(produto3);
        ListaProd.add(produto4);
        ListaProd.add(produto5);

        Menu(Lista , ListaProd);
    }

    public static void Menu(ArrayList<Funcionario> Lista , ArrayList<Produto> ListaProd) {
        Scanner bot = new Scanner(System.in);
        boolean v = true;

        // reduzir número de opções (ver abaixo)

        while (v) {
            System.out.println("Digite 0 para sair do programa");
            System.out.println("Digite 1 para adicionar um novo Segurança");
            System.out.println("Digite 2 para adicionar um novo Repositor");
            System.out.println("Digite 3 para adicionar um novo Gerente");
            System.out.println("Digite 4 para adicionar um novo Assistente de Gerente");
            System.out.println("Digite 5 para adicionar um novo Atendente");
            System.out.println("Digite 6 para adicionar um novo Padeiro");
            System.out.println("Digite 7 para adicionar um novo Açougueiro");
            System.out.println("Digite 8 para adicionar um novo Estoquista");
            System.out.println("Digite 9 para remover um Segurança");
            System.out.println("Digite 10 para remover um Repositor");
            System.out.println("Digite 11 para remover um Gerente");
            System.out.println("Digite 12 para remover um Assistente de Gerente");
            System.out.println("Digite 13 para remover um Atendente");
            System.out.println("Digite 14 para remover um Padeiro");
            System.out.println("Digite 15 para remover um Açougueiro");
            System.out.println("Digite 16 para remover um Estoquista");
            System.out.println("Digite 17 para mostrar todos os funcionários");
            System.out.println("Digite 18 para mostrar os salários dos funcionários");
            System.out.println("Digite 19 para mostrar os produtos existentes");
            System.out.println("Digite 20 para adicionar mais produtos");
            System.out.println("Digite 21 para remover um produto");
            System.out.println("Digite 22 para adicionar um novo funcionário da Manutenção: ");
            System.out.println("Digite 23 para remover um funcionário da manutenção");
            System.out.println("Digite 24 para adicionar um entregador");
            System.out.println("Digite 25 para remover o entregador");
                       
            int escolha = bot.nextInt();
            bot.nextLine();

            // em vez de fazer um case para criar cada tipo de funcionário, é melhor fazer só um case para criação e remoção e separar lá *

            switch (escolha) {
                case 0:
                    v = false;
                    System.out.println("Saindo do programa...");
                    break;
                case 1:
                    System.out.println("Digite o nome do Segurança: ");
                    String nome = bot.nextLine();
                    System.out.println("Digite a idade do funcionário: ");
                    int id = bot.nextInt();
                    System.out.println("Digite o salário do funcionário: ");
                    int salario = bot.nextInt();
                    System.out.println("Digite a carga horária deste funcionário: ");

                    // no lugar de nextInt seguido de nextLine, pode-se colocar Integer.parseInt(bot.nextLine)

                    int carga = bot.nextInt();
                    bot.nextLine();
                    System.out.println("Digite o gênero deste funcionário: ");
                    String genero = bot.nextLine();

                    // * aqui pode ser pedida a função do funcionário e feito um switch para adicionar os atributos únicos do funcionário

                    System.out.println("Digite o setor em que ele está trabalhando: ");
                    int setor = bot.nextInt();
                    System.out.println("Digite o nível de risco deste setor: ");
                    int nvl = bot.nextInt();
                    Segurança novoSeg = new Segurança(nome, id, salario, carga, genero, nvl, setor);
                    Lista.add(novoSeg);
                    System.out.println("Segurança adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome do novo Repositor: ");
                    String nomeRep = bot.nextLine();
                    System.out.println("Digite a idade do repositor: ");
                    int idadeRep = bot.nextInt();
                    System.out.println("Digite o salário do repositor: ");
                    int salarioRep = bot.nextInt();
                    System.out.println("Digite a carga horária do repositor: ");
                    int cargaRep = bot.nextInt();
                    bot.nextLine();
                    System.out.println("Digite o gênero do repositor: ");
                    String generoRep = bot.nextLine();
                    Repositor novoRep = new Repositor(nomeRep, idadeRep, salarioRep, cargaRep, generoRep);
                    Lista.add(novoRep);
                    System.out.println("Repositor adicionado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o nome do Gerente: ");
                    String nomeGer = bot.nextLine();
                    System.out.println("Digite a idade do Gerente: ");
                    int idadeGer = bot.nextInt();
                    System.out.println("Digite o salário do Gerente: ");
                    int salarioGer = bot.nextInt();
                    System.out.println("Digite a carga horária do Gerente: ");
                    int cargaGer = bot.nextInt();
                    bot.nextLine();
                    System.out.println("Digite o gênero do Gerente: ");
                    String generoGer = bot.nextLine();
                    System.out.println("Digite a nota de avaliação do departamento: ");
                    int nota = bot.nextInt();
                    Gerente novoGer = new Gerente(nomeGer, idadeGer, salarioGer, cargaGer, generoGer, nota);
                    Lista.add(novoGer);
                    System.out.println("Gerente adicionado com sucesso!");
                    break;
                    case 4:
                    System.out.println("Digite o nome do Assistente do Gerente: ");
                    String assNome = bot.nextLine();
                    System.out.println("Digite a idade deste assistente de gerente: ");
                    int asIdade = bot.nextInt();
                    bot.nextLine(); // Consumir a nova linha pendente
                    System.out.println("Digite o salário deste assistente: ");
                    int Sgerente = bot.nextInt();
                    bot.nextLine(); // Consumir a nova linha pendente
                    System.out.println("Digite a carga horária deste assistente: ");
                    int hrAssistennte = bot.nextInt();
                    bot.nextLine(); // Consumir a nova linha pendente
                    System.out.println("Digite o Gênero deste assistente: ");
                    String GnrAssis = bot.nextLine();
                    System.out.println("Digite o departamento que este assistente trabalha: ");
                    String departamento = bot.nextLine();
                    AssistenteGerente Asientente = new AssistenteGerente(assNome, asIdade, Sgerente, hrAssistennte, GnrAssis, departamento);
                    Lista.add(Asientente);
                    System.out.println("Gerente adicionado com sucesso");
                    break;                
                case 5: 
                    System.out.println("Digite o nome do Novo atendente: ");
                    String AtendNome = bot.nextLine();
                    System.out.println("Digite a idade deste funcionário: ");
                    int AtendIdade = bot.nextInt();
                    System.out.println("Digite o salário deste atendente: ");
                    int sAtend = bot.nextInt();
                    System.out.println("Digite a carga horária de trabalho deste atendente: ");
                    int CargaAtend = bot.nextInt();
                    System.out.println("Digite o Genero deste funcionário: ");
                    String Generoatend = bot.nextLine();
                    System.out.println("Digite o setor de atendimento que este funcionário trabalha: ");
                    String setordeAtendimento = bot.nextLine();
                    Atendente atendenteNovato = new Atendente(AtendNome, AtendIdade, sAtend, CargaAtend, Generoatend, setordeAtendimento);
                    Lista.add(atendenteNovato);
                    System.out.println("Atendente adicionado com sucesso");
                    break; 
                case 6: 
                    System.out.println("Digite o nome do novo Padeiro: ");
                    String nomePad = bot.nextLine();
                    System.out.println("Digite a idade do novo padeiro: ");
                    int idPad = bot.nextInt();
                    System.out.println("Digite o salário deste novo padeiro: ");
                    int salarioPad = bot.nextInt();
                    System.out.println("Digite a Carga horária do novo funcionário: ");
                    int horarioFuncionario =  bot.nextInt();
                    System.out.println("Digite qual é o genero do novo funcionário: ");
                    String gnrPad = bot.nextLine();
                    System.out.println("Digite a especialidade do novo padeiro: ");
                    String especialidade = bot.nextLine();
                    Padaria NovoPad = new Padaria(nomePad, idPad, salarioPad, horarioFuncionario, gnrPad, especialidade);
                    Lista.add(NovoPad);
                    System.out.println("Novo Padeiro foi adicionado com sucesso.");
                    break; 
                case 7: 
                    System.out.println("Digite o nome do novo Acougeiro: ");
                    String nomeAco = bot.nextLine();
                    System.out.println("Digite a idade do noco açougeiro: ");
                    int AcoIdade = bot.nextInt();
                    System.out.println("Digite o Salário do novo açougeiro: ");
                    int SAcougue = bot.nextInt();
                    System.out.println("Digite a carga horária do novo açougeiro: ");
                    int cargaAco = bot.nextInt();
                    System.out.println("Digite o genero do novo açougeiro(a): ");
                    String GeneroAco = bot.nextLine();
                    System.out.println("Digite a qualificação deste novo açougeiro: ");
                    String Qualificacao = bot.nextLine();
                    System.out.println("Digite o tipo de corte: ");
                    Açougueiro NovoAco = new Açougueiro(nomeAco, AcoIdade, SAcougue, cargaAco, GeneroAco, Qualificacao);
                    Lista.add(NovoAco);
                    System.out.println("Açougueiro adicionado com Sucesso. ");
                    break; 
                case 8: 
                    System.out.println("Digite o nome do novo Estoquista: ");
                    String nomeEstoq = bot.nextLine();
                    System.out.println("Digite a idade do novo estoquista: ");
                    int idadeEstoq = bot.nextInt();
                    System.out.println("Digite o salário do novo estoquista: ");
                    int salarioEstoq = bot.nextInt();
                    System.out.println("Digite a carga horária do novo estoquista: ");
                    int cargaEstoq = bot.nextInt();
                    bot.nextLine(); 
                    System.out.println("Digite o gênero do novo estoquista: ");
                    String generoEstoq = bot.nextLine();
                    System.out.println("Digite o valor dos produtos em estoque: ");
                    int valorEstoque = bot.nextInt();
                    Estoquista novoEstoq = new Estoquista(nomeEstoq, idadeEstoq, salarioEstoq, cargaEstoq, generoEstoq, valorEstoque);
                    Lista.add(novoEstoq);
                    System.out.println("Estoquista adicionado com sucesso!");
                    break;
                case 9:

                    // não é preciso fazer um case separado para cada tipo de funcionário para remoção, já que a remoção usa um atributo da classe Funcionario

                    System.out.println("Digite o nome do segurança que você pretende remover: ");
                    String deletarSeg = bot.nextLine();
                    boolean removido = false;
                    for(int i = 0; i < Lista.size(); i++){
                      Funcionario funcionario = Lista.get(i);
                        if (funcionario instanceof Segurança && funcionario.getNome().equalsIgnoreCase(deletarSeg) ) {
                            Lista.remove(i);
                            removido = true;
                            System.out.println("Ooperador removido com sucesso. ");
                        }
                    }
                    if (!removido) {
                        System.out.println("Funcionário não encontrado. ");
                    }
                    break; 
                case 10: 
                    System.out.println("Digite o nome do Repositor que se deseja remover: ");
                    String deletarRep = bot.nextLine();
                    boolean repositorDeletado = false;
                    for(int i = 0; i < Lista.size(); i++){
                        Funcionario funcionario = Lista.get(i);
                        if (funcionario instanceof Repositor && funcionario.getNome().equalsIgnoreCase(deletarRep)){
                        Lista.remove(i);
                        repositorDeletado = true;
                        System.out.println("repositor removido com sucesso. ");     
                        break;         
                        }
                    }
                    if (!repositorDeletado) {
                        System.out.println("Funcionário não encontrado");
                    }
                    break;
                case 11: 
                    System.out.println("Digite o nome do Gerente que se deseja remover: ");
                    String deletarGerente = bot.nextLine();
                    boolean gerenteDeletado = false;
    
                    for (int i = 0; i < Lista.size(); i++) {
                    Funcionario funcionario = Lista.get(i);
                    if (funcionario instanceof Gerente && funcionario.getNome().equalsIgnoreCase(deletarGerente)) {
                    Lista.remove(i);
                    gerenteDeletado = true;
                    System.out.println("Gerente removido com sucesso.");
                    break;
                    }
                }
                    if (!gerenteDeletado) {
                    System.out.println("Gerente não encontrado.");
                    }
                 break;
                case 12: 
                    System.out.println("Digite o nome do Assistente de Gerente que se deseja remover: ");
                    String deletarAssistente = bot.nextLine();
                    boolean assistenteDeletado = false;
            
                for (int i = 0; i < Lista.size(); i++) {
                    Funcionario funcionario = Lista.get(i);
                if (funcionario instanceof AssistenteGerente && funcionario.getNome().equalsIgnoreCase(deletarAssistente)) {
                    Lista.remove(i);
                    assistenteDeletado = true;
                    System.out.println("Assistente Encontrado com Sucesso. ");
                    break;
                }
            }
            
                if (!assistenteDeletado) {
                System.out.println("Funcionário não encontrado");
            }
            break;
        case 13: 
            System.out.println("Digite o nome do Atendente que se deseja remover: ");
            String deletarAtendente = bot.nextLine();
            boolean atendenteDeletado = false;
            
            for (int i = 0; i < Lista.size(); i++) {
                Funcionario funcionario = Lista.get(i);
                if (funcionario instanceof Atendente && funcionario.getNome().equalsIgnoreCase(deletarAtendente)) {
                    Lista.remove(i);
                    atendenteDeletado = true;
                    System.out.println("Atendente removido com sucesso.");
                    break;
                }
            }
            
            if (!atendenteDeletado) {
                System.out.println("Atendente não encontrado.");
            }
            break;
        case 14: 
                System.out.println("Digite o nome do Padeiro que se deseja remover: ");
                String deletarPadeiro = bot.nextLine();
                boolean padeiroDeletado = false;
    
            for (int i = 0; i < Lista.size(); i++) {
                Funcionario funcionario = Lista.get(i);
                if (funcionario instanceof Padaria && funcionario.getNome().equalsIgnoreCase(deletarPadeiro)) {
                Lista.remove(i);
                padeiroDeletado = true;
                System.out.println("Padeiro removido com sucesso.");
                break;
            }
        }
    
            if (!padeiroDeletado) {
            System.out.println("Padeiro não encontrado.");
        }
        break;
    case 15: 
        System.out.println("Digite o nome do Açougueiro que se deseja remover: ");
        String deletaracougeiro = bot.nextLine();
        boolean removeracogeiro = false;
    
        for (int i = 0; i < Lista.size(); i++) {
        Funcionario funcionario = Lista.get(i);
        if (funcionario instanceof Açougueiro && funcionario.getNome().equalsIgnoreCase(deletaracougeiro)) {
            Lista.remove(i);
            removeracogeiro = true;
            System.out.println("Açougueiro removido com sucesso.");
            break;
        }
    }
    
        if (!removeracogeiro) {
        System.out.println("Açougueiro não encontrado.");
        }
    break;
    case 16: 
        System.out.println("Digite o nome do estoquista que você pretende remover: ");
        String deletarEstoquista = bot.nextLine();
        boolean removidoEstoq = false;
        for(int i = 0; i < Lista.size(); i++){
        Funcionario funcionario = Lista.get(i);
        if (funcionario instanceof Estoquista && funcionario.getNome().equalsIgnoreCase(deletarEstoquista)) {
            Lista.remove(i);
            removidoEstoq = true;
            System.out.println("Estoquista deletado com sucesso. ");
            break; 
        }
    }
    
        if (!removidoEstoq) {
        System.out.println("Funcionário não encontrado. ");
        }
    break;
    case 17: 
        for (Funcionario funcionario : Lista) {
            System.out.println(funcionario);
        }
    break;
    case 18:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de horas extras para o cálculo do salário:");
        int horasExtras = scanner.nextInt();
        System.out.println("Salários dos funcionários com horas extras:");
        for (Funcionario funcionario : Lista) {
        System.out.println("Nome: " + funcionario.getNome() + " - Salário Total: R$" + funcionario.CalculoSalario(horasExtras));
        }
    break;
    case 19: 
        for (Produto Produto : ListaProd) {
            System.out.println(Produto);
        }
        break;
    case 20: 
        System.out.println("Digite o preço do produto: ");
        int precoProd = bot.nextInt();
        System.out.println("Digite a categoria que este produto Pertençe: ");
        String Categoria = bot.nextLine();
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = bot.nextLine();
        Produto NovoProd = new Produto(precoProd, Categoria, nomeProduto);
        ListaProd.add(NovoProd);
        System.out.println("produto adicionado com Sucesso! ");
        break;
    case 21: 
        System.out.println("Digite o nome do item que você pretende remover: ");
        String deletarProduto = bot.nextLine();
        boolean produtoDeletado = false;
        for(int i = 0; i < ListaProd.size(); i++){
            Produto product = ListaProd.get(i);
            if (product instanceof Produto && product.getNome().equalsIgnoreCase(deletarProduto)) {
                ListaProd.remove(i);
                produtoDeletado = true;
                System.out.println("Produto removido com sucesso! ");
                break;
            }
            if (!produtoDeletado) {
                System.out.println("Funcionário não encontrado, verifique a sua lista");
            }
        }
        default:
        
        // seria melhor colocar o default no fim do switch

        System.out.println("Opção inválida.");
        break;
    case 22:

        // colocar o funcionários abaixo junto aos outros

        System.out.println("Digite o nome do novo funcário da manutenção: ");
        String nomeMan = bot.nextLine();
        System.out.println("Digite a idade do novo funcionário: ");
        int idadeMan = bot.nextInt();
        System.out.println("Digite qual será o salário do novo funcionário: ");
        int manSalario = bot.nextInt();
        System.out.println("Digite a carga horária do novo funcionário: ");
        int trampo = bot.nextInt();
        System.out.println("Digite o genero do novo funcionário: ");
        String generodoMan = bot.nextLine();
        System.out.println("Digite a especialidade do novo funcionário: ");
        String tecnica = bot.nextLine();
        System.out.println("Digite o setor em que este funcionário irá trabalhar: ");
        int pavilhao = bot.nextInt();
        Manutenção Manovo = new Manutenção(nomeMan, idadeMan, manSalario, trampo, generodoMan, tecnica, pavilhao);
        Lista.add(Manovo);
        System.out.println("Funcionário adicionado com sucesso!");
        System.out.println("------------");
        break;
    case 23: 
    System.out.println("Digite o nome do funcionário da manutenção que você deseja remover: ");
    String Manudeletado = bot.nextLine();
    boolean manremovido = false;
    
    for(int i = 0; i < Lista.size(); i++){
        Funcionario funcionario = Lista.get(i);
        if (funcionario instanceof Funcionario && funcionario.getNome().equalsIgnoreCase(Manudeletado)) {
            manremovido = true;
            Lista.remove(i);
            System.out.println("Funcionário removido com sucesso!");
            break;
        }
    }
    
    if (!manremovido) {
        System.out.println("Funcionário não encontrado.");
    }
        break; 
    case 24: 
        System.out.println("Digite o nome do entregador: ");
        String entregNome = bot.nextLine();
        System.out.println("Digite a idade do novo funcionário: ");
        int idEntreg = bot.nextInt();
        System.out.println("Digite o Salário do novo funcionário: ");
        int salarioEntreg = bot.nextInt();
        System.out.println("Digite a carga horária do novo funcionáiro: ");
        int CargaT = bot.nextInt();
        System.out.println("Digite o genero do novo funcionário: ");
        String g = bot.nextLine();
        System.out.println("Digite a quantidade de entregas realizadas: ");
        int q = bot.nextInt();
        System.out.println("Digite o transporte usado: ");
        String t = bot.nextLine();
        System.out.println("Digite a nota que foi dada para este funcionário: ");
        int n = bot.nextInt();
        Entregador N = new Entregador(entregNome, idEntreg, salarioEntreg, CargaT, g, q, t, n);
        Lista.add(N);
        System.out.println("Funcionário adicionado com sucesso. ");
        break;
    case 25: 
        System.out.println("Digite o nome do funcionário: ");
        String E = bot.nextLine();
        boolean b = false;
        for(int i = 0; i < Lista.size(); i++){
            Funcionario funcionario = Lista.get(i);
            if (funcionario instanceof Funcionario && funcionario.getNome().equalsIgnoreCase(E)) {
                b = true;
                System.out.println("Funcionário removido com sucesso. ");
            }
            if (!b) {
                System.out.println("Não encontrado. ");
            }
        }
            break;
            }
        }
        bot.close();
    }
}
