package Extra_task_2;

import Extra_task_2.Players.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MainSong extends Application{
    public static void main(String[] args) {
        launch (args);
/*

        Player1 player1 = new Player1("ok song",500);
        System.out.println("player1 price = " + player1.getPrice());
        player1.playSong();
        Player2 player2 = new Player2("ok song",500);
        player2.playSong();
        Player3 player3 = new Player3("sadasdaong", 600);
        System.out.println( player3.getPrice());
        player3.playSong();
        player3.playPlaylist();
        Player4 player4 = new Player4("sadasdaong", 600);
        System.out.println( player4.getPrice());
        player4.playSong();
        player4.playPlaylist();
        Player5 player5 = new Player5("what a song", 700);
        System.out.println( player5.getPrice());
        player5.playSong();
        player5.playPlaylist();
        Player6 player6 = new Player6("what a song", 800);
        System.out.println( player6.getPrice());
        player6.playSong();
        player6.shuffle();
        player6.playPlaylist();


*/

    }


    public void  playerChoice (Pane root){

        Button button = new Button("Player 1");
        button.setTranslateX(250);
        button.setTranslateY(10);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Player1 player1 = new Player1("ok song",500);
                System.out.println("player1 price = " + player1.getPrice());
                player1.playSong();
            }
        });
                root.getChildren().addAll(button); // , borderPane);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        playerChoice(root);
    }
}