package Extra_task_2.Players;

import Extra_task_2.Data.CheapPlayersData;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Player2 extends CheapPlayersData {

    public Player2(String song1, int price, Pane root) {
        super(song1, price, root );
    }

    /*@Override
    public void playSong() {
        System.err.println("error");
    }*/

    @Override
    public void playOneSong(Pane root) {
        Button playsong = new Button("Play song");
        playsong.setTranslateX(200);
        playsong.setTranslateY(10);

        playsong.setOnMouseClicked(event -> {

            Text text = new Text("Error" );
            text.setFont(Font.font ("Verdana", 20));
            text.setFill(Color.RED);
            text.setTranslateX(250);
            text.setTranslateY(250);
            root.getChildren().addAll(text);
        });
        root.getChildren().addAll(playsong);
    }


}

