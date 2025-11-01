import java.util.HashSet;
import java.util.Set;

public class HashSetRev {
    public static void main(String[] args) {
        Set<Character> guessedLetter = new HashSet<>();

        // Add some letters
        guessedLetter.add('a');
        guessedLetter.add('b');
        guessedLetter.add('c');
        guessedLetter.add('b');
        System.out.println("Guessed letters:" + guessedLetter);

        if (guessedLetter.contains('b')) {
            System.out.println("The letter `p` has already guessed");
        }
        if (!guessedLetter.contains('z')) {
            System.out.println("The letter `z` has not been guessed");
        }
    }
}
