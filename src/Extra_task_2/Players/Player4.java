package Extra_task_2.Players;

import Extra_task_2.Data.ExpensivePlayersData;
import javafx.scene.layout.Pane;

public class Player4 extends ExpensivePlayersData {

    public Player4(String song1, int price, Pane root) {
        super(song1, price, root);
    }

    @Override
    public void playAndShow(Pane root) {

        super.playAndShow(root);
        super.setSong1(super.getPlaylist().get(super.getPlaylist().size()-1));            //????last massive element
    }

    @Override
    public void playSong() {
    //    System.out.println("Playing: " + getPlaylist()[getPlaylist().length-1]);
    }
}

