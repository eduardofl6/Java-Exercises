package Exercises10;

public class Exercise10_1 {
    public static void main(String[] args){
        Time now = new Time();
        Time five = new Time(555550000);
        Time three = new Time(5, 23, 55);
    
    System.out.format("Hour:%-2d \tMinute:%d\tSecond:%d\n",now.getHour(),now.getMinute(),now.getSecond());
    System.out.format("Hour:%-2d \tMinute:%d\tSecond:%d\n",five.getHour(),five.getMinute(),five.getSecond());
    System.out.format("Hour:%-2d \tMinute:%d\tSecond:%d\n",three.getHour(),three.getMinute(),three.getSecond());
    

}

}
