package Giris;
import java.util.Scanner;

public class KDVTutari {

	public static void main(String[] args) {
	/* -Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana
	 * bastıran programı yazın.(Not : KDV tutarını 18% olarak alın)
	 * KDV'siz Fiyat = 10; KDV'li Fiyat = 11.8; KDV tutarı = 1.8;
	 * -Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV
	 * oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
	 */
	Scanner input = new Scanner(System.in);
	double kdvli,kdvsiz,kdv,x=0.18,y=0.08;
	System.out.print("Urunun Fiyatini Giriniz : ");
	kdvsiz = input.nextDouble();
	
	boolean fiyat = (kdvsiz >=0) && (kdvsiz <= 1000);
	double oran = fiyat ? x : y;
	
	kdv = kdvsiz*oran;
	kdvli = kdvsiz+kdv;
	
	System.out.println("KDV\'siz Fiyat : " +kdvsiz);
	System.out.println("KDV Orani : " +oran);
	System.out.println("KDV Tutari : " +kdv);
	System.out.println("KDV\'li Fiyat : " +kdvli);

	}

}
