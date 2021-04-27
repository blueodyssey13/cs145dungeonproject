import java.util.Random;
import java.util.Scanner;

/* Represents a Room in the Dungeon, where
encounters with Monsters and Loot occur */
public class Room {
    /* Indicates whether or not this Room
    instance has been visited already */
    private boolean roomVisited;

	/* Handles encounter logic when a Player
	enters this Room. Includes combat resolution
	and obtaining loot. */
    public void enter(Player player) {
        Random random = new Random();
        Scanner getUserInput = new Scanner(System.in);

        if (roomVisited != true){

            int randomEvent = random.nextInt(2);

            //combat = 0, loot = 1

            if (randomEvent = 0){
                //sarah doing combat
            }

            else if (randomEvent = 1){
                int randomLoot = random.nextInt(2);

                if(randomLoot = 0){ //gold
                    
                    player.onLoot(random.nextInt(45)+5); //min 5 gp max 50gp
                    roomVisited = true;

                }

                if(randomLoot = 1){ //heal

                    player.onHeal(random.nextInt(30)+20); // min 20 hp max 50 hp
                    roomVisited = true;
                    
                }

            }

        }

    }

    /* Accessor for the visited field */
    public boolean hasVisited() {
        return this.roomVisited;
    }
}
