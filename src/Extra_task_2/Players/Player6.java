package Extra_task_2.Players;

import Extra_task_2.Data.ExpensivePlayersData;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Player6 extends ExpensivePlayersData {
    public Player6(String song2, int price, Pane root) {
        super(song2, price, root);
    }


    @Override
    public void playAllSongs(Pane root) {
        //String [] tempList = new String[getPlaylist().size()];
        Button buttonShuffle = new Button("shuffle playlist");
        buttonShuffle.setTranslateX(350);
        buttonShuffle.setTranslateY(60);
        buttonShuffle.setOnAction((event) -> {
            Collections.shuffle(getPlaylist());
        });
        root.getChildren().addAll(buttonShuffle);
        super.playAllSongs(root);
        /*getPlaylist().toArray(tempList);

        Button printArray = new Button("Play whole playlist ");
        printArray.setTranslateX(200);
        printArray.setTranslateY(60);

        printArray.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Text text1 = new Text("your playlist: " + Arrays.toString(tempList));
                text1.setTranslateX(450);
                text1.setTranslateY(250);
                root.getChildren().addAll(text1);
            }
        });
        root.getChildren().addAll(printArray);
*/
    }

    /* public void shuffle(){
        for (int i =0 ; i<getPlaylist().length; i ++){
            int n = (int) Math.round(-0.4999 + i  + Math.random()*(getPlaylist().length-0.0002-i));             // -0.4999 & +(.length-0.0002) сравнивают шансы выпадения граничных значений (0 и последнего элемента массива)
            String temp = getPlaylist()[i];
            getPlaylist()[i] = getPlaylist()[n];
            getPlaylist() [n] = temp;
        }
    }*/
}
