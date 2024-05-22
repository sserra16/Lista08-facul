import java.util.*;

public class Main {
    private static final ArrayList<Empregado> empregados = new ArrayList<Empregado>();

    public static void main(String[] args) {
        start();
    }

    public static void start()
    {
        Scanner leitor = new Scanner(System.in);
        Empregado empregadoAtual = null;
        int indexAtual;
        int optionAtual;
        MenuController menu = new MenuController();


        optionAtual = menu.exibirMenu();

        switch (optionAtual) {
            case 1:
                Empregado emp = new Empregado();

                System.out.println("Digite o nome do empregado: ");
                String nome = leitor.nextLine();
                emp.setNome(nome);

                System.out.println("Digite a idade do empregado: ");
                int idade = leitor.nextInt();
                emp.setIdade(idade);

                System.out.println("Digite o salário do empregado: ");
                double salario = leitor.nextDouble();
                emp.setSalario(salario);

                empregados.add(emp);
                System.out.println("Empregado " + emp.getNome() + " criado!");
                start();
            case 2:
                if (!empregados.isEmpty()) {
                    System.out.println("Digite o número do empregado: ");
                    for (int i = 0; i < empregados.size(); i++) {
                        System.out.println(i + " - " + empregados.get(i).getNome());
                    }
                    indexAtual = leitor.nextInt();

                    empregadoAtual = empregados.get(indexAtual);
                    empregadoAtual.promover();
                    empregados.set(indexAtual, empregadoAtual);
                } else {
                    System.out.println("Não há empregados ativos!");
                }
                start();
            case 3:
                if (!empregados.isEmpty()) {
                    System.out.println("Digite o número do empregado: ");
                    for (int i = 0; i < empregados.size(); i++) {
                        System.out.println(i + " - " + empregados.get(i).getNome());
                    }

                    indexAtual = leitor.nextInt();
                    empregadoAtual = empregados.get(indexAtual);

                    System.out.println("Digite a porcentagem (somente números) do aumento de salário do empregado: ");
                    double novoSalario = leitor.nextDouble();

                    empregadoAtual.aumentarSalario(novoSalario);
                    empregados.set(indexAtual, empregadoAtual);
                } else {
                    System.out.println("Não há empregados ativos!");
                }
                start();
            case 4:
                if (!empregados.isEmpty()) {
                    System.out.println("Digite o número do empregado: ");
                    for (int i = 0; i < empregados.size(); i++) {
                        System.out.println(i + " - " + empregados.get(i).getNome());
                    }

                    indexAtual = leitor.nextInt();
                    empregadoAtual = empregados.get(indexAtual);

                    System.out.println("Digite o motivo da demissão: ");
                    System.out.println("1 - Justa causa");
                    System.out.println("2 - Decisão do empregador");
                    System.out.println("3 - Aposentadoria");

                    int motivo = leitor.nextInt();

                    empregadoAtual.demitir(motivo);

                    empregados.set(indexAtual, empregadoAtual);
                } else {
                    System.out.println("Não há empregados ativos!");
                }
                start();
            case 5:
                if (!empregados.isEmpty()) {
                    System.out.println("Digite o número do empregado: ");
                    for (int i = 0; i < empregados.size(); i++) {
                        System.out.println(i + " - " + empregados.get(i).getNome());
                    }

                    indexAtual = leitor.nextInt();
                    empregadoAtual = empregados.get(indexAtual);

                    empregadoAtual.fazerAniversario();
                    empregados.set(indexAtual, empregadoAtual);
                } else {
                    System.out.println("Não há empregados ativos!");
                }
                start();
            case 6:
                if (!empregados.isEmpty()) {
                    System.out.println("Digite o número do empregado: ");
                    for (int i = 0; i < empregados.size(); i++) {
                        System.out.println(i + " - " + empregados.get(i).getNome());
                    }

                    indexAtual = leitor.nextInt();
                    empregadoAtual = empregados.get(indexAtual);

                    System.out.println("Nome do empregado: " + empregadoAtual.getNome());
                    System.out.println("Idade do empregado: " + empregadoAtual.getIdade());
                    System.out.println("Salário do empregado: " + empregadoAtual.getSalario());
                } else {
                    System.out.println("Não há empregados ativos!");
                }
                start();
            case 7:
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
        }
    }
}