package Exercises10;

public class MyString1 {
    char[] text;    

    public MyString1(char[] chars){
        text = chars;
    }
        
    public char charAt(int index){
        return text[index];
    }

    public int length(){
        return text.length;
    }

    public MyString1 substring(int begin, int end){
        char[] substring = new char[end - begin + 1];

        for(int i = 0; begin <= end; begin++){
            substring[i++] = text[begin];
        }

        return new MyString1(substring);
    }

    public MyString1 toLowerCase(){
        char[] lowerCase = new char[text.length];
        
        for(int i = 0; i < text.length;i++){
            lowerCase[i] = Character.toLowerCase(text[i]);
        }
    return new MyString1(lowerCase);
    }

    public boolean equals(MyString1 s){

        if(s.text.length != text.length)
        return false;

        for(int i = 0; i < text.length; i++){
            if(s.text[i] != text[i])
                return false;
        }
    
        return true;
    }

    public static MyString1 valueOf(int i){
        int count = 0;
        for(int v = i; v != 0; v/= 10,count++);
        
        char[] text = new char[count];

        for(int v = 0; v < text.length;v++){
            text[v] = (char) (i % 10 + '0');
            i /= 10;
        }

        char[] temp = new char[text.length];
        for(int v = 0,t = text.length -1; v < temp.length;v++){
            temp[v] = text[t--];
        }

        return new MyString1(temp);
    }
}
