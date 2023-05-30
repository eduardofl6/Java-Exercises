package Exercises9;

public class TesetingStock9_2 {
    public static void main(String[] args){
        Stock object = new Stock("ORCl","Oracle Corporation");
        object.previousClosingPrice = 34.5;
        object.currentPrice = 34.35;

        System.out.printf("Difference %s%.2f",((object.getChangePercent() < 0) ? "-%" : "+%"),((object.getChangePercent() < 0) ? object.getChangePercent() * -1 : object.getChangePercent()));
    }
}
