import java.util.ArrayList;
import java.util.Scanner;

public class Bebidas {

    static Scanner teclado = new Scanner(System.in);

    static Produto[] drinks = new Produto[6];
    static int menuF = -1;

    

    public static void escolherVariante() {

        int menuVar = 0;

        do {
            System.out.println("" +
                    "\n╔════════════════════════~~" +
                    "\n   Escolha uma variante:\n");
            System.out
                    .println("1 - " + drinks[menuF].sVar1 + "\n\n" + drinks[menuF].sVarDesc1 + "\n\n Price - U$ "
                            + drinks[menuF].dVar1Preco + "\n");
            System.out
                    .println("2 - " + drinks[menuF].sVar2 + "\n\n" + drinks[menuF].sVarDesc2 + "\n\n Price - U$ "
                            + drinks[menuF].dVar2Preco + "\n");
            System.out.println("" +
                    "╚════════════════════════~~");

            menuVar = teclado.nextInt();

            if (menuVar < 1 || menuVar > 2) {
                System.out.println("\n" + MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidError()+"\"");
            }

        } while (menuVar < 1 || menuVar > 2);

        Produto bebidaEmCheckout = new Produto();
        switch (menuVar) {
            case 1:
                bebidaEmCheckout.dPreco = drinks[menuF].dVar1Preco;
                bebidaEmCheckout.sNome = drinks[menuF].sVar1;
                bebidaEmCheckout.sDescricao = drinks[menuF].sVarDesc1;
                bebidaEmCheckout.bTemVariante = drinks[menuF].bTemVariante;
                App.produtoEmCheckout.add(bebidaEmCheckout);
                break;
            case 2:
                bebidaEmCheckout.dPreco = drinks[menuF].dVar2Preco;
                bebidaEmCheckout.sNome = drinks[menuF].sVar2;
                bebidaEmCheckout.sDescricao = drinks[menuF].sVarDesc2;
                bebidaEmCheckout.bTemVariante = drinks[menuF].bTemVariante;
                App.produtoEmCheckout.add(bebidaEmCheckout);
                break;

        }

        System.out.println("\n" + MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidAddProductMessage()+"\"");

    }

    public static void adicionarProduto() {

        int menuConfirmar = 0;

        if (drinks[menuF].bTemVariante == true) {
            escolherVariante();

        } else {

            do {
                System.out.println("" +
                        "\n╔════════════════════════~~" +
                        "\n         Confirm:\n");
                System.out.println("    " + drinks[menuF].sNome + "\n\n " + drinks[menuF].sDescricao
                        + "\n\n Price - U$ " + drinks[menuF].dPreco);
                System.out.println("\n 1 - Yes\t 2 - No");
                System.out.println("" +
                        "╚════════════════════════~~");

                menuConfirmar = teclado.nextInt();

                if (menuConfirmar < 1 || menuConfirmar > 2) {
                    System.out.println("\n" + MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidError()+"\"");
                }

            } while (menuConfirmar < 1 || menuConfirmar > 2);

            if (menuConfirmar == 1) {
                Produto bebidaEmCheckout = new Produto();
                bebidaEmCheckout.dPreco = drinks[menuF].dPreco;
                bebidaEmCheckout.sNome = drinks[menuF].sNome;
                bebidaEmCheckout.sDescricao = drinks[menuF].sDescricao;
                bebidaEmCheckout.bTemVariante = drinks[menuF].bTemVariante;
                App.produtoEmCheckout.add(bebidaEmCheckout);

                System.out.println(
                        "\n" + MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidAddProductMessage()+"\"");

            }
        }

    }

    public static void drinksMenu() {

        int input;
        menuF = -1;
        // CARDAPIO DEFINICAO DE VARIAVEIS//

        drinks[0] = new Produto();
        drinks[0].sNome = "Boba Tea";
        drinks[0].dVar1Preco = 8.5;
        drinks[0].dVar2Preco = 9.5;
        drinks[0].bTemVariante = true;
        drinks[0].sVar1 = "Uau ~ Koi Black Boba";
        drinks[0].sVar2 = "Very Scrumptious ~! Murasaki Dream Boba Taro";
        drinks[0].sVarDesc1 = "This black tea boba is like a gentle cuddle in a cup, with rich, toasty flavors and chewy \nlittle pearls that make every sip a happy dance, with milky-milk*. Perfect for snuggles \nand sweet moments~";
        drinks[0].sVarDesc2 = "A swirl of soft lilac magic in a cup*, creamy taro milk and chewy pearls dancing together \nfor a dreamy escape~ Every sip is like floating through a pastel twilight~!";

        drinks[1] = new Produto();
        drinks[1].sNome = "Hot Chocolate";
        drinks[1].dVar1Preco = 7;
        drinks[1].dVar2Preco = 7;
        drinks[1].bTemVariante = true;
        drinks[1].sVar1 = "Ooooh~! Moon Hotto Cocoa";
        drinks[1].sVar2 = "Sweetness Supreme~! Sun Hotto Cocoa";
        drinks[1].sVarDesc1 = " A sweet, dark chocolate hug topped with fluffy whipped cream and a sprinkle of magic \nmoonlight~ Perfect for chilly days and when you’re feeling mooody~";
        drinks[1].sVarDesc2 = " A creamy, white chocolate dream kissed by sunlight~ Soft, silky, and dazzlingly sweet \nlike a warm morning smile in a cup! Perfect for bright days, lazy afternoons.";

        drinks[2] = new Produto();
        drinks[2].sNome = "Oh so mouth-watering ~ Hugjicha Latte ( Did you get it? Hug + Hojicha )";
        drinks[2].sDescricao = "Appetizing, cozy, and oh-so-toasty!  This Hojicha Latte is a sweet hug made with roasted Japanese green tea and creamy milk. Its gentle caramel flavor and warm aroma will make your heart go \"yum!\"";
        drinks[2].dPreco = 9;
        drinks[2].bTemVariante = false;

        drinks[3] = new Produto();
        drinks[3].sNome = "Amai Flavor~! Dragonfruit Maid Meowgic";
        drinks[3].sDescricao = "Bright dragonfruit and creamy sweetness mixie-mix in this super pink smoothie~ It's our \nspecial drinkie with a magical twist!";
        drinks[3].dPreco = 18;
        drinks[3].bTemVariante = false;

        ////

        do {
            System.out.println();
            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║            ~~ Drinks Menu ~~           ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║ 1. Boba Tea                            ║");
            System.out.println("║ 2. Hot Chocolates                      ║");
            System.out.println("║ 3. Hugjicha Latte                      ║");
            System.out.println("║ 4. Dragonfruit Maid Meowgic            ║");
            System.out.println("║                                        ║");
            System.out.println("║ 5. Exit Menu                           ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║    ~~~~~~~~~~  ( =^.^= )  ~~~~~~~~~~   ║");
            System.out.println("╚════════════════════════════════════════╝");

            System.out.println("\n" + MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidBebidas()+"\"");

            input = teclado.nextInt();

            menuF = input - 1;

            System.out.println(menuF);

            if (menuF < 0 || menuF > 4) {

                System.out.println("\n" + MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidError()+"\"");
                continue;

            } else {

                if (menuF != 4) {

                    adicionarProduto();

                }

            }

        } while (menuF != 4);

    }

}
