package Extra_task_2.Data;


import Extra_task_2.MainSong;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class ExpensivePlayersData extends CheapPlayersData {


    public ArrayList<String> getPlaylist() {
        return playlist;
    }

    /*public String [] getPlaylist() {
            return playlist;
        }*/
    ArrayList<String> playlist = new ArrayList<String>();
    //private String[] playlist = new String[] {null , "The best song", "Good song", "Super Song"};                                 //initializing playlist array

    public ExpensivePlayersData(String song2, int price, Pane root) {
        super(song2, price, root);
    //    playlist[0] = song2;
    }

    @Override
    public void show(Pane root) {
        root.getChildren().clear();

        TextField textField1 = new TextField("enter song name");
        textField1.setTranslateX(10);
        textField1.setTranslateY(10);
        Button buttonPlusSong = new Button("one more song");
        buttonPlusSong.setTranslateX(200);
        buttonPlusSong.setTranslateY(10);
        root.getChildren().addAll(buttonPlusSong);
        buttonPlusSong.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                playlist.add(textField1.getText());
            }
        });

        Button button = new Button("end your playlist");
        button.setTranslateX(350);
        button.setTranslateY(10);
        root.getChildren().addAll(button, textField1);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root.getChildren().removeAll(button,textField1,buttonPlusSong);
                playAndShow(root);

            }
        });

        Button buttonBackToPlayerChoice = new Button("Choose another player");
        buttonBackToPlayerChoice.setTranslateX(600);
        buttonBackToPlayerChoice.setTranslateY(10);
        buttonBackToPlayerChoice.setTextFill(Paint.valueOf("Violet"));
        root.getChildren().addAll(buttonBackToPlayerChoice);
        buttonBackToPlayerChoice.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root.getChildren().clear();
                MainSong ms = new MainSong();
                ms.playerChoice(root);

            }
        });

    }

    @Override
    public void playAndShow(Pane root) {
        super.playAndShow(root);
        super.setSong1(playlist.get(0));
        Button printArray = new Button("Play whole playlist ");
        printArray.setTranslateX(400);
        printArray.setTranslateY(60);

        printArray.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Text text1 = new Text("your playlist: " + Arrays.toString(playlist.toArray()));

                text1.setTranslateX(450);
                text1.setTranslateY(250);
                root.getChildren().addAll(text1);
            }
        });
        root.getChildren().addAll(printArray);
    }

    @Override
    public void playSong() {
        System.out.println("Plying: " + playlist.get(0)  );
    }

    public void playPlaylist (){
        for (int i = 0 ; i<playlist.size() ; i ++)
            System.out.println("Playing: " + playlist.get(i));
    }
}
