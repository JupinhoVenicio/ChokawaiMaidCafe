import java.util.Random;
import java.util.Scanner;

public class MaidPersonality {

    static Scanner teclado = new Scanner(System.in);
    static Random random = new Random();
    static int maid = 0;

    public static void maidEscolha() {

        do {

            System.out.println("" +
                    "\n╔═══════════════════════════════════════════╗" +
                    "\n║          ~ Chokawai Maid Café ~           ║" +
                    "\n║  (=^.^=) Welcome! Take a seat! (=^.^=)    ║" +
                    "\n║                                           ║" +
                    "\n║         Please choose your Maid ;3        ║" +
                    "\n╠═══════════════════════════════════════════╣" +
                    "\n║ 1. DereDere        (Sweet & loving)       ║" +
                    "\n║ 2. Tsundere        (Intense & cold)       ║" +
                    "\n║ 3. Dandere         (Quiet & shy)          ║" +
                    "\n║ 4. Yandere         (Obsessive & devoted)  ║" +
                    "\n║ 5. Genki           (Energetic & cheerful) ║" +
                    "\n║ 6. Nyandere        (Cutesy & kitty)       ║" +
                    "\n║ 7. No preference   (Random)               ║" +
                    "\n╠═══════════════════════════════════════════╣" +
                    "\n║  Please enter the number of your choice:  ║" +
                    "\n╚═══════════════════════════════════════════╝");

            maid = teclado.nextInt();

            if (maid < 1 || maid > 7) {

                System.out.println("" +
                        "\n╔═════════════════════════════════════════╗" +
                        "\n║      Invalid input! Try again~ >:3      ║" +
                        "\n╚═════════════════════════════════════════╝");

            }

            if (maid == 7) {

                maid = (random.nextInt(6)) + 1;

            }

        } while (maid < 1 || maid > 7);

    }

    public static String maidName() {

        String mensagem = "Testing...";

        switch (maid) {

            case 1:
                mensagem = "DereDere";
                break;
            case 2:
                mensagem = "Tsundere";
                break;
            case 3:
                mensagem = "Dandere";
                break;
            case 4:
                mensagem = "Yandere";
                break;
            case 5:
                mensagem = "Genki";
                break;
            case 6:
                mensagem = "Nyandere";
                break;

        }
        return mensagem;

    }

    public static String maidIntro() {

        String mensagem = "Testing...";

        switch (maid) {

            case 1:
                mensagem = "Hehe~ Master, what would you like today? Some yummy food, a drink full of love, or maybe it's time to check out~?";
                break;
            case 2:
                mensagem = "H-Hey! I don't care what you pick or anything... but hurry up already, baka! The menu's right there!";
                break;
            case 3:
                mensagem = "Um... Master... please choose what you'd like. I'll prepare it carefully for you...";
                break;
            case 4:
                mensagem = "You can pick anything you want, Master~ as long as it's me who serves it... hehe";
                break;
            case 5:
                mensagem = "Let's go, Master! Food, drinks, checkout, whatever you choose, I'll make it awesome!";
                break;
            case 6:
                mensagem = "Nyaa~ I forgotted what comes furst! Foodies? Drinkies? Oh! You pick, Master-nyan! Hehehe~";
                break;

        }
        return mensagem;

    }

    public static String maidAddProductMessage() {

        String mensagem = "Testing...";
        int escolherMensagemAleatoria = (random.nextInt(3)) + 1;

        switch (maid) {

            case 1:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Aww~ another treat for Master? You deserve all the sweetness in the world!";
                        break;
                    case 2:
                        mensagem = "Hehe~ You have such good taste, Master! I knew you'd pick that one~!";
                        break;
                    case 3:
                        mensagem = "Yay! I'll make sure this one is extra special, just for you~";
                        break;
                }
                break;
            case 2:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "H-Hey! Don't think I added that because I like you or anything!";
                        break;
                    case 2:
                        mensagem = "Ugh… fine, I'll put it in your cart... but only because it looks good, okay?";
                        break;
                    case 3:
                        mensagem = "Hmph! Don't get any ideas... I just thought you might want that one!";
                        break;
                }

                break;
            case 3:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Oh... you want this one too? Okay... I'll add it carefully.";
                        break;
                    case 2:
                        mensagem = "That's a lovely choice... it suits you, Master.";
                        break;
                    case 3:
                        mensagem = "I'll make sure it's perfect before serving... thank you for choosing it.";
                        break;
                }
                break;
            case 4:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Hehe... every item you pick makes me love you more, Master~";
                        break;
                    case 2:
                        mensagem = "I'll guard this order with my life... no one else will touch it.";
                        break;
                    case 3:
                        mensagem = "You're adding that? Perfect… I knew you'd pick what I wanted for you~!";
                        break;
                }
                break;
            case 5:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Woohoo~ another one in the basket! Let's gooo, Master!";
                        break;
                    case 2:
                        mensagem = "You're on a roll! Everything you pick looks so yummy!";
                        break;
                    case 3:
                        mensagem = "Nyahaha~ I'll make sure it's ready faster than a sugar rush!";
                        break;
                }
                break;
            case 6:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Nyaa~ Oopsie! I almost fumbled it, mew! But no worries, it's all safe and sound now, hehe~!";
                        break;
                    case 2:
                        mensagem = "Nyaa, you picked that one? Eeeh~ I was just thinking about it too, meow!";
                        break;
                    case 3:
                        mensagem = "Wait... did I gets it right, nya? O-oh, phew! Yay, it's in youw checkouts now, meow~";
                        break;
                }
                break;

        }

        return mensagem;

    }

    public static String maidRemoveProductMessage() {

        String mensagem = "Testing...";
        int escolherMensagemAleatoria = (random.nextInt(3)) + 1;

        switch (maid) {

            case 1:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Aww... you're taking that one out? I'll miss it... but I'll still smile for you, Master~";
                        break;
                    case 2:
                        mensagem = "Ehehe~ maybe next time, right? I'll keep it warm in my heart until then!";
                        break;
                    case 3:
                        mensagem = "Oh no... it was such a cute choice! But if it makes you happy, I'll let it go~";
                        break;
                }
                break;
            case 2:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Hmph! Fine, remove it! Like I even cared about that stupid order anyway!";
                        break;
                    case 2:
                        mensagem = "Tch... you always change your mind... b-baka.";
                        break;
                    case 3:
                        mensagem = "Whatever! It's not like I wanted to serve that one for you or anything!";
                        break;
                }

                break;
            case 3:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Oh... you don't want it anymore? That's okay... I'll take it back quietly.";
                        break;
                    case 2:
                        mensagem = "I understand... maybe next time, Master.";
                        break;
                    case 3:
                        mensagem = "I'll remove it carefully... I hope you find something you like better.";
                        break;
                }
                break;
            case 4:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Huh? You're removing that? But... I thought you loved it... just like me...";
                        break;
                    case 2:
                        mensagem = "Hehe... that's okay, Master~ as long as you don't remove me~";
                        break;
                    case 3:
                        mensagem = "You can change your order... but you can't escape my love~ hehe~";
                        break;
                }
                break;
            case 5:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Oh nooo~ you're removing it? Aww, it was such a fun pick!";
                        break;
                    case 2:
                        mensagem = "That's okay, Master! There's always next time! Let's find something even better!";
                        break;
                    case 3:
                        mensagem = "Hehe~ changing your mind keeps things exciting! Let's make your order perfect!";
                        break;
                }
                break;
            case 6:
                switch (escolherMensagemAleatoria) {
                    case 1:
                        mensagem = "Nyaa~ I just added that, meow! Wait, oh, you changed your mind, purrrr? Hehe, okay-nyan~!";
                        break;
                    case 2:
                        mensagem = "Nyaa~ Oopsie-daisies! Did I make a boo-boo, meow? Oh, you wanted it gone, purrfect! All fixed now, nya!";
                        break;
                    case 3:
                        mensagem = "Nyaa? Gone alweady? Aww... I'll miss it, it was so sparkly, meow~!";
                        break;
                }
                break;

        }

        return mensagem;

    }

    public static String maidCheckoutMessage() {

        String mensagem = "Testing...";
        int escolherMensagemAleatoria = (random.nextInt(3)) + 1;

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
                        mensagem = "Ah-oops! I almost spilled your yum-yum tea again, meow! Hehehe~ Tankyu for being so patient, my purrfect Master, nya~!";
                        break;
                    case 2:
                        mensagem = "Nyaaa? You're going already, meow? I was just gonna get you the... uh... what was it, nya?";
                        break;
                    case 3:
                        mensagem = "Hehe~ Nyaaa, I might be a wittle clumsy, but I'm gonna be your clumsy maid, meow! Pwease come back again soon, okay nya?";
                        break;
                }
                break;

        }

        return mensagem;

    }

    public static String maidError() {

        String mensagem = "Testing...";

        switch (maid) {

            case 1:
                mensagem = "Ehehe~ that's not possible, Master! Try again, okay? I'll wait right here for you~";
                break;
            case 2:
                mensagem = "Wha-are you blind or something?! That's not even an option, baka! Ugh... try again!";
                break;
            case 3:
                mensagem = "Oh... that number isn't right… please check again, Master...";
                break;
            case 4:
                mensagem = "Be careful... I don't like it when you stray from the right choices~";
                break;
            case 5:
                mensagem = "Whoopsie! That's not one of the options, Master! Let's try again, okay? You got this!";
                break;
            case 6:
                mensagem = "Eeeh?! Nyaaa, I think you b-broke the menu, meow! ...Oh wait-no, that's just me, hehe~ Try again, Master nyaaa!";
                break;

        }
        return mensagem;

    }

}
