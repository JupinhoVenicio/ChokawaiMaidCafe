import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class MaidPersonality {

    static Scanner teclado = new Scanner(System.in);
    static Random random = new Random();
    static int maid = 0;

    public static void maidEscolha() {

        

        do {

            System.out.println("""

                    ╔═══════════════════════════════════════════╗
                    ║          ~ Chokawai Maid Café ~           ║
                    ║             Choose your Maid              ║
                    ╠═══════════════════════════════════════════╣
                    ║ 1. DereDere   (Sweet & loving)            ║
                    ║ 2. Tsundere   (Hot & cold)                ║
                    ║ 3. Dandere    (Quiet & shy)               ║
                    ║ 4. Yandere    (Obsessive & devoted)       ║
                    ║ 5. Genki      (Energetic & cheerful)      ║
                    ║ 6. Bakadere   (Clumsy & cute)             ║
                    ╠═══════════════════════════════════════════╣
                    ║   Please enter the number of your choice  ║
                    ╚═══════════════════════════════════════════╝
                          """);

            maid = teclado.nextInt();

            if (maid < 1 || maid > 6) {

                System.out.println("\nInvalid Input! Try again~");

            }

        } while (maid < 1 || maid > 6);

    }

    public static void maidCheckoutMessage() {

        String mensagem = "Testando...";
        int escolherMensagemAleatoria = random.nextInt(1, 4);

        switch (maid) {

            case 1:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Ehehe~ Thank you for visiting today, Master! Come back soon, okay? I already miss you~";
                        break;
                    case 2:
                        mensagem = "Master, you made my heart melt like strawberry parfait~!";
                        break;
                    case 3:
                        mensagem = "Promise you'll come back to see my smile again? Hihi~";
                        break;
                }
                break;
            case 2:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "I-It's not like I wanted you to come back or anything... b-baka!";
                        break;
                    case 2:
                        mensagem = "Hmph... you were kinda nice today... maybe I'll make you decent tea next time!";
                        break;
                    case 3:
                        mensagem = "Don't get the wrong idea! I don't like serving you... but… maybe you should visit again.";
                        break;
                }

                break;
            case 3:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Thank you for coming... I really enjoyed serving you...";
                        break;
                    case 2:
                        mensagem = "Oh... you're leaving already? I... hope you'll come back soon.";
                        break;
                    case 3:
                        mensagem = "It felt calm and warm with you here... thank you, Master.";
                        break;
                }
                break;
            case 4:
            switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Hehe... only I can serve you like this, right? You belong here... with me~";
                        break;
                    case 2:
                        mensagem = "Promise me you'll come back just for me... I'll be waiting forever.";
                        break;
                    case 3:
                        mensagem = "If I find out another maid served you... oh, no, no, no~ that would make me so jealous~";
                        break;
                }
                break;
            case 5:
            switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Yattaaa! You're the best, Master! Come back soon for more fun!";
                        break;
                    case 2:
                        mensagem = "That was so much fun! Let's do it again next time, okay?";
                        break;
                    case 3:
                        mensagem = "See ya later, Master! I'll be waiting with tons of energy and smiles!";
                        break;
                }
                break;
            case 6:
            switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Ah-oops! I almost spilled your tea again! Hehehe~ thank you for being so patient, Master!";
                        break;
                    case 2:
                        mensagem = "Eeeh? You're leaving already? I was just about to bring you the... uh... what was it again?";
                        break;
                    case 3:
                        mensagem = "Hehe~ I might be a little clumsy, but I'm your clumsy maid! Come back soon, okay?";
                        break;
                }
                break;

        }

        System.out.println(mensagem);

    }

}
