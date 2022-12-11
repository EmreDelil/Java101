package Arrays;

public class LetterByMultiDimension {

	public static void main(String[] args) {
		// Çok Boyutlu Diziler ile A Harfi Yazdıran Program
		String[][] list = new String[6][4];
		
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list[i].length; j++) {
				if(i == 0 || i == 2) {
					list[i][j] = " * ";
				}
				if(j == 0 || j == 3) {
					list[i][j] = " * ";
				}
				if(!(list[i][j] == " * ")) {
					list[i][j] = "   ";
				}
			}
		}
		for(String[] row: list) {
			for(String col: row) {
				System.out.print(col);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		// Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.
		
		String[][] list2 = new String[7][5];
		
		for(int a = 0; a < list2.length; a++) {
			for(int b = 0; b < list2[a].length; b++) {
				if(a == 0 || a == 3 || a == 6) {
					if(a == 3 && b == 4) {
						list2[a][b] = "   ";
					}else {
						list2[a][b] = " * ";
					}
				}else if(b == 0 || b == 4) {
					list2[a][b] = " * ";
				}else {
					list2[a][b] = "   ";
				}
			}
		}
		for(String[] row: list2) {
			for(String col: row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
