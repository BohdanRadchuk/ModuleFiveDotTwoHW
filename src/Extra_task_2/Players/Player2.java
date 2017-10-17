package Extra_task_2.Players;

import Extra_task_2.Data.CheapPlayersData;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Player2 extends CheapPlayersData {

    public Player2(String song1, int price, Pane root) {
        super(song1, price, root );
    }

    @Override
    public void playSong() {
        System.err.println("error");
    }

    @Override
    public void playAndShow(Pane root) {
        Button newSong = new Button("do you want to enter other song?");
        newSong.setTranslateX(400);
        newSong.setTranslateY(10);
        root.getChildren().addAll(newSong);
        newSong.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                show(root);
            }
        });

        Button playsong = new Button("Play song");
        playsong.setTranslateX(200);
        playsong.setTranslateY(10);

        playsong.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                Text text = new Text("Error" );
                text.setFont(Font.font ("Verdana", 20));
                text.setFill(Color.RED);
                text.setTranslateX(250);
                text.setTranslateY(250);
                root.getChildren().addAll(text);
            }
        });
        Button getPrice = new Button("Player price");
        getPrice.setTranslateX(300);
        getPrice.setTranslateY(10);

        getPrice.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Text text1 = new Text("This player price is " + getPrice());

                text1.setTranslateX(250);
                text1.setTranslateY(200);
                root.getChildren().addAll(text1);
            }
        });
        root.getChildren().addAll(playsong, getPrice);
    }

}

