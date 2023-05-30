package Exercises10;

public class Exercise10_14 {
    public static void main(String[] args){
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println(date1.getYear() + " " + date1.getMonth() + " " + date1.getDay());
        System.out.println(date2.getYear() + " " + date2.getMonth() + " " + date2.getDay());

        date2.setDate(561555550000L);
        System.out.println(date2.getYear() + " " + date2.getMonth() + " " + date2.getDay());

    }
}
