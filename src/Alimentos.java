import java.util.ArrayList;
import java.util.Scanner;

public class Alimentos {
  Scanner teclado = new Scanner(System.in);

  static Produto[] foods = new Produto[6];
  static int menu;

  ArrayList<Produto> produtoEmCheckout = new ArrayList<>();

  public void adicionarProduto() {

    int menuConfirmar = 0;
    if (foods[menu].bTemVariante = false) {
      do {
        System.out.println("" +
            "\n╔════════════════════════~~" +
            "\n   Confirmar?:\n");
        System.out.println("    " + foods[menu].sNome + "\n\n " + foods[menu].sDescricao
            + "\n Preço - U$ " + foods[menu].dPreco);
        System.out.println("\n1 - Sim\t 2 - Não");
        System.out.println("" +
          "╚════════════════════════~~");

        menuConfirmar = teclado.nextInt();

        if (menuConfirmar < 1 || menuConfirmar > 2) {
          System.out.println("\n" + MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidError());
        }

      } while (menuConfirmar < 1 || menuConfirmar > 2);

      if (menuConfirmar == 1) {
        Produto alimentoEmCheckout = new Produto();
        alimentoEmCheckout.dPreco = foods[menu].dPreco;
        alimentoEmCheckout.sNome = foods[menu].sNome;
        alimentoEmCheckout.sDescricao = foods[menu].sDescricao;
        produtoEmCheckout.add(alimentoEmCheckout);

        System.out.println("\n" + MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidAddProductMessage());

      }

    } else {
      escolherVariante();
    }

  }

  public void escolherVariante() {

    int menuVar = 0;

    do {
      System.out.println("" +
          "\n╔════════════════════════~~" +
          "\n   Escolha uma variante:\n");
      System.out
          .println("1 - " + foods[menu].sVar1 + "\n\n" + foods[menu].sVarDesc1 + "\nPreço - U$ "
              + foods[menu].dVar1Preco + "\n");
      System.out
          .println("2 - " + foods[menu].sVar2 + "\n\n" + foods[menu].sVarDesc2 + "\nPreço - U$ "
              + foods[menu].dVar2Preco + "\n");
      System.out.println("" +
          "╚════════════════════════~~");

      menuVar = teclado.nextInt();

      if (menuVar < 1 || menuVar > 2) {
        System.out.println("\n" + MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidError());
      }

    } while (menuVar < 1 || menuVar > 2);

    Produto alimentoEmCheckout = new Produto();
    switch (menuVar) {
      case 1:
        alimentoEmCheckout.dPreco = foods[menu].dVar1Preco;
        alimentoEmCheckout.sNome = foods[menu].sVar1;
        alimentoEmCheckout.sDescricao = foods[menu].sVarDesc1;
        produtoEmCheckout.add(alimentoEmCheckout);
        break;
      case 2:
        alimentoEmCheckout.dPreco = foods[menu].dVar2Preco;
        alimentoEmCheckout.sNome = foods[menu].sVar2;
        alimentoEmCheckout.sDescricao = foods[menu].sVarDesc2;
        produtoEmCheckout.add(alimentoEmCheckout);
        break;

    }

    System.out.println("\n" + MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidAddProductMessage());

  }

  public static void foodMenu() {

    int menuFood = -1;

    // CARDAPIO DEFINICAO DE VARIAVEIS//

    foods[0] = new Produto();
    foods[0].sNome = "Pancakes";
    foods[0].sDescricao = "The most dewicious pancakes you'll ever taste~! Yum~";
    foods[0].dVar1Preco = 10;
    foods[0].dVar2Preco = 13;
    foods[0].bTemVariante = true;
    foods[0].sVar1 = "Nya Nya ~ Kidamari Pancakes";
    foods[0].sVar2 = "So yummy ~ Fuwafuwa Berry Pancakes";
    foods[0].sVarDesc1 = "Our pancakes are made with flour, eggs, and milky-milk~  Topped with a tiny pat of butter, sweet \nmaple syrup, and a sprinkle of magical powdered sugar~  Yum yum~! ";
    foods[0].sVarDesc2 = "Keeping with our milky tradition, this one is all made with love, served with fresh berries \nand a touch of sugar on top, slurp slurp~!";

    foods[1] = new Produto();
    foods[1].sNome = "Parfaits";
    foods[1].sDescricao = "Sweety-sweet layers of ice cream, fruit, and fluffy cream~ Mmm!";
    foods[1].dVar1Preco = 9.5;
    foods[1].dVar2Preco = 12;
    foods[1].bTemVariante = true;
    foods[1].sVar1 = "Kawai ~ Torori Matcha Parfait";
    foods[1].sVar2 = "Very delicious~! Peachy Ushi Parfaits";
    foods[1].sVarDesc1 = "Delectable matcha ice cream with tiny sweet red beans (so yummy~!), soft whipped \ncream clouds, and crunchy granola sprinkles~! All served in a tall glass just for you~! \nDrizzle a little syrup~ Mmmh~  Sugoi delicious~!";
    foods[1].sVarDesc2 = "Tasty layers of sweet peach~  and creamy malted milk~! Little bites of juicy fruit hug \nyour taste buds~  Topped with a swirl of whipped cream clouds and a sprinkle of \nmagical golden sugar~  Amazingly amazing~!";

    foods[2] = new Produto();
    foods[2].sNome = "Japanese Crepes";
    foods[2].sDescricao = "The most perfect, cwispiest~, and rolled with all our love~!";
    foods[2].dVar1Preco = 9.5;
    foods[2].dVar2Preco = 8;
    foods[2].bTemVariante = true;
    foods[2].sVar1 = "Mmh~! Sakura Kurepu";
    foods[2].sVar2 = "Oooh~! Umami Kurepu";
    foods[2].sVarDesc1 = "A deliciously-delicious delicacy guaranteed to make your mouth water~! A crunchy, but \ndreamy texture of strawberry and whipped cream~ melting in a sweet mix which bursts \ninto a wave of flavor bound to leave you wanting more~!";
    foods[2].sVarDesc2 = "One of our recommendations for ones with more savory mouths~! Packed with smoked \nsalmon (blub)~ creamy cheese and seasoned with some chive. Yummy indeed~!";

    foods[3] = new Produto();
    foods[3].sNome = "Purrfect ~ Aoi Hōseki Pie";
    foods[3].sDescricao = "Delicious tart filled with sweet, juicy blueberries~!  Each bite is like tiny blue jewels \ndancing on your tongue~ Coated  with a jizz of magical sugar~  Yum yum~!";
    foods[3].dPreco = 20;
    foods[3].bTemVariante = false;

    foods[4] = new Produto();
    foods[4].sNome = "Fuwa Fuwa :3 ~ Amai Miruku Waffles";
    foods[4].sDescricao = "Waffles going kaboom~! (Woohoo) with flavor, topped with our finest dulce de leche~!, \nand decorated with sugar. Meowstic~ :3";
    foods[4].dPreco = 8;
    foods[4].bTemVariante = false;

    foods[5] = new Produto();
    foods[5].sNome = "Purrrr ~! Kokoro Gâteau";
    foods[5].sDescricao = "A warm little chocolate treasure, soft on the outside and gooey in the center~ Each bite \nis like a tiny hug for your heart~ A warm dessert for cold days~!";
    foods[5].dPreco = 15;
    foods[5].bTemVariante = false;



    ////

  }

}
