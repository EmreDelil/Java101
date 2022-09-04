package KosulluIfadeler;

public class IfElseBlocks {

	public static void main(String[] args) {
	
		int a=10, b=20;
		boolean compare = a==b;
		/*String result = compare ? "Esittir" : "Esit Degildir";
		System.out.println(result);*/
		
		if(compare) {
				System.out.println("Esittir.");
		}
		else {
			System.out.println("Esit Degildir.");
		}
		System.out.println("Program Bitti!");
		
		// Else if istenildiği kadar kullanılabilir
		 int c = 15, d = 25, e = 1;
		 
		 if((c<d)&&(c<e)){
			 System.out.println("C sayisi en kucuk sayidir.");
		 } else if((d<c)&&(d<e)) {
			 System.out.println("D sayisi en kucuk sayidir.");
		 } else {
			 System.out.println("E sayisi en kucuk sayidir.");
		 }
			 
		 // ifler iç içe yazılabilir
		 if(c<d) {
			 if(c<e) {
				 if(c==15) {
					 System.out.println("C sayisi 15'tir.");
				 }
				 System.out.println("C en kucuktur.");
			 }else {
				 System.out.println("C sayisi E'den buyuktur.");
			 }
		 }
	}

}
