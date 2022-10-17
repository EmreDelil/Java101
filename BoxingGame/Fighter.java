package BoxingGame;

public class Fighter {
	String name;
	int health;
	int weight;
	int damage;
	double dodge;
	
	Fighter(String name, int health, int weight, int damage) {
		this.name = name;
		this.health = health;
		this.weight = weight;
		this.damage = damage;
		this.dodge = Math.random() * 100;
	}
	
	int hit(Fighter opposite) {
		if(opposite.Dodge()) {
			System.out.println(opposite.name + " dodges to " + this.name + "'s damage.");
			return opposite.health;
		}else {
			System.out.println(this.name + " hit " + this.damage + " damage to " + opposite.name);
			if(opposite.health - this.damage <= 0) {
				opposite.health = 0;
				return opposite.health;
			}else {				
				return opposite.health -= this.damage;
			}
		}
	}
	
	boolean Dodge() {
		double dodgeValue = Math.random() * 100;
		return dodgeValue <= this.dodge;
	}
	
}
