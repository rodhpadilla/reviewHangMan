public class TestingGameLobby {
    public static void main(String[] args) {
//        GameLobby gameLobby = new GameLobby();
        System.out.println(GameLobby.LOBBYSIZE);
        Gamer player0 = new Gamer("Alice");
        Gamer player1 = new Gamer("Rod");
        Gamer player2 = new Gamer("Negrita");
        Gamer player3 = new Gamer("Pelucho");
        Gamer player4 = new Gamer("Negrita");
        GameLobby.joinLobby(player1);
        GameLobby.joinLobby(player2);
        GameLobby.joinLobby(player3);
        GameLobby.displayLobby();
        GameLobby.joinLobby(player0);
        GameLobby.joinLobby(player4);
        GameLobby.displayLobby();
    }
}
