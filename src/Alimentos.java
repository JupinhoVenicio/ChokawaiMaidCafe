import java.util.ArrayList;
import java.util.Scanner;

public class Alimentos {

  static Produto[] foods = new Produto[6];
  static int menu;

  ArrayList<Produto> produtoEmCheckout = new ArrayList<>();

  public void adicionarProduto() {
    produtoEmCheckout.add(foods[menu]);
  }

  public void removerProduto() {
    produtoEmCheckout.remove(foods[menu]);
  }

  public void escolherVariante() {

    int menuVar = 0;

    do {
      System.out.println("" +
          "\n╔════════════════════════~~" +
          "\n   Escolha uma variante:\n");
      System.out.println("1 - " + Produto.sVar1 + "\n\n" + Produto.sVarDesc1 + "\nPreço - U$ " + Produto.dVar1Preco);
      System.out.println("2 - " + Produto.sVar2 + "\n\n" + Produto.sVarDesc2 + "\nPreço - U$ " + Produto.dVar2Preco);
      
      if(menu<1||menu>2){
        System.out.println(MaidPersonality.maidName() + " Maid : \"" + MaidPersonality.maidError());
      }

    } while (menu < 1 || menu > 2);

  }

  public static void foodMenu() {

    menu = -1;

    // CARDAPIO DEFINIÇÃO DE VARIAVEIS//

    foods[0] = new Produto();
    foods[0].sNome = "Pancakes";
    foods[0].sDescricao = "The most dewicious pancakes you'll ever taste! Yum~";
    foods[0].dPreco = 10;

    ////

  }

}
