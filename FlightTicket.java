package KosulluIfadeler;
import java.util.Scanner;
public class FlightTicket {

	public static void main(String[] args) {
		/* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan
		 * Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret
		 * 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki
		 * koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
		 * -Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise
		 * (1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı
		 * verilmelidir.
		 * -Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
		 * -Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
		 * -Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
		 * -Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
		 */
		Scanner input = new Scanner(System.in);
		double price, price1, km, off, off1, perPrice = 0.10, total;
		int age, tripType;
		
		System.out.print("Enter the trip distance : ");
		km = input.nextDouble();
		System.out.print("Enter your age : ");
		age = input.nextInt();
		System.out.print("Enter the trip type ( 1 -> One Way , 2 -> Round Trip) : ");
		tripType = input.nextInt();
		total = perPrice * km;
		if ((km >= 0) && (age >= 0) && (tripType == 1 || tripType == 2)) {
			if(tripType == 1) {
				if (age < 12) {
					off = (total * 0.5);
				}else if (age > 11 && age < 25) {
					off = (total * 0.1);
				}else if (age > 64) {
					off = (total * 0.3);
				}else {
					off = 0;
				}
				price = total - off;
			}else {
				if (age < 12) {
					off = (total * 0.5);
				}else if (age > 11 && age < 25) {
					off = (total * 0.1);
				}else if (age > 64) {
					off = (total * 0.3);
				}else {
					off = 0;
				}
				price1 = (total - off);
				off1 = (price1 * 0.2);
				price = (price1 - off1) * 2;
			}
			System.out.println("The trip price is : " + price);
		}else {
			System.out.println("You entered incorrectly!");
		}
	}

}
