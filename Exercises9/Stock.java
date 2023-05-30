package Exercises9;

//Exercise9.2
public class Stock {
    private String symbol;
    private String name;
    double previousClosingPrice;
    double currentPrice;


    Stock(String symbol,String name){
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
        return -((previousClosingPrice - currentPrice) / previousClosingPrice * 100);
    }
}
