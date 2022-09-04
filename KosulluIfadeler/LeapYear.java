package KosulluIfadeler;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		/* Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
		 * 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
		 * 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
		 * Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
		 * Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik
		 * yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
		 */
		int year;
		boolean isError;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter a year : ");
		year = inp.nextInt();
		
		if (year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					isError = false;
				}else {
					isError = true;
				}
			}else {
				isError = false;
			}
		}else {
			isError = true;
		}
		if(isError) {
			System.out.println(year + " is not a leap year.");
		}else {
			System.out.println(year + " is a leap year.");
		}
	}

}
