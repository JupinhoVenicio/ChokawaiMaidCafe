import java.util.ArrayList;
import java.util.Scanner;

public class Checkout {

    static int checkoutConfirmacao = 0;

    public static void checkoutMenu(ArrayList<Produto> produtoEmCheckout) {
        Scanner teclado = new Scanner(System.in);

        double saldoTotal = 0;

        do {

            if (produtoEmCheckout.size() == 0) {

                System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
                System.out.println(
                        MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidErrorCheckout() + "\"");
                System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
                break;

            } else {

                saldoTotal = 0;
                System.out.println("" +
                        "\n╔════════════════════════~~" +
                        "\n      Checkout Page\n");

                for (int i = 0; i < produtoEmCheckout.size(); i++) {

                    Produto product = produtoEmCheckout.get(i);

                    System.out.println("\n" + (i + 1) + " - " + product.sNome + " | Price: U$ " + product.dPreco);

                    saldoTotal = saldoTotal + product.dPreco;

                }

                System.out.println("\nTotal: U$ " + saldoTotal);
                System.out.println("\n    1 - Remove Product\t2 - Buy Checkout\t 3 - Exit Menu");
                System.out.println("╚════════════════════════~~");

                checkoutConfirmacao = teclado.nextInt();

                if (checkoutConfirmacao < 1 || checkoutConfirmacao > 3) {

                    System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
                    System.out.println(MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidError() + "\"");
                    System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");

                }

                if (checkoutConfirmacao == 1) {

                    int removeProductMenu = 0;

                    while (removeProductMenu != -1)

                    saldoTotal = 0;
                        if (produtoEmCheckout.size() > 0) {
                            System.out.println("" +
                                    "\n╔════════════════════════~~" +
                                    "\n      Remove a Product\n");

                            for (int i = 0; i < produtoEmCheckout.size(); i++) {

                                Produto product = produtoEmCheckout.get(i);

                                System.out.println(
                                        "\n" + (i + 1) + " - " + product.sNome + " | Price: U$ " + product.dPreco);

                                saldoTotal = saldoTotal + product.dPreco;

                            }

                            System.out.println("\nTotal: U$ " + saldoTotal);
                            System.out.println("\n    0 - Done");
                            System.out.println("╚════════════════════════~~");

                            removeProductMenu = teclado.nextInt() - 1;

                            if (removeProductMenu > -1) {

                                if (removeProductMenu > (produtoEmCheckout.size() - 1)) {

                                    System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
                                    System.out.println(MaidPersonality.maidName() + " Maid : \""+MaidPersonality.maidError() + "\"");
                                    System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");

                                } else {
                                    produtoEmCheckout.remove(removeProductMenu);

                                    System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
                                    System.out.println(MaidPersonality.maidName() + " Maid : \""+ MaidPersonality.maidRemoveProductMessage() + "\"");
                                    System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
                                }
                            }

                        }else{

                            break;

                        }

                }

            }
        } while (checkoutConfirmacao < 2 || checkoutConfirmacao > 3);

    }

}
