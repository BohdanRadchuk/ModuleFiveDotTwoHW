import Players.Player1;
import Players.Player2;

public class MainSong {
    public static void main(String[] args) {

        Player1 player1 = new Player1("ok song",500);
        System.out.println("player1 price = " + player1.getPrice());
        player1.playSong();
        Player2 player2 = new Player2("ok song",500);
        player2.playSong();
    }

}
