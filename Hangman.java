import java.security.Guard;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = randomWord();
        System.out.print("Guess: ");
        char guess = scan.nextLine().charAt(0);
        char[] placeholders = new char[word.length()];
        for (int i = 0; i < placeholders.length; i++) {
            placeholders[i] = '_';
        }

        int misses = 0;

        while (misses < 6) {

        }

    }

    /**
     * Function name: randomWord()
     * 
     * @return words (String [])
     * 
     *         Inside function: return random workds from String[] words array.
     */

    public static String randomWord() {
        Random rnd = new Random();
        int random = rnd.nextInt(words.length);
        return words[random];
    }

    /**
     * Function name: checkGuess()
     * 
     * @param word  (String)
     * @param guess (char)
     * @return boolean
     * 
     *         Inside function: return true if the user guessed a letter from the
     *         word correctly.
     * 
     */

    public static boolean checkGuess(String word, char guess) {
        for (int i = 0; i < words.length; i++) {
            if (word.charAt(i) == guess) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function name: updatePlaceholders()
     * 
     * @param placeholders (char[])
     * @param guess        (char)
     * @param word         (String)
     * 
     *                     Inside the function: updates the placeholders when the
     *                     user makes a correct guess.
     */

    public static void updatePlaceholders(char[] placeholders, char guess, String word) {
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j) == guess) {
                placeholders[j] = guess;
            }
        }
    }

    /**
     * Function name: printPlaceholders()
     * 
     * @param placeholders (char[])
     * 
     *                     Inside the function: prints the placeholders.
     */

    public static void printPlaceholders(char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++) {
            System.out.println(placeholders);
        }
    }

    

}
