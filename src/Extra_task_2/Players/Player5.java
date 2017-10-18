package Extra_task_2.Players;

import Extra_task_2.Data.ExpensivePlayersData;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class Player5 extends ExpensivePlayersData {
    public Player5(String song2, int price, Pane root) {
        super(song2, price, root);
    }

    @Override
    public void playAllSongs(Pane root) {
        ArrayList <String> tempList = new ArrayList<>();
        for (int i = 0; i<getPlaylist().size(); i++){
            tempList.add(getPlaylist().get(getPlaylist().size()-i-1));
        }
        Button printArray = new Button("Play whole playlist ");
        printArray.setTranslateX(200);
        printArray.setTranslateY(60);

        printArray.setOnMouseClicked(event -> {
            Text text1 = new Text("your playlist: " + Arrays.toString(tempList.toArray()));
            text1.setTranslateX(450);
            text1.setTranslateY(250);
            root.getChildren().addAll(text1);
        });
        root.getChildren().addAll(printArray);
    }



/*  @Override
    public void playPlaylist() {
        for(int i = getPlaylist().length-1; i>=0; i--)
            System.out.println("Playing: " + getPlaylist()[i] );

    }*/
}
