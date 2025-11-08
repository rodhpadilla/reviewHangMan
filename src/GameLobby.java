import java.util.ArrayList;

public class GameLobby {
    public static final int LOBBYSIZE = 4;
    private static ArrayList<Gamer> gamerList =  new ArrayList<>();

    private GameLobby(){
    }

    public static void joinLobby(Gamer player) {
        if (gamerList.size() >= LOBBYSIZE) {
            System.out.println("Lobby is Full, " + player.getUsername() + " cannot join!");
            return;
        }
        if (gamerList.contains(player)) {
            System.out.println(player.getUsername() + " is already in the lobby");
            return;
        }
        gamerList.add(player);
        System.out.println("Success, " + player.getUsername() + " joined the lobby!");
    }

    public static void displayLobby() {
        System.out.println("--- Game Lobby (" + gamerList.size() + "/" + LOBBYSIZE + ") ---");
        if (gamerList.isEmpty()) {
            System.out.println("No players in the Lobby");
        } else {
            System.out.println("Gamers:");
            for (Gamer gamerItem : gamerList){
                System.out.println(".- " + gamerItem.getUsername());
            }
        }
    }
}
