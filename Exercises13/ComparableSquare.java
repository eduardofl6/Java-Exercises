package Exercises13;


public class ComparableSquare extends Square implements Comparable<Square>{

    @Override
    public int compareTo(Square ob){
        if(super.getArea() > ob.getArea())
        return 1;
        else if(super.getArea() < ob.getArea())
        return -1;
        else 
        return 0;
    }
    
}
