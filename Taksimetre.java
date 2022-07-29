package Giris;
import java.util.Scanner;
public class Taksimetre {

	public static void main(String[] args) {
	/* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
	 * Taksimetre KM başına 2.20 TL tutmaktadır.
	 * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
	 * Taksimetre açılış ücreti 10 TL'dir.
	 */
	Scanner inp = new Scanner(System.in);
	System.out.print("Taksi ile gidilen mesafeyi giriniz : ");
	double ucret, mesafe, sonuc, km = 2.20;
	mesafe = inp.nextDouble();
	ucret = 10.0+(mesafe*km);
	boolean min = (ucret<=20.0);
	sonuc = min ? 20.0 : ucret;
	System.out.println("Toplam odenecek tutar : " +sonuc);
	}

}
