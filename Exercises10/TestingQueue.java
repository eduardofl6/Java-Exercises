package Exercises10;

public class TestingQueue {
    public static void main(String[] args){
        Queue queue = new Queue();

        for(int i = 1; i <= 20; i++){
            queue.enqueue(i);
        }
        for(int i = 0; i < 20; i++){
            System.out.println(queue.dequeue()+" "+queue.getSize());
        }
    
    }
}
