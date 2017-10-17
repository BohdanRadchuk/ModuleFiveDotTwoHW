package Extra_task_2;


import Extra_task_2.Players.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
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

        Button button1 = new Button("Player 1");
        button1.setTranslateX(100);
        button1.setTranslateY(10);
        button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                Player1 player1 = new Player1("default song",400,root);

            }
        });
        Button button2 = new Button("Player 2");
        button2.setTextFill(Paint.valueOf("red"));
        button2.setTranslateX(200);
        button2.setTranslateY(10);
        button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Player2 player2 = new Player2("default song",500, root);

            }
        });
        Button button3 = new Button("Player 3");
        button3.setTextFill(Paint.valueOf("green"));
        button3.setTranslateX(300);
        button3.setTranslateY(10);
        button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Player3 player3 = new Player3("default song",600, root);

            }
        });
        Button button4 = new Button("Player 4");
        button4.setTextFill(Paint.valueOf("Yellow"));
        button4.setTranslateX(100);
        button4.setTranslateY(60);
        button4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Player4 player4 = new Player4("default song",700, root);

            }
        });
        Button button5 = new Button("Player 5");
        button5.setTextFill(Paint.valueOf("blue"));
        button5.setTranslateX(200);
        button5.setTranslateY(60);
        button5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Player5 player5 = new Player5("default song",800, root);

            }
        });
        Button button6 = new Button("Player 6");
        button6.setTextFill(Paint.valueOf("cyan"));
        button6.setTranslateX(300);
        button6.setTranslateY(60);
        button6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Player6 player6 = new Player6("default song",999, root);

            }
        });
        root.getChildren().addAll(button1,button2,button3,button4,button5,button6);
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
