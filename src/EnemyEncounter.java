import java.util.Random;

public class EnemyEncounter {
    public static void main(String[] args) {
        Random random = new Random();
        int enemyNumChance = random.nextInt(1, 101);
        Enemy enemy = Enemy.fromInt(enemyNumChance);

        switch (enemy) {
            case GOBLIN, ORC, DRAGON -> System.out.println("Chance value:" + enemyNumChance + ". An " + enemy.getEnemyType() + " appears!");
        }

    }
}
