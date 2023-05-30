
public class Exercise7_2_8{


    public static void main(String[] args){

        double[] ten = new double[10];

        ten[9] = 5.5;

        System.out.println(ten[0] + ten[1]);

        double sum = 0;
        for(int i = 0; i < ten.length; i++){

            sum += ten[i];
        }

        double min = ten[0];
        for(int i = 1; i < ten.length; i++){
            if(ten[i] < min) min = ten[i];
        }

        System.out.println(ten[(int)(Math.random()  * 10)]);

        double[] initializer = {3.5, 5.5,4.52,5.6};
        display();
    }

    public static void error() {
        double[] r = new double[100];
       
        for (int i = 0; i < r.length; i++)
            r[i] = Math.random() * 100;
        }


         public static void display() {
             int list[] = {1, 2, 3, 4, 5, 6};
             for (int i = 1; i < list.length; i++)
             list[i] = list[i - 1];
            
             for (int i = 0; i < list.length; i++)
             System.out.print(list[i] + " ");
             }
             
}


 