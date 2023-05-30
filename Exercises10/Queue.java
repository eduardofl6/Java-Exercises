package Exercises10;

public class Queue {
    private int[] elements;
    private int size = 0;

    Queue(){
        elements = new int[8];
    }

    public void enqueue(int v){
     if(size < elements.length){
         elements[size] = v;
         size++;
     }else{
        int[] backup = new int[elements.length * 2];
        for(int i = 0; i < elements.length;i++){
            backup[i] = elements[i];
        } 
        elements = backup;
        elements[size++] = v;
     }


     
    }

    public int  dequeue(){
        int temp = elements[0];
        for(int i = 1; i < elements.length;i++){
            elements[i-1] = elements[i];
        }
        size--;
        return temp;
    }

    public boolean empty(){
        if(size < 1){
            return true;
        }
        return false;
    }

    public int getSize(){
        return size;
    }
}
