package KosulluIfadeler;

public class SwitchCase {

	public static void main(String[] args) {
		int day = 2;
		
		if(day == 1) {
			System.out.println("Bugun Pazartesi");
		}else if (day == 2) {
			System.out.println("Bugun Sali");
		}else if(day == 3) {
			System.out.println("Bugun Carsamba");
		}else if(day == 4) {
			System.out.println("Bugun Persembe");
		}else if(day == 5) {
			System.out.println("Bugun Cuma");
		}else if(day == 6) {
			System.out.println("Bugun Cumartesi");
		}else if(day == 7) {
			System.out.println("Bugun Pazar");
		}else {
			System.out.println("Hatali Giris Yaptiniz");
		}
		
		/*Switch Case
		 * Break switch komutunu durdurur. Eğer break kullanılmazsa caseleri çalıştırmaya devam eder.
		 * Switch içindeki değişkenle caselerin önündeki sayıyı karşılaştırır uygun komutu çalıştırır.
		 * Switch kısmında kullanılacak olan değişkenler byte, short, int, char veya String veri tipine sahip
		 * olmalıdır.
		 */
		switch(day){
			case 1:
				System.out.println("Bugun Pazartesi");
				break;
			case 2:
				System.out.println("Bugun Sali");
				break;
			case 3:
				System.out.println("Bugun Carsamba");
				break;
			case 4:
				System.out.println("Bugun Persembe");
				break;
			case 5:
				System.out.println("Bugun Cuma");
				break;
			case 6:
				System.out.println("Bugun Cumartesi");
				break;
			case 7:
				System.out.println("Bugun Pazar");
				break;
			default:
				System.out.println("Hatali Giris Yaptiniz");
		}
	}

}
