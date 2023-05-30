package Exercises9;

public class Location {
    int row;
    int column;
    double maxValue;

    double[][] array = new double[3][1];
    Location (){

    }

    Location (int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;

        array[0][0] = maxValue;
        array[1][0] = row;
        array[2][0] = column;
    }

}
