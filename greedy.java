import java.util.*;

public class greedy {
    public static void main(String[] args) {

        int[] coins = {100, 50, 20, 10, 5, 2, 1};
        int amount = 289;

        System.out.println("Coins used:");

        int count = 0;

        for (int coin : coins) {
            while (amount >= coin) {
                amount -= coin;
                count++;
                System.out.print(coin + " ");
            }
        }

        System.out.println("\nMinimum number of coins = " + count);
    }
}
