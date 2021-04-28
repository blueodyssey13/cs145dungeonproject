import java.util.Random;

public class Monster {

    private int health;
    private int damage;
    private String monsterType;

    /* Health */
    public static final int GOBLIN_HP = 6;
    public static final int ZOMBIE_HP = 12;
    public static final int ORC_HP = 18;
    public static final int DENEKE_HP = 55;

    /* Damage */
    public static final int GOBLIN_DMG = 10;
    public static final int ZOMBIE_DMG = 15;
    public static final int ORC_DMG = 20;
    public static final int DENEKE_DMG = 5;

    /* Generating Monster */
    public Monster() {
        Random random = new Random();


        this.health = GOBLIN_HP, ZOMBIE_HP, ORC_HP, DENEKE_HP;
        public Monster (int health) {
            this.health = health;
            if (this.health < 0) {
                this.health = 0;
            }
        }
    }
    private int getHealth() {
        return health;
    }
    private void setHealth(int health) {
        this.health = health;
    }


    /* Max damage this Monster inflicts */
    private int damage;
    int goblinRandomDMG = randomGenerator.nextInt(10) + 1;
    System.out.print("goblinRandomDMG is: " + goblinRandomDMG);

    int zombieRandomDMG = randomGenerator.nextInt(15) + 1;
    System.out.print("zombieRandomDMG is: " + zombieRandomDMG);

    int orcRandomDMG = randomGenerator.nextInt(20) + 1;
    System.out.print("orcRandomDMG is: " + orcRandomDMG);

    int denekeRandomDMG = randomGenerator.nextInt(5) + 1;
    System.out.print("denekeRandomDMG is: " + denekeRandomDMG);


    /* Type of this Monster */
    private String monsterType;
    Monster goblinName = new Monster("Goblin");
    Monster zombieName = new Monster("Zombie");
    Monster orcName = new Monster("Orc");
    Monster denekeName = new Monster("Deneke");


    /* Hits the targeted Player */
    public void attack(Player target) {


    }

    /* Removes health from this Monster
    when hit by a Player */
    public void onHit(int damage) {

    }
}
