package Extra_task_2.Players;

import Extra_task_2.Data.ExpensivePlayersData;

public class Player6 extends ExpensivePlayersData {
    public Player6(String song2, int price) {
        super(song2, price);
    }

    public void shuffle(){
        for (int i =0 ; i<getPlaylist().length; i ++){
            int n = (int) Math.round(-0.4999 + i  + Math.random()*(getPlaylist().length-0.0002-i));             // -0.4999 & +(.length-0.0002) сравнивают шансы выпадения граничных значений (0 и последнего элемента массива)
            String temp = getPlaylist()[i];
            getPlaylist()[i] = getPlaylist()[n];
            getPlaylist() [n] = temp;
        }
    }
}
