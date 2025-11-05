import java.util.Scanner;
import java.util.ArrayList;

public class App {

    ArrayList<Produto> produtoEmCheckout = new ArrayList<>();

    public class Produto {

        String sNome = "Produtos";
        String sDescricao = "Exemplo";
        double dPreco = 0;
        boolean bTemVariante = false;
        int iQuant = 0;
        double dTotal = 0;
        int iVariante = 0;
        String sVar1 = "Test";
        String sVarDesc1 = "Test";
        String sVar2 = "Test";
        String sVarDesc2 = "Test";

        public void adicionarProduto() {

            iQuant++;
            this.dTotal = dPreco * iQuant;

        }

        public void removerProduto() {

            iQuant--;

            if (iQuant <= 0) {
                iQuant = 0;

            }
            this.dTotal = dPreco * iQuant;

        }

        public void escolherVariante() {

            int menu = 0;

            System.out.println(""+
            "\n╔════════════════════════~~"+
            "\n   Escolha uma variante:\n");
            System.out.println(sVar1+"\n\n"+sVarDesc1+"\n");
            System.out.println(sVar2+"\n\n"+sVarDesc2+"\n");

        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu = -1;

        MaidPersonality.maidEscolha();

        System.out.println("" +
                "\n╔══════════════════════════════════════════════════╗" +
                "\n║ ╭──────────────────────────────────────────────╮ ║         ( (" +
                "\n║ │             Chokawai Maid Café               │ ║          ) )" +
                "\n║ │──────────────────────────────────────────────│ ║       ________" +
                "\n║ │      (=^.^=)  Welcome, Master~  (=^.^=)      │ ║       |      | ]" +
                "\n║ │     Try our perfect cakes & beverages~       │ ║       |      /" +
                "\n║ │      Every order comes with a smile :3       │ ║        `----'" +
                "\n║ ╰──────────────────────────────────────────────╯ ║     -----||-----" +
                "\n╚══════════════════════════════════════════════════╝\n");

        System.out.println(MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidIntro() + "\"");

        do {
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
                    Checkout.checkoutMenu();

                    break;
                default:
                    System.out.println(MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidError());

            }

        } while (Checkout.checkoutConfirmacao != 1);

    }
}
