
public class Exercise12_6_1 {
    public static void main(String[] args) {
        try {
        method();
        System.out.println("After the method call");
        }
        catch (RuntimeException ex) {
        System.out.println("RuntimeException in main");
        }
        catch (Exception ex) {
        System.out.println("Exception in main");
        }
        }
        static void method() throws Exception {
        try {
        CircleWithCustomException c1 = new CircleWithCustomException(1.0);
        c1.setRadius(-1.0);
        System.out.println(c1.getRadius());
        }
        catch (RuntimeException ex) {
        System.out.println("RuntimeException in method()");
        }
        catch (Exception ex) {
        System.out.println("Exception in method()");
        throw ex;
        }
        }
    }