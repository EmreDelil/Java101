package MinesweeperGame;
import java.util.Scanner;
import java.util.Arrays;

public class Minesweeper {

	/* Mayın Tarlası oyunu yapmanızı bekliyoruz.
	 * Oyun Kuralları :
		- Oyun metin tabanlıdır.
		- Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
		- Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
		- Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda
		ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı
		12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
		- Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
		- Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta
		istenmeli.
		- Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
		- Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst
		çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya
		değen herhangi bir mayın yok ise "0" değeri atanmalı.
		- Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
	*/
	
	public static void run(String[][] mine, int dimension, int dimension2, int[][] game, int mineNumber) {
		int choice1, choice2, maxLoop = 0, choosenCounter = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Minesweeper game!");
		
		String[][] empty = new String[dimension][dimension2];
		for(int i = 0; i < empty.length; i++) {
			for(int j = 0; j < empty[i].length; j++) {
				empty[i][j] = "-";
			}
		}
		
		for(String[] i: empty) {
			for(String j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		int[][] choosen = new int[dimension][dimension2];
		
		while(maxLoop < ((dimension * dimension2) - mineNumber)) {
			System.out.print("Please choose a place for the player to go :");
			choice1 = scan.nextInt();
			choice2 = scan.nextInt();
			
			
			if(!((choice1 > 0 && choice1 <= dimension) && (choice2 > 0 && choice2 <= dimension2))) {
				System.out.println("Your choice is not in boundary of the game area. Please try again.");
				System.out.println("Boundary of the game area is : "+ dimension + " x "+ dimension2);
				continue;
			}else {
				choosen[choice1-1][choice2-1] = 1;
				if(isMine(mine,choice1,choice2)) {
					System.out.println("You lost the game.");
					System.out.println("Here are the mines!");
					for(int k = 0; k < game.length; k++) {
						for(int l = 0; l < game[k].length; l++) {
							if(((game[k][l] == 0) && (choosen[k][l] == 1)) && !(mine[k][l].equals("*"))) {
								System.out.print(game[k][l] + " ");
							}else if (game[k][l] != 0){
								System.out.print(game[k][l] + " ");
							}else {
								System.out.print(mine[k][l] + " ");
							}
						}
						System.out.println();
					}
					break;
				}else {
					game[choice1-1][choice2-1] = mineNumber(mine,choice1,choice2);
					maxLoop++;
					
					choosenCounter = 0;
					for(int[] i: choosen) {
						for(int j: i) {
							if(j == 1)
								choosenCounter++;
						}
					}
					if(maxLoop != choosenCounter) {
						System.out.println("You already choosen this point. Please choose another place.");
						maxLoop--;
						continue;
					}
					
					for(int k = 0; k < game.length; k++) {
						for(int l = 0; l < game[k].length; l++) {
							if((game[k][l] == 0) && (choosen[k][l] == 1)) {
								System.out.print(game[k][l] + " ");
							}else if(game[k][l] != 0) {
								System.out.print(game[k][l] + " ");
							}else {
								System.out.print(empty[k][l] + " ");
							}
						}
						System.out.println();
					}
				}
			}
						
			if(maxLoop == ((dimension * dimension2) - mineNumber)) {
				System.out.println("Congratulations! You win the game!");
				System.out.println("Here are the mines!");
				for(int k = 0; k < game.length; k++) {
					for(int l = 0; l < game[k].length; l++) {
						if(mine[k][l].equals("*")) {
							System.out.print(mine[k][l] + " ");
						}else {
							System.out.print(game[k][l] + " ");
						}
					}
					System.out.println();
				}
			}
		}
		scan.close();
	}
	
	public static int mineNumber(String[][] mine, int choice1, int choice2) {
		int isMine = 0;
		for(int a = 0; a < mine.length; a++) {
			for(int b = 0; b < mine[a].length; b++) {
				if((a >= (choice1-2)) && (a <= (choice1)) && ((b >= (choice2-2)) && (b <= (choice2)))) {
					if(mine[a][b].equals("*"))
						isMine++;
				}
			}
		}
		return isMine;
	}
	
	public static boolean isMine(String[][] mine, int choice1, int choice2) {
		if((mine[choice1-1][choice2-1]).equals("*"))
			return true;
		return false;
	}
	
	public static String[][] mines(int mineNumber, String[][] mine, int dimension, int dimension2) {
		int star = 0;
		for(int i = 0; i < mineNumber; i++) {
			mine[(int)(Math.random()*dimension)][(int)(Math.random()*dimension2)] = "*";
			star = 0;
			for(int j = 0; j < mine.length; j++) {
				for(int k = 0; k < mine[j].length; k++) {
					if(mine[j][k] == "*") {
						star++;
					}
				}
			}
			if(star == (i)) i--;
		}
		for(int j = 0; j < mine.length; j++) {
			for(int k = 0; k < mine[j].length; k++) {
				if(mine[j][k] != "*") {
					mine[j][k] = "-";
				}
			}
		}
		return mine;
	}
	
}
