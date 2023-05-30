public class Exercise3_111 {

	public static void main(String[] args) {
		int year = 500;
		int year1 = 1000;
		int year2 = 2000;
		int year3 = 2016;
		int year4 = 2020;
		
		boolean y = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		boolean y1 = (year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0);
		boolean y2 = (year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0);
		boolean y3 = (year3 % 4 == 0 && year3 % 100 != 0) || (year3 % 400 == 0);
		boolean y4 = (year4 % 4 == 0 && year4 % 100 != 0) || (year4 % 400 == 0);

		System.out.println(year + " is a leap year? " + y);
		System.out.println(year1 + " is a leap year? " + y1);
		System.out.println(year2 + " is a leap year? " + y2);
		System.out.println(year3 + " is a leap year? " + y3);
		System.out.println(year4 + " is a leap year? " + y4);
	}

}
