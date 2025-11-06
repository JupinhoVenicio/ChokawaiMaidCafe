import java.util.ArrayList;
import java.util.Scanner;

public class Alimentos {
  Scanner teclado = new Scanner(System.in);

  static Produto[] foods = new Produto[6];
  static int menu;

  ArrayList<Produto> produtoEmCheckout = new ArrayList<>();

  public void adicionarProduto() {
    if (foods[menu].bTemVariante = false) {
      Produto alimentoEmCheckout = new Produto();
      alimentoEmCheckout.dPreco = foods[menu].dPreco;
      alimentoEmCheckout.sNome = foods[menu].sNome;
      alimentoEmCheckout.sDescricao = foods[menu].sDescricao;
      produtoEmCheckout.add(alimentoEmCheckout);
    }else{
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

  }

  public static void foodMenu() {

    menu = -1;

    // CARDAPIO DEFINICAO DE VARIAVEIS//

    foods[0] = new Produto();
    foods[0].sNome = "Pancakes";
    foods[0].sDescricao = "The most dewicious pancakes you'll ever taste! Yum~";
    foods[0].dVar1Preco = 10;
    foods[0].dVar2Preco = 13;
    foods[0].bTemVariante = true;
    foods[0].sVar1 = "Nya Nya ~ Kidamari Pancakes";
    foods[0].sVar2 = "So yummy~ Fuwafuwa Berry Pancakes";
    foods[0].sVarDesc1 = "Our pancakes are made with flour, eggs, and milky-milk~  Topped with a tiny pat of butter, sweet\n maple syrup, and a sprinkle of magical powdered sugar~  Yum yum~! ";
    foods[0].sVarDesc2 = "Savory pancakes made with flour, eggs, and milk, topped with a pat of butter, sweet maple syrup, and a little sprinkle of powdered sugar.";
            

    ////

  }

}
