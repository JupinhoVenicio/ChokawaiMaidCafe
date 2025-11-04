import java.util.Scanner;

public class App {

    public class Produto {

        String sNome = "Produtos";
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
                iQuant=0;
                bEmCheckout = false;
                

            }
            this.dTotal = dPreco*iQuant;

        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu = -1;

        System.out.println("""
                ╔══════════════════════════════════════════════════╗
                ║ ╭──────────────────────────────────────────────╮ ║
                ║ │             Chokawai Maid Café               │ ║
                ║ │──────────────────────────────────────────────│ ║
                ║ │  (=^.^=)  Welcome, Master~  (=^.^=)          │ ║
                ║ │  Try our purr-fect cakes & bubble tea~       │ ║
                ║ │  Every order comes with a smile :3           │ ║
                ║ ╰──────────────────────────────────────────────╯ ║
                ╚══════════════════════════════════════════════════╝
                    ╔══════════════════════════════════╗
                    ║ 1 - Food                         ║
                    ║ 2 - Drinks                       ║
                    ║ 3 - Maid Personality             ║
                    ║ 4 - Checkout                     ║
                    ╚══════════════════════════════════╝
                    """);

                    

    }
}
