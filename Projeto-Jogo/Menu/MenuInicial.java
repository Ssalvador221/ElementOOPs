package Menu;

import java.util.Scanner;

public class MenuInicial {

    public static int menuNovoJogo() {
      int opcao;
      boolean valido;
      Scanner opcaoSelecionada = new Scanner(System.in);

      do {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println(" Selecione 1 para : Novo Jogo *");
        System.out.println(" Selecione 2 para : Sair do Programa");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.print("Selecione uma das Opçoes Acima: ");
        opcao = opcaoSelecionada.nextInt();

        valido = (opcao == 1) || (opcao == 2);
        if (!valido) {
          System.out.println("Opcao invalida!");
        }
      } while (!valido);

      return opcao;
    }


}
