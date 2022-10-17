package BoxingGame;

public class Ring {
	Fighter F1;
	Fighter F2;
	int i;
	
	Ring(Fighter F1,Fighter F2) {
		this.F1 = F1;
		this.F2 = F2;
		this.i = 1;
	}
	
	void run() {
		if(checkweight()) {
			while(true) {
				if(firstHit() < 50) {
					System.out.println("Round "+ i++);
					System.out.println(this.F1.name + "'s hit!");
					this.F1.hit(this.F2);
					printScore();
					System.out.println();
					if(isWin()) {
						break;
					}
				}else {
					System.out.println("Round " + i++);
					System.out.println(this.F2.name + "'s hit!");
					this.F2.hit(this.F1);
					printScore();
					System.out.println();
					if(isWin()) {
						break;
					}
				}
			}
		}else {
			System.out.println("The fighters can not fight each other. They weight's are not suitable.");
		}
	}
	
	double firstHit() {
		return Math.random() * 100;
	}
	
	boolean checkweight() {
		int difference = this.F1.weight - this.F2.weight;
		return (difference >= -10 && difference <= 10);
	}
	
	boolean isWin() {
		if(this.F1.health <= 0) {
			System.out.println(this.F2.name + " is the WINNER!!!");
			return true;
		}else if (this.F2.health <= 0) {
			System.out.println(this.F1.name + " is the WINNER!!!");
			return true;
		}
		return false;
	}
	void printScore() {
		System.out.println(this.F1.name + "'s health\t: " + this.F1.health);
		System.out.println(this.F2.name + "'s health\t: " + this.F2.health);
	}
	
}
