package Exercises9;

public class TestingFan9_8 {
    public static void main(String[] args){
        Fan9_8 fanOne = new Fan9_8();
        Fan9_8 fanTwo = new Fan9_8();
    
        fanOne.setSpeed(3);
        fanOne.setRadius(10);
        fanOne.setColor("yellow");
        fanOne.setOn(true);
        
        fanTwo.setSpeed(3);
        fanTwo.setRadius(5);
        fanTwo.setOn(false);

        System.out.println(fanOne.toString());
        System.out.println(fanTwo.toString());
    }
}
