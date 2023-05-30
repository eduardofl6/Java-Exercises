package Exercises9;

public class Fan9_8 {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST =  3;

    private int speed ;
    private boolean on ;
    private double radius ;

    String color ;

    Fan9_8 (){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed(){
        return speed;        
    }

    public void setSpeed(int num){
        if(num >= 1 && num <= 3){
            speed = num;
        }
    }

    public boolean getOn(){
        return on;
    }

    public void setOn(boolean state){
        on = state;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        if(newRadius > 0)
            radius = newRadius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public String toString(){
        String text = "";
        if(on){
            switch(speed){
                case 1: text+= "Speed: SLOW";break;
                case 2: text+= "Speed: MEDIUM";break;
                case 3: text+= "Speed: FAST";break;
            }
        }

        text += " Color: " + color;
        text += " Radius: " + radius;

        if(!on){
            text+= " fan is off";
        }
        return text;
    }


}
