package Extra_task_2.Data;

import Extra_task_2.MainSong;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

public class CheapPlayersData {


    private String song1;
    private final int price;
    private String songTemp;
    Text text;
    Text text1;

    public String getSongTemp() {
        return songTemp;
    }

    public void setSongTemp(String songTemp) {
        this.songTemp = songTemp;
    }


  /*  public String getSong1() {
        return song1;
    }
*/
    public int getPrice() {
        return price;
    }

    public void setSong1(String song1) {
        this.song1 = song1;
    }

    public CheapPlayersData(String song1, int price, Pane root) {
        this.song1 = song1;
        this.price = price;
        show(root);

    }
    /*public void playSong() {
        System.out.println("Plying: " + song1);
    }
*/
    public void show(Pane root) {
        root.getChildren().clear();
        backToPlayers(root);
        TextField textField1 = new TextField("enter song name");
        textField1.setTranslateX(10);
        textField1.setTranslateY(10);

        Button button = new Button("Accept data");                      //забираем название песни из текстфилда
        button.setTranslateX(200);
        button.setTranslateY(10);
        root.getChildren().addAll(button, textField1);
        button.setOnMouseClicked(event -> {
            setSongTemp(textField1.getText());
            setSong1(getSongTemp());
            root.getChildren().remove(button);
            root.getChildren().remove(textField1);
            enterOtherSong(root);
            playOneSong(root);
            playerPriceShow(root);
        });
    }

    public void backToPlayers(Pane root) {
        Button buttonBackToPlayerChoice = new Button("Choose another player");      //переход на главное меню
        buttonBackToPlayerChoice.setTranslateX(600);
        buttonBackToPlayerChoice.setTranslateY(10);
        buttonBackToPlayerChoice.setTextFill(Paint.valueOf("Violet"));
        root.getChildren().addAll(buttonBackToPlayerChoice);
        buttonBackToPlayerChoice.setOnMouseClicked(event -> {
            root.getChildren().clear();
            MainSong ms = new MainSong();
            ms.playerChoice(root);

        });
    }

    public void enterOtherSong(Pane root) {
        Button newSong = new Button("do you want to enter other song?");            //вход к вводу песни
        newSong.setTranslateX(400);
        newSong.setTranslateY(10);
        root.getChildren().addAll(newSong);
        newSong.setOnMouseClicked(event -> show(root));
    }
    public void playOneSong(Pane root){
        Button playsong = new Button("Play song");                                  //выводим название песни
        playsong.setTranslateX(200);
        playsong.setTranslateY(10);
        playsong.setOnMouseClicked(event -> {
            root.getChildren().remove(text);
            text = new Text("Plaing " + song1);
            text.setTranslateX(250);
            text.setTranslateY(250);
            root.getChildren().addAll(text);
        });
        root.getChildren().addAll(playsong);

    }
        public void playerPriceShow(Pane root){
        Button printPrice = new Button("Player price");                         //выводим стоимость плеера
        printPrice.setTranslateX(300);
        printPrice.setTranslateY(10);

        printPrice.setOnMouseClicked(event -> {
            root.getChildren().remove(text1);
            text1 = new Text("This player price is " + price);

            text1.setTranslateX(250);
            text1.setTranslateY(200);
            root.getChildren().addAll(text1);
        });
        root.getChildren().addAll(printPrice);
    }
}

