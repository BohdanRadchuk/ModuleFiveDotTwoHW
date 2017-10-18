package Extra_task_2.Data;


import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class ExpensivePlayersData extends CheapPlayersData {


    /*public String [] getPlaylist() {
                return playlist;
            }*/
    private ArrayList<String> playlist = new ArrayList<>();

    //private String[] playlist = new String[] {null , "The best song", "Good song", "Super Song"};                                 //initializing playlist array
    public ArrayList<String> getPlaylist() {
        return playlist;
    }

    public ExpensivePlayersData(String song2, int price, Pane root) {
        super(song2, price, root);
        //    playlist[0] = song2;
    }

    @Override
    public void show(Pane root) {                                       //переделываем show под миссив песен
        root.getChildren().clear();

        TextField textField1 = new TextField("enter song name");
        textField1.setTranslateX(10);
        textField1.setTranslateY(10);
        Button buttonPlusSong = new Button("one more song");        //добавляет ещё 1 песню в массив
        buttonPlusSong.setTranslateX(200);
        buttonPlusSong.setTranslateY(10);
        root.getChildren().addAll(buttonPlusSong);
        buttonPlusSong.setOnMouseClicked(event -> {
            playlist.add(textField1.getText());
            textField1.setText("");
        });

        Button button = new Button("end your playlist");            //переходим на меню отображения
        button.setTranslateX(350);
        button.setTranslateY(10);
        root.getChildren().addAll(button, textField1);
        button.setOnMouseClicked(event -> {
            root.getChildren().removeAll(button, textField1, buttonPlusSong);
            enterOtherSong(root);
            super.playerPriceShow(root);
            super.playOneSong(root);
        });
        super.backToPlayers(root);                                      //кнопка возврата к выбору плеера

    }

    @Override
    public void enterOtherSong(Pane root) {                                 //сэтим дефаулт песне первый элемент массива и возвращаемся в предыдущее меню
        super.enterOtherSong(root);
        super.setSong1(playlist.get(0));
        playAllSongs(root);
    }

    public void playAllSongs(Pane root) {                                //воспроизводим массив песен
        Button printArray = new Button("Play whole playlist ");
        printArray.setTranslateX(200);
        printArray.setTranslateY(60);

        printArray.setOnMouseClicked(event -> {

            Text text1 = new Text("your playlist: " + Arrays.toString(playlist.toArray()));
            text1.setTranslateX(450);
            text1.setTranslateY(250);
            root.getChildren().addAll(text1);

        });
        root.getChildren().addAll(printArray);
    }

    /*@Override
    public void playSong() {
        System.out.println("Plying: " + playlist.get(0));
    }

    public void playPlaylist() {
        for (int i = 0; i < playlist.size(); i++)
            System.out.println("Playing: " + playlist.get(i));
    }*/
}
