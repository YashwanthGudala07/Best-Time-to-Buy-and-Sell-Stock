import java.util.Scanner;

public class besttime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int min_value = Integer.MAX_VALUE;
        int profit = 0;
        int curr_profit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min_value) {
                min_value = arr[i];
            }

            curr_profit = arr[i] - min_value;

            if (curr_profit > profit) {
                profit = curr_profit;
            }

        }
        System.out.println(profit);
    }
}