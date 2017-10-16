package Players;

import Data.ExpensivePlayersData;

public class Player5 extends ExpensivePlayersData {
    public Player5(String song2, int price) {
        super(song2, price);
    }

    @Override
    public void playPlaylist() {
        for(int i = getPlaylist().length-1; i>=0; i--)
            System.out.println("Playing: " + getPlaylist()[i] );

    }
}
