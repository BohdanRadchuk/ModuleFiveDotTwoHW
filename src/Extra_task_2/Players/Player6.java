package Extra_task_2.Players;
import Extra_task_2.Data.ExpensivePlayersData;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import java.util.Collections;

public class Player6 extends ExpensivePlayersData {
    public Player6(String song2, int price, Pane root) {
        super(song2, price, root);
    }


    @Override
    public void playAllSongs(Pane root) {
        Button buttonShuffle = new Button("shuffle playlist");
        buttonShuffle.setTranslateX(350);
        buttonShuffle.setTranslateY(60);

        buttonShuffle.setOnAction(event -> {
            Collections.shuffle(getPlaylist());
        });
        root.getChildren().addAll(buttonShuffle);
        super.playAllSongs(root);
    }
}
