import java.util.ArrayList;
import java.util.Scanner;

public class Checkout {

    static int checkoutConfirmacao = 0;

    public static void checkoutMenu(ArrayList<Produto> produtoEmCheckout) {
        Scanner teclado = new Scanner(System.in);

        double saldoTotal = 0;

        if (produtoEmCheckout.size() == 0) {

            System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
            System.out.println(MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidErrorCheckout()+"\"");
            System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");

        } else {

            do{

                System.out.println("" +
                    "\n╔════════════════════════~~" +
                    "\n   Checkout Page: Confirm?\n");

            for (int i = 0; i < produtoEmCheckout.size(); i++) {

                Produto product = produtoEmCheckout.get(i);

                System.out.println("\n" + (i + 1) + " - " + product.sNome + " | Price: U$ " + product.dPreco);

                saldoTotal = saldoTotal + product.dPreco;

            }

            System.out.println("\nTotal: U$ " + saldoTotal);
            System.out.println("\n     1 - Yes\t2 - No");
            System.out.println("╚════════════════════════~~");

            checkoutConfirmacao = teclado.nextInt();

            if(checkoutConfirmacao<1||checkoutConfirmacao>2){

                System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");
                 System.out.println(MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidError()+"\"");
                 System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~\n");

            }


            }while(checkoutConfirmacao<1||checkoutConfirmacao>2);
            
        }

    }

}
