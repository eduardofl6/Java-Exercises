package Exercises10;

public class Time {
    int hour;
    int minute; 
    int second;

    Time(){
        this(System.currentTimeMillis());
    }

    Time(long n){
        second = (int)(n / 1000) % 60;
        minute = (int)(n / 1000 / 60) % 60;
        hour   = (int)(n / 1000 / 60 / 60) % 24;        
    }

    Time(int hour, int minute, int second){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setTime(long elapseTime){
        second = (int)(elapseTime / 1000) % 60;
        minute = (int)(elapseTime / 1000 / 60) % 60;
        hour   = (int)(elapseTime / 1000 / 60 / 60) % 24;    
    }
}
