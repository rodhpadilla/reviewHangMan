import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random random = new Random();
        int dieRollZeroBased = random.nextInt(6);
        int finalDieRoll = dieRollZeroBased + 1;
        System.out.println("The die roll is:" + finalDieRoll);
    }
}
