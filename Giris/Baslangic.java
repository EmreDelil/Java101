package Giris;

public class Baslangic {
	public static void main(String[] args) {
		// Print normal yazdırır ln eklenirse sonraki geleni alt satıra atar
		
		System.out.print("Hello World!\n");
		
		System.out.print("Java101 Patikası");
		System.out.print("Başlıyoruz\n");
		
		System.out.println("Java101 Patikası");
		System.out.print("Başlıyoruz\n");
		
		System.out.println("Java101 Patikası\nBaşlıyoruz\n\n");
		
		/* \t tab boşluk ekler, \b backspace ekler, \n alt satıra geçer, \r satır başı ekler
		\f sayfa sonu belirtir, \' tek tırnak ekler, \" çift tırnak ekler, \\ ters eğik çizgi ekler */
		
		System.out.println("Java101\tPatikası");
		System.out.println("Java101\bPatikası");
		System.out.println("Java101\rPatikası");
		System.out.println("Java101 \'Patikası\'");
		System.out.println("Java101 \"Patikası\"");
		System.out.println("Java101 \\Patikası\\");
		
		// Javadoc dosyası açıklamaları belgeler.
		/**
		 * @author class ı yazan kişi
		 * {@code} methodun kullanım örneğini vermek için
		 * @exception metot istisnası ve açıklaması
		 * @param değişkenler, değişken tipleri ve bu değişkenlerin açıklamaları
		 * @return metottan bir değer dönüyorsa açıklaması
		 * @see başka bir metod ya da açıklamaya referans göstermek için kullanılır
		 * @since metodun oluşturma tarihi
		 * @version sınıfın version numarası
		 */
		// Bir Javadoc örneği :
		/**
		 * @author M.Mustafa Çetindağ - 11.Nis.2021
		 */
		// public class AciklamaSatirOrnegi {
		/**
		 * Verilen sayının karekökünü bularak döndürür
		 * Sayının sıfırdan küçük olmadığını varsayar
		 * 
		 * @param sayi Karekökü alınacak sayı
		 * @return Sayının karekökü
		 *//* public double karakok (double sayi) {
		 *	double kkok = 0;
			// burada karekök bulma algoritmasının çalıştığını kabul edelimreturn kkok;
			 */
	}
}