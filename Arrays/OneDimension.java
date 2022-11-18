package Arrays;

public class OneDimension {

	public static void main(String[] args) {
		// Farklı kullanılabilecek syntaxlar : 
		String[] days = {"Pazartesi" , "Sali" , "Carsamba" , "Persembe" , "Cuma"};
		String[] weekendDays = new String[] {"Cumartesi" , "Pazar"};
		
		
		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}

		days[0] = "Day changed";
		
		System.out.println("");
		System.out.println(weekendDays[1]);
		System.out.println(days.length);
		System.out.println(days[0]);
	}

}
