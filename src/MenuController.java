import java.util.*;

public class MenuController {
    final Scanner leitor = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Criar novo empregado");
        System.out.println("2 - Promover empregado");
        System.out.println("3 - Aumentar salário empregado");
        System.out.println("4 - Demitir empregado");
        System.out.println("5 - Fazer aniversário do empregado");
        System.out.println("6 - Mostrar detalhes  do empregado");
        System.out.println("7 - Sair");
        return leitor.nextInt();
    }
}
