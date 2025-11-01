public class Player {
    // 1. Data fields are private
    private String playerName;
    private int health;

    // Constructor to initialize the player
    public Player(String name) {
        this.playerName = name;
        this.health = 100; // Start with full health
    }

    // 2. Public "getter" method to safely access the name
    public String getPlayerName() {
        return this.playerName;
    }

    // 3. Public "getter" for health
    public int getHealth() {
        return this.health;
    }

    // 4. Public method to modify health in a controlled way
    public void takeDamage(int damageAmount) {
        if (damageAmount > 0) {
            this.health -= damageAmount;
            if (this.health < 0) {
                this.health = 0; // Health can't go below zero!
            }
        }
        System.out.println(this.playerName + " takes " + damageAmount + " damage! Remaining health: " + this.health);
    }
}