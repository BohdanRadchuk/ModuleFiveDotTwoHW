package Data;

public class CheapPlayersData {


    private String song1;
    private final int price;


    public String getSong1() {
        return song1;
    }

    public int getPrice() {
        return price;
    }
    public void setSong1(String song1) {
        this.song1 = song1;
    }

    public CheapPlayersData (String song1, int price){
        this.song1 = song1;
        this.price = price;
    }
    public void playSong(){
        System.out.println("Plying: " + song1);
    }

}
