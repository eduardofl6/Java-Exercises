
public class Exercise2_93 {

	public static void main(String[] args) {
		int actualDay = 2;
		int dayAfters = 100;
		int dayInWeek = (actualDay + dayAfters) % 7;
		System.out.print(dayInWeek);
	}

}
