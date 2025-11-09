import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<Produto> produtoEmCheckout = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu = -1;

        MaidPersonality.maidEscolha();

        System.out.println("" +
                "\n╔══════════════════════════════════════════════════╗" +
                "\n║ ╭──────────────────────────────────────────────╮ ║         ( (" +
                "\n║ │   Chokawai Maid Café | João Vítor, Vitor     │ ║          ) )" +
                "\n║ │   IFRS Campus Osorio | 101 Info              │ ║          ( (" +
                "\n║ │──────────────────────────────────────────────│ ║       ________" +
                "\n║ │      (=^.^=)  Welcome, Master~  (=^.^=)      │ ║       |      | ]" +
                "\n║ │     Try our perfect cakes & beverages~       │ ║       |      /" +
                "\n║ │      Every order comes with a smile :3       │ ║        `----'" +
                "\n║ ╰──────────────────────────────────────────────╯ ║     -----||-----" +
                "\n╚══════════════════════════════════════════════════╝\n");

        System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
        System.out.println(MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidIntro() + "\"");
        System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");

        while (Checkout.checkoutConfirmacao != 2)

        {
            System.out.println("" +
                    "\n╔══════════════════════════════════╗" +
                    "\n║ 1 - Food (Delicious treats!)     ║" +
                    "\n║ 2 - Drinks (Made with love~)     ║" +
                    "\n║ 3 - Checkout (All ready master~) ║" +
                    "\n╚══════════════════════════════════╝");

            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    Alimentos.foodMenu();
                    break;
                case 2:
                    Bebidas.drinksMenu();
                    break;
                case 3:
                    Checkout.checkoutMenu(produtoEmCheckout);

                    break;
                default:
                    System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
                    System.out.println(MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidError() + "\"");
                    System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");

            }

        }

        System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
        System.out.println(MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidCheckoutMessage() + "\"");
        System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
        teclado.close();
    }

}
