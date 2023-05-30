package Exercises10;

import java.math.BigDecimal;

public class exercise10_21 {
    public static void main(String[] args){
        BigDecimal value = new BigDecimal(Long.MAX_VALUE);
        
        BigDecimal six = new BigDecimal(6);
        BigDecimal five = new BigDecimal(5);

        for(int i = 0; i < 5;){
            if((value.remainder(six)).equals(BigDecimal.ZERO) || (value.remainder(five)).equals(BigDecimal.ZERO) ){
                System.out.println(value.toString());
                i++;
            }
            value = value.add(BigDecimal.ONE);
        }

        MyString1 hello = new MyString1(new char[]{'H','2','L','L','O'});
        for(int i = 0; i < hello.valueOf(91283752).text.length; i++){
            System.out.println(MyString1.valueOf(91283752).text[i]  );
        }

    }
}
