/**
 *
 * @author talha
 */

public class testStock {

    public static Stock[] stocks = new Stock[5];
    public static Stock[] myStocks = new Stock[5]; //to buy stock we create stock array as well.
    public static double myMoney = 1000;

    public static void main(String[] args) {
        Stock s0 = new Stock(100, "Computer", "COMP");
        Stock s1 = new Stock(43000, "Bitcoin", "BTC");
        Stock s2 = new Stock(410, "Binance", "BNB");
        Stock s3 = new Stock(0.16, "Harmony", "ONE");
        Stock s4 = new Stock(3.3, "Sandbox", "SAND");

        stocks[0] = s0;
        stocks[1] = s1;
        stocks[2] = s2;
        stocks[3] = s3;
        stocks[4] = s4;
        listAllStocks();
        System.out.println("--------------");
        /*buyMinStock();
        buyStock("E");
        listMyStocks();*/
    }

    public static void listAllStocks() {
        if (stocks[0] != null) {
            for (int i = 0; i < stocks.length; i++) {
                System.out.println(stocks[i]);
            }
        }
    }

}
