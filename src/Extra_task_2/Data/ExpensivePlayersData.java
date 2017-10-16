package Extra_task_2.Data;


public class ExpensivePlayersData extends CheapPlayersData {


    public String [] getPlaylist() {
        return playlist;
    }

    private String[] playlist = new String[] {null , "The best song", "Good song", "Super Song"};                                 //initializing playlist array

    public ExpensivePlayersData(String song2, int price) {
        super(song2, price);
        playlist[0] = song2;

    }

    @Override
    public void playSong() {
        System.out.println("Plying: " + playlist[0]  );
    }

    public void playPlaylist (){
        for (int i = 0 ; i<playlist.length ; i ++)
            System.out.println("Playing: " + playlist[i]);
    }
}
