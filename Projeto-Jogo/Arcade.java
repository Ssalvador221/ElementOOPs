import Menu.MenuInicial;

public class Arcade {
    public static void main(String[] args) {
        int opcao = MenuInicial.menuNovoJogo();

        if (opcao == 1) {
            System.out.println("BOAA RAPARIGA");
        } else {
            System.out.println("-- Fechando o Programa --");
            System.exit(0);
        }

    }
}
