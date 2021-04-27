
/* Contains the Rooms in the dungeon 
and logic for Player movement */
public class DungeonMap {

    private final String MAP_CORNER = "+";
    private final String MAP_SIDES = "|";
    private final String MAP_TOP_BOTTOM = "-";
    private final String THIEF_ICON = "T";
    private final String WARRIOR_ICON = "W";

	/* Rooms in the dungeon */
    private Room[][] rooms;

    /* Reference to the Player in the dungeon */
    private Player player;


    //player location
    private int playerLocationX = 1;
    private int playerLocationY = 1;

    /* Initializes the rooms and shared Player reference */
    public DungeonMap (int rows, int columns, Player player){
        rooms = new Room[rows][columns];
        for (i=0; i<=Room.length(); i++){
            for (j = 0; j <= Room[i].length(); j++){
                Room[i][j] = new Room();
            }
        }

    }

    /* Displays the dungeon's rooms, walls,
    and player's current location */
    public void PrintMap() {
        //top
        System.out.print(MAP_CORNER);
        for (i = 0; i <= Room[0].length(); i++){
            System.out.print(MAP_TOP_BOTTOM);
        }
        System.out.print(MAP_CORNER);

        //sides
        for(i = 0; i < room[0].length; ){
            System.out.print(MAP_SIDES);
            for (j=0; j<= room[i].length; j++){

                if (playerlocationX.equals(i)){
                    if (player.getPlayerClass().equals("1")){
                        System.out.print(WARRIOR_ICON);
                    }
                    else if( player.getPlayerClass().equals("2")){
                        System.out.print(THIEF_ICON);

                    }   
                }
                else if (room[i][j].hasVisited = False){
                    System.out.print(" ");

                }
                else{
                    System.out.print("*");
                }

            }
        }

        //bottom
        System.out.print(MAP_CORNER);
        for (i = 0; i <= Room[0].length(); i++){
            System.out.print(MAP_TOP_BOTTOM);
        }
        System.out.print(MAP_CORNER);

    }
	

}
