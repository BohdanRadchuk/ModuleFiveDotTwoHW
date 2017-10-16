package Players;

import Data.ExpensivePlayersData;

public class Player4 extends ExpensivePlayersData {

    public Player4(String song1, int price) {
        super(song1, price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + getPlaylist()[getPlaylist().length-1]);
    }
}

