package Cars;

public class CarModels {
	public static void main(String[] args) {
		// Aynı dosyanın içinde bulunan classlar arasında geçiş yapılıp birbiri altında yazılabilir
		
		/* Constructor metodu parametreli yapabiliriz. Hatta parametreli yapıp içinde tanımladığımız zaman
		 * tüm işlemleri, daha kısa kodlarla daha düzgün kodlar yazılabilir. Overloadingte yapılabilir.
		 */
		
		/* this.nitelik syntaxı önemlidir. this komutu her zaman tanımlanan niteliğin classta tanımlanan
		 * nitelik olduğunu gösterir. Mesela aşağıda model = "ABC" yazdığımız zaman this.model komutunu
		 * kullanırsak abc yi değil de class altında tanımlanan metodu program okur.
		 */
		

		// Kurucu metottur. (Çağrılcak sınıf adı nesne adı = new sınıf ile aynı ada sahip metot) şeklinde olur
		
		Car audi = new Car();
		
		audi.model = "Audi A3";
		System.out.println(audi.model + "'s model is : " + audi.model);
		/* Alttaki işlemde audinin type ı yazılmadı, Car classında yok ve Car() metodunda da olmadığı için
		* null yani yok sonucunu alırız. */
		System.out.println(audi.model + "'s type : " + audi.type);
		audi.type = "Sports";
		System.out.println(audi.model + "'s type : " + audi.type);
		audi.speed = 20;
		audi.increaseSpeed(25);
		audi.increaseSpeed(55);
		audi.increaseSpeed(70);
		// Metotta sınır 180 ve 50 ekleyince sınırı geçeceği için alttaki kod eklenmiyor geçersiz.
		audi.increaseSpeed(25);
		audi.decreaseSpeed(10);
		audi.printSpeed();
		System.out.println("===========================================");
		
		Car bmw = new Car("Bmw M5", 10, "Black");
		
		bmw.printInfo();
		System.out.println("===========================================");
		
		Car mercedes = new Car("Mercedes AMG GT", 30, "Gray");
		
		mercedes.increaseSpeed(35);
		mercedes.decreaseSpeed(10);
		mercedes.printInfo();
		System.out.println("===========================================");
		
		/* İlla tanımlanan nesne altında yazılacak diye bir şey yok. İstenilen şeyi istenilen yerde
		 * çağrılabilir. */
		 System.out.println("Audi's type is : " + audi.type);
	}
}
