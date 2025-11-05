import java.util.Scanner;

public class App {

    public class Produto {

        String sNome = "Produtos";
        String sDescricao = "Exemplo";

        double dPreco = 0;
        boolean bEmCheckout = false;
        int iQuant = 0;
        double dTotal = 0;

        public void adicionarProduto() {

            bEmCheckout = true;
            iQuant++;
            this.dTotal = dPreco * iQuant;

        }

        public void removerProduto() {

            iQuant--;

            if (iQuant <= 0) {
                iQuant = 0;
                bEmCheckout = false;

            }
            this.dTotal = dPreco * iQuant;

        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu = -1;

        MaidPersonality.maidEscolha();

        System.out.println(""+
            "\n╔══════════════════════════════════════════════════╗"+
            "\n║ ╭──────────────────────────────────────────────╮ ║            ( ("+
            "\n║ │             Chokawai Maid Café               │ ║             ) )"+
            "\n║ │──────────────────────────────────────────────│ ║          ________"+
            "\n║ │  (=^.^=)  Welcome, Master~  (=^.^=)          │ ║          |      | ]"+
            "\n║ │  Try our purr-fect cakes & bubble tea~       │ ║          |      /"+
            "\n║ │  Every order comes with a smile :3           │ ║           `----'"+
            "\n║ ╰──────────────────────────────────────────────╯ ║        -----||-----"+
            "\n╚══════════════════════════════════════════════════╝\n");
            
                   
                           System.out.println(MaidPersonality.maidName()+" Maid : \""+MaidPersonality.maidIntro()+"\"6");
                           
                           do{
                            System.out.println(""+
                            "\n╔══════════════════════════════════╗"+
                            "\n║ 1 - Food (Delicious treats!)     ║"+
                            "\n║ 2 - Drinks (Made with love~)     ║"+
                            "\n║ 3 - Checkout (All ready master~) ║"+
                            "\n╚══════════════════════════════════╝");

                       menu = teclado.nextInt();

                       switch(menu){
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
                        System.out.println(MaidPersonality.maidError());




                       }


                           }while(Checkout.checkoutConfirmacao!=1);
                

                          
    }
}
