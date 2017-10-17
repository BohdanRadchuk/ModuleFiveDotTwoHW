package Extra_task_2.Players;

import Extra_task_2.Data.ExpensivePlayersData;
import javafx.scene.layout.Pane;

public class Player5 extends ExpensivePlayersData {
    public Player5(String song2, int price, Pane root) {
        super(song2, price, root);
    }

  /*  @Override
    public void playPlaylist() {
        for(int i = getPlaylist().length-1; i>=0; i--)
            System.out.println("Playing: " + getPlaylist()[i] );

    }*/
}
