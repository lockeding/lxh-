import coins.Coin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        coins.Coin Coin = new Coin();
        String name = Coin.getName(amount);
        System.out.println(name);

    }
}
