import Menu.MenuInicial;

public class Arcade {
    public static void main(String[] args) {
        int opcaoMenuInicial = MenuInicial.menuNovoJogo();

        if (opcaoMenuInicial == 1) {
            MenuInicial.selecionaCriatura();
        } else {
            System.out.println("-- Fechando o Programa --");
            System.exit(0);
        }

    }
}
