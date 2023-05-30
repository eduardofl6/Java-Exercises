package Exercises10;

import java.util.Arrays;

public class Exercise10_25 {
    public static void main(String[] args){
        String[] test =   split("a?b?gf#e", "[?#]");

         System.out.print(Arrays.toString(test));
    }

    public static String[] split(String s, String regex){
        String[] chars = new String[s.length()];

        for(int i = 0; i < chars.length;i++){
            chars[i] = "";
        }

        int b = 0;
            for(int i = 0; i < s.length();i++){

                for(int v = ((regex.charAt(0) == '[') ? 1 : 0); v < ((regex.charAt(regex.length()-1) == ']') ? regex.length()-1 : regex.length());v++){
                    if(s.charAt(i) == regex.charAt(v)){
                        b++;
                        chars[b++] = s.charAt(i++) + "";
                        v = 0;
                    }
                }
                chars[b] += s.charAt(i) + "";
            }
            String[] answer = new String[b+1];
        for(int i = 0; i < answer.length;i++){
            answer[i] = chars[i];
        }

        return answer;
    }
}
