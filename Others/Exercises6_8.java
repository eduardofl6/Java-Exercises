
public class Exercises6_8 {

	public static void main(String[] args) {
		
		test(1);
	}
	
	// two methods can't have the same method signature
	public static void test1(int va) {
		
	}
	public static void test(int n2) {
		
	}
	
	
	
	//Given two method definitions,
	
	//public static double m(double x, double y)
	
	//public static double m(int x, double y)
	
	//tell which of the two methods is invoked for:
	
	//a. double z = m(4, 5); m(int,double)
	//b. double z = m(4, 5.4); m(int,double)
	//c. double z = m(4.5, 5.4); m(double,double)
}
