package Exercises10;

public class MyString2 {
    String content;

    public MyString2(String s){
        content = s;
    }

    public int compare(String s){
        return content.compareTo(s);
    }

    public MyString2 substring(int begin){
        String back = "";

        for(int i = begin; i < content.length();i++){
            back += content.charAt(begin++);
        }

        return new MyString2(back);
    }

    public MyString2 toUpperCase(){
        String upperCase = "";

        for(int i = 0; i < content.length();i++){
            upperCase += (char)(Character.toUpperCase(content.charAt(i)));
        }

        return new MyString2(upperCase);
    }

    public char[] toChars(){
        char[] chars = new char[content.length()];

        for(int i = 0; i < content.length();i++){
            chars[i] = content.charAt(i);
        }

        return chars;
    }

    public static MyString2 valueOf(boolean b){
        if(b){
            return new MyString2("true");
        }
        return new MyString2("false");
    }

}
