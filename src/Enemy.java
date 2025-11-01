public enum Enemy {
    GOBLIN("Goblin"),
    ORC("Orc"),
    DRAGON("Dragon");

    private final String enemyType;

    Enemy(final String enemyType) {
        this.enemyType = enemyType;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public static Enemy fromInt(int randomNumber) {
        if (randomNumber <= 60) {
            return GOBLIN;
        }
        else if (randomNumber <= 90) {
            return ORC;
        }
        else {
            return DRAGON;
        }
    }
}
