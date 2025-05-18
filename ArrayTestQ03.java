public class ArrayTestQ03 {
    public static int MaxProfit(int[] num) {
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for (int price : num) {
            if (price < BuyPrice) {
                BuyPrice = price;
            } else {
                int profit = price - BuyPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            }
        }

        return MaxProfit;
    }

    public static void main(String[] args) {
        int num[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + MaxProfit(num));  // Output: 5
    }
}
