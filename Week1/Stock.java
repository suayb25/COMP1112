import java.util.Random;

/**
 *
 * @author talha
 */

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    public Stock(double pcp, String n, String s) {
        this.previousClosingPrice = pcp;
        this.name = n;
        this.symbol = s;

        Random rnd = new Random();
        double change = rnd.nextDouble(); // Or you can use Math.random() //Look line 25
        boolean plusOrMinus = rnd.nextBoolean();

        if(plusOrMinus) {
            currentPrice = previousClosingPrice + change * previousClosingPrice;//
            //currentPrice = previousClosingPrice + Math.random() * previousClosingPrice;
        }else {
            currentPrice = previousClosingPrice - change * previousClosingPrice;
        }
    }
    
    public double getChangePercent(){
        return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", previousClosingPrice=" + previousClosingPrice +
                ", currentPrice=" + currentPrice +
                '}';
    }
}
