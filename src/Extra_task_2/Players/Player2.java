package Extra_task_2.Players;

import Extra_task_2.Data.CheapPlayersData;

public class Player2 extends CheapPlayersData {

    public Player2(String song1, int price) {
        super(song1, price);
    }

    @Override
    public void playSong() {
        System.err.println("error");
    }
}
