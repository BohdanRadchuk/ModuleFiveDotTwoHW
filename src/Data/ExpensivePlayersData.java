package Data;

import java.util.Scanner;

public class ExpensivePlayersData extends CheapPlayersData {
int n;
private String [] playlist = new String[n];                                 //initializing playlist array

    public ExpensivePlayersData(String song1, int price, int n) {           //n=arraysize
        super(song1, price);
        this.n = n;
        arrayinit();
    }
    public void  arrayinit (){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < n ; i++){
            playlist[n] = scanner.nextLine();

        }

    }
}
