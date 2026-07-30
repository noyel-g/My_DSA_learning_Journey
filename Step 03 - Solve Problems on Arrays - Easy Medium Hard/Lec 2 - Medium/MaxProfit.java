
public class MaxProfit {
    public static void main(String[] args) {
       int [] arr={7,0,7,0,6};
      System.out.println(maxProfit(arr));      
    }

 public static int maxProfit(int[] prices) {
        int len = prices.length;
        int buy = prices[0];
        int profit = 0;
        int temp = -1;

        for (int i = 1; i < len; i++) {
            if (prices[i] <= buy && profit == 0) {
                buy = prices[i];
            } else if (prices[i] < buy) {
                if (temp == -1) {
                    temp = i;
                } else if (prices[temp] > prices[i]) {
                    temp = i;
                }
            }

            if (temp != -1) {
                if (prices[i] - buy < prices[i] - prices[temp]) {
                    buy = prices[temp];
                }
            }

            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }}