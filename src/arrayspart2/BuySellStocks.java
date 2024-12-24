package arrayspart2;

public class BuySellStocks {
	
	public static int buySellStocks(int prices[]) {
		
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i=0; i<prices.length;i++) {
			int sellingPrice = prices[i];
			if(buyPrice < sellingPrice) {
				int profit = sellingPrice - buyPrice; //todays profit
				maxProfit = Math.max(maxProfit, profit);
			}else {
				buyPrice=  sellingPrice;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prices[] = {7,1,5,3,6,4};
		System.out.println("Maximum Profit : "+buySellStocks(prices));

	}

}
